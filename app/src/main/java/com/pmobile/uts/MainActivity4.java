package com.pmobile.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView nama1, jumlah1, datalogam1, lihat1, htjual1, htjual2, htjual3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        nama1 = findViewById(R.id.nama1);
        jumlah1 = findViewById(R.id.jumlah1);
        datalogam1 = findViewById(R.id.dataLogam1);
        lihat1 = findViewById(R.id.lihat);
        htjual1 = findViewById(R.id.htjual1);
        htjual2 = findViewById(R.id.htjual2);
        htjual3 = findViewById(R.id.htjual3);


        Intent hasiljual = getIntent();
        nama1.setText( hasiljual.getStringExtra("NAMA"));
        jumlah1.setText( hasiljual.getStringExtra("JUMLAH"));
        datalogam1.setText(hasiljual.getStringExtra("DTLOGAM"));
        lihat1.setText(hasiljual.getStringExtra("LIHAT"));
        htjual1.setText(hasiljual.getStringExtra("HITUNGJUAL1"));
        htjual2.setText(hasiljual.getStringExtra("HITUNGJUAL2"));
        htjual3.setText(hasiljual.getStringExtra("HITUNGJUAL3"));

        String datacheckjual = hasiljual.getStringExtra("Datajual");
        lihat1.setText(datacheckjual);

    }
}