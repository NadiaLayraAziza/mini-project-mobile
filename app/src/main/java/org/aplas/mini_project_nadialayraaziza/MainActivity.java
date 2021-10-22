package org.aplas.mini_project_nadialayraaziza;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MeowBottomNavigation bottomNavigation;
    private RecyclerView rvPerusahaan;
    private ArrayList<Perusahaan> list = new ArrayList<>();
    PerusahaanAdapter perusahaanAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_baseline_list_24));

        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment = null;
                switch (item.getId()) {
                    case 1:
                        fragment = new HomeFragment();
                        getSupportActionBar().setTitle("Halaman Home");
                        break;
                    case 2:
                        fragment = new ListFragment();
                        getSupportActionBar().setTitle("Halaman All List");
                        break;
                }
                loadFragment(fragment);
            }

        });

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {

            }
        });

        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {

            }
        });

//        rvPerusahaan = findViewById(R.id.Rv_Perusahaan);
//        rvPerusahaan.setHasFixedSize(true);
//
        list.addAll(PerusahaanData.getListData());
//        showRecyclerList();
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

    private void showRecyclerList() {
        rvPerusahaan.setLayoutManager(new LinearLayoutManager(this));
        perusahaanAdapter = new PerusahaanAdapter(list);
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