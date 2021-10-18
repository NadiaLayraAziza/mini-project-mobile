package org.aplas.mini_project_nadialayraaziza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class SoftwareActivity extends AppCompatActivity {
    private RecyclerView rvSoftware;
    private ArrayList<Perusahaan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Software dan Layanan IT");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rvSoftware = findViewById(R.id.Rv_Software);
        rvSoftware.setHasFixedSize(true);

        list.addAll(SoftwareData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    private void showRecyclerList() {
        rvSoftware.setLayoutManager(new LinearLayoutManager(this));
        PerusahaanAdapter perusahaanAdapter = new PerusahaanAdapter(list);
        rvSoftware.setAdapter(perusahaanAdapter);

        perusahaanAdapter.setOnItemClickCallback(new PerusahaanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Perusahaan p) {
                Intent moveIntent = new Intent(SoftwareActivity.this, DetailActivity.class);
                moveIntent.putExtra(DetailActivity.ITEM_EXTRA, p);
                startActivity(moveIntent);
            }
        });
    }
}