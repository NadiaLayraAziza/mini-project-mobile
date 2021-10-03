package org.aplas.mini_project_nadialayraaziza;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class PerusahaanAdapter extends RecyclerView.Adapter<PerusahaanAdapter.ListViewHolder> {
    private ArrayList<Perusahaan> listPerusahaan;

    public PerusahaanAdapter(ArrayList<Perusahaan> list) {
        this.listPerusahaan = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Perusahaan p = listPerusahaan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(p.getLogo())
                .apply(new RequestOptions().override(50, 50))
                .into(holder.imgLogo);
        holder.tvName.setText(p.getName());
        holder.tvLink.setText(p.getLink());

    }

    @Override
    public int getItemCount() {
        return listPerusahaan.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView tvName, tvLink;

        ListViewHolder(View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.imgLogoItem);
            tvName = itemView.findViewById(R.id.ItemName);
            tvLink = itemView.findViewById(R.id.ItemLink);
        }
    }
}
