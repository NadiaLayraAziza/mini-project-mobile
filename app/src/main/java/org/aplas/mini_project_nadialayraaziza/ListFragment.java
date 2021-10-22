package org.aplas.mini_project_nadialayraaziza;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ListFragment extends Fragment {
    RecyclerView rvPerusahaan;
    ArrayList<Perusahaan> list = new ArrayList<>();
    PerusahaanAdapter perusahaanAdapter;

    public ListFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        rvPerusahaan = view.findViewById(R.id.Rv_Perusahaan);
        rvPerusahaan.setHasFixedSize(true);

        list.addAll(PerusahaanData.getListData());
        showRecyclerList();
        return view;
    }

    private void showRecyclerList() {
        rvPerusahaan.setLayoutManager(new LinearLayoutManager(getContext()));
        perusahaanAdapter = new PerusahaanAdapter(list);
        rvPerusahaan.setAdapter(perusahaanAdapter);

        perusahaanAdapter.setOnItemClickCallback(new PerusahaanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Perusahaan p) {
                Intent moveIntent = new Intent(getContext(), DetailActivity.class);
                moveIntent.putExtra(DetailActivity.ITEM_EXTRA, p);
                startActivity(moveIntent);
            }
        });
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.search_menu, menu);
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
        super.onCreateOptionsMenu(menu, inflater);
    }
}
