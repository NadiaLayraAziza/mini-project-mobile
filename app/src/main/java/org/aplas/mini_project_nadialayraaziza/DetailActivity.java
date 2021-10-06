package org.aplas.mini_project_nadialayraaziza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgLogo = findViewById(R.id.imgLogo);
        TextView NamePerusahaan = findViewById(R.id.NamePerusahaan);
        TextView DetailPerusahaan = findViewById(R.id.DetailPerusahaan);

        Perusahaan p = getIntent().getParcelableExtra(ITEM_EXTRA);
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
}