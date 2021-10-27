package org.aplas.mini_project_nadialayraaziza;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;

import java.io.Serializable;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";
    private ArrayList<Perusahaan> list = new ArrayList<>();
    Perusahaan p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgLogo = findViewById(R.id.imgLogo);
        TextView NamePerusahaan = findViewById(R.id.NamePerusahaan);
        TextView DetailPerusahaan = findViewById(R.id.DetailPerusahaan);

        p = getIntent().getParcelableExtra(ITEM_EXTRA);
        Toast.makeText(this, p.getName(), Toast.LENGTH_SHORT).show();

        if (p != null){
            Glide.with(this)
                    .load(p.getLogo())
                    .into(imgLogo);
            NamePerusahaan.setText(p.getName());
            DetailPerusahaan.setText(p.getDeskripsi());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Perusahaan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            Intent intent = new Intent(DetailActivity.this, PendiriActivity.class);
            ArrayList<Perusahaan> list = new ArrayList<>();
            list.addAll(MediaData.getListData());
            intent.putExtra(ITEM_EXTRA, p);
            startActivity(intent);

        return super.onOptionsItemSelected(item);
    }

}