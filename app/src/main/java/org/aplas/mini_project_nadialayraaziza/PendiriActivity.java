package org.aplas.mini_project_nadialayraaziza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PendiriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendiri);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Biodata Pendiri Perusahaan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}