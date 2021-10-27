package org.aplas.mini_project_nadialayraaziza;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MediaActivity extends AppCompatActivity {
    private RecyclerView rvMedia;
    private ArrayList<Perusahaan> list = new ArrayList<>();
    PerusahaanAdapter perusahaanAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Media");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rvMedia = findViewById(R.id.Rv_Media);
        rvMedia.setHasFixedSize(true);

        list.addAll(MediaData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    private void showRecyclerList() {
        rvMedia.setLayoutManager(new LinearLayoutManager(this));
        perusahaanAdapter = new PerusahaanAdapter(list);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu, menu);
        MenuItem item = menu.findItem(R.id.item_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                perusahaanAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}