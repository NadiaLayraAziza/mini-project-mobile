package org.aplas.mini_project_nadialayraaziza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class HardwareActivity extends AppCompatActivity {
    private RecyclerView rvHardware;
    private ArrayList<Perusahaan> list = new ArrayList<>();
    PerusahaanAdapter perusahaanAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Hardware dan Tech.Device");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rvHardware = findViewById(R.id.Rv_Hardware);
        rvHardware.setHasFixedSize(true);

        list.addAll(HardwareData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    private void showRecyclerList() {
        rvHardware.setLayoutManager(new LinearLayoutManager(this));
        perusahaanAdapter = new PerusahaanAdapter(list);
        rvHardware.setAdapter(perusahaanAdapter);

        perusahaanAdapter.setOnItemClickCallback(new PerusahaanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Perusahaan p) {
                Intent moveIntent = new Intent(HardwareActivity.this, DetailActivity.class);
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