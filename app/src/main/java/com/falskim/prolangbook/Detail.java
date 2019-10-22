package com.falskim.prolangbook;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tvName = findViewById(R.id.detail_name);
        TextView tvYear = findViewById(R.id.detail_year);
        TextView tvDesigner = findViewById(R.id.detail_designed);
        TextView tvParadigm = findViewById(R.id.detail_paradigm);
        TextView tvExtension = findViewById(R.id.detail_extension);
        TextView tvVersion = findViewById(R.id.detail_version);
        ImageView ivImage = findViewById(R.id.detail_image);

        tvName.setText(getIntent().getStringExtra("NAME"));
        tvYear.setText(getIntent().getStringExtra("YEAR"));
        tvDesigner.setText(getIntent().getStringExtra("DESIGNER"));
        tvParadigm.setText(getIntent().getStringExtra("PARADIGM"));
        tvExtension.setText(getIntent().getStringExtra("EXTENSION"));
        tvVersion.setText(getIntent().getStringExtra("VERSION"));
        ivImage.setImageResource(getIntent().getIntExtra("IMAGE", 0));
    }


}
