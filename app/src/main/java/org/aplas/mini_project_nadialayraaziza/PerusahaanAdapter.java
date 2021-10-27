package org.aplas.mini_project_nadialayraaziza;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PerusahaanAdapter extends RecyclerView.Adapter<PerusahaanAdapter.ListViewHolder> implements Filterable {
    ArrayList<Perusahaan> listPerusahaan;
    ArrayList<Perusahaan> listAll;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public PerusahaanAdapter(ArrayList<Perusahaan> list) {
        this.listPerusahaan = list;
        this.listAll = new ArrayList<>(list);
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
                .apply(new RequestOptions().override(60, 60))
                .into(holder.imgLogo);
        holder.tvName.setText(p.getName());
        holder.tvLink.setText(p.getLink());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listPerusahaan.get(holder.getAdapterPosition()));
            }
        });

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

    public interface OnItemClickCallback{
        void onItemClicked(Perusahaan data);
    }

    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            List<Perusahaan> filteredList = new ArrayList<>();

            if (charSequence.toString().isEmpty()) {
                filteredList.addAll(listAll);
            } else {
                for (Perusahaan p: listAll) {
                    if (p.getName().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        filteredList.add(p);
                    }
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = filteredList;
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            listPerusahaan.clear();
            listPerusahaan.addAll((Collection<? extends Perusahaan>) filterResults.values);
            notifyDataSetChanged();
        }
    };

    void setFilter(ArrayList<Perusahaan> filterModel) {
        listPerusahaan = new ArrayList<>();
        listPerusahaan.addAll(filterModel);
        notifyDataSetChanged();
    }
}