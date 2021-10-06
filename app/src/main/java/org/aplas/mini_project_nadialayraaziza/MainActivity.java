package org.aplas.mini_project_nadialayraaziza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPerusahaan;
    private ArrayList<Perusahaan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPerusahaan = findViewById(R.id.Rv_Perusahaan);
        rvPerusahaan.setHasFixedSize(true);

        list.addAll(PerusahaanData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPerusahaan.setLayoutManager(new LinearLayoutManager(this));
        PerusahaanAdapter perusahaanAdapter = new PerusahaanAdapter(list);
        rvPerusahaan.setAdapter(perusahaanAdapter);

        perusahaanAdapter.setOnItemClickCallback(new PerusahaanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Perusahaan p) {
                Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);
                moveIntent.putExtra(DetailActivity.ITEM_EXTRA, p);
                startActivity(moveIntent);
            }
        });
    }
}