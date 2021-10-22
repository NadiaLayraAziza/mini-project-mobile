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

public class SemikonduktorActivity extends AppCompatActivity {
    private RecyclerView rvSemikonduktor;
    private ArrayList<Perusahaan> list = new ArrayList<>();
    PerusahaanAdapter perusahaanAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semikonduktor);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Semikonduktor");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rvSemikonduktor = findViewById(R.id.Rv_Semikonduktor);
        rvSemikonduktor.setHasFixedSize(true);

        list.addAll(SemikonduktorData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    private void showRecyclerList() {
        rvSemikonduktor.setLayoutManager(new LinearLayoutManager(this));
        perusahaanAdapter = new PerusahaanAdapter(list);
        rvSemikonduktor.setAdapter(perusahaanAdapter);

        perusahaanAdapter.setOnItemClickCallback(new PerusahaanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Perusahaan p) {
                Intent moveIntent = new Intent(SemikonduktorActivity.this, DetailActivity.class);
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