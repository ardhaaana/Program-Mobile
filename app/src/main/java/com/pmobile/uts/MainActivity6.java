package com.pmobile.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    TextView nama1, jumlah1, datalogam1, lihat1, ht1,ht2,ht3;
    Button menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        nama1 = findViewById(R.id.nama1);
        jumlah1 = findViewById(R.id.jumlah1);
        datalogam1 = findViewById(R.id.dataLogam1);
        lihat1 = findViewById(R.id.lihat);
        ht1 = findViewById(R.id.ht1);
        ht2 = findViewById(R.id.ht2);
        ht3 = findViewById(R.id.ht3);
        menu = findViewById(R.id.menu);


        Intent hasil = getIntent();
        nama1.setText( hasil.getStringExtra("NAMA"));
        jumlah1.setText( hasil.getStringExtra("JUMLAH"));
        datalogam1.setText(hasil.getStringExtra("DTLOGAM"));
        lihat1.setText(hasil.getStringExtra("LIHAT"));
        ht1.setText(hasil.getStringExtra("HITUNG1"));
        ht2.setText(hasil.getStringExtra("HITUNG2"));
        ht3.setText(hasil.getStringExtra("HITUNG3"));

        String datacheck = hasil .getStringExtra("Data");
        lihat1.setText(datacheck);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
    }
}