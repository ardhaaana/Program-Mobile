package com.pmobile.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private Button btnBeli, btnJual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnBeli = findViewById(R.id.btnBeli);
        btnJual = findViewById(R.id.btnJual);

        btnJual.setOnClickListener(this);
        btnBeli.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == btnBeli) {
            //inisialisasi intent
            Intent intentBeli = new Intent(MainActivity2.this, MainActivity5.class);
            startActivity(intentBeli);

        }else if (v == btnJual){
            //inisialisasi Intent
            Intent intentJual = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intentJual);

        }
    }
}