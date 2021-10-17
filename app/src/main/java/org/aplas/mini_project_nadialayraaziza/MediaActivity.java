package org.aplas.mini_project_nadialayraaziza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MediaActivity extends AppCompatActivity {
    private RecyclerView rvMedia;
    private ArrayList<Perusahaan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Perusahaan IT Jenis Media");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rvMedia = findViewById(R.id.Rv_Media);
        rvMedia.setHasFixedSize(true);

        list.addAll(MediaData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    private void showRecyclerList() {
        rvMedia.setLayoutManager(new LinearLayoutManager(this));
        PerusahaanAdapter perusahaanAdapter = new PerusahaanAdapter(list);
        rvMedia.setAdapter(perusahaanAdapter);

        perusahaanAdapter.setOnItemClickCallback(new PerusahaanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Perusahaan p) {
                Intent moveIntent = new Intent(MediaActivity.this, DetailActivity.class);
                moveIntent.putExtra(DetailActivity.ITEM_EXTRA, p);
                startActivity(moveIntent);
            }
        });
    }
}