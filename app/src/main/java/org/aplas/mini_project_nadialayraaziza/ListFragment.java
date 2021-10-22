package org.aplas.mini_project_nadialayraaziza;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    RecyclerView rvPerusahaan;
    ArrayList<Perusahaan> list = new ArrayList<>();

    public ListFragment() {

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
        PerusahaanAdapter perusahaanAdapter = new PerusahaanAdapter(list);
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
}
