package org.aplas.mini_project_nadialayraaziza;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PendiriActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendiri);

        ImageView PhotoPendiri = findViewById(R.id.PhotoPendiri);
        TextView FullName = findViewById(R.id.FullName);
        TextView NamaPendiri = findViewById(R.id.NamaPendiri);
        TextView kebangsaan = findViewById(R.id.kebangsaan);
        TextView pendidikan = findViewById(R.id.pendidikan);
        TextView kelahiran = findViewById(R.id.kelahiran);
        TextView wafat = findViewById(R.id.wafat);

//        ArrayList<Perusahaan> p = this.getIntent().getParcelableArrayListExtra(ITEM_EXTRA);
        Perusahaan p = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (p != null) {
//            Toast.makeText(this, p.getPendiri(), Toast.LENGTH_SHORT).show();
            Glide.with(this)
                    .load(p.getProfile())
                    .into(PhotoPendiri);
            FullName.setText(p.getName());
            NamaPendiri.setText(p.getPendiri());
            kebangsaan.setText(p.getKebangsaan());
            pendidikan.setText(p.getPendidikan());
            kelahiran.setText(p.getKelahiran());
            wafat.setText(p.getWafat());
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Biodata Pendiri Perusahaan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}