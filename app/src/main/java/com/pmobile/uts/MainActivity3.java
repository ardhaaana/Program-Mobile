package com.pmobile.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private EditText nama, jumlah;
    TextView lihat;
    private Spinner dataLogam;
    private RadioButton rb;
    private CheckBox check1, check2, check3;
    private Button proses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nama = findViewById(R.id.nama);
        jumlah = findViewById(R.id.jumlah);
        dataLogam = findViewById(R.id.dataLogam);
        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        check3 = findViewById(R.id.check3);
        rb = findViewById(R.id.rb);
        proses = findViewById(R.id.proses);
        lihat = findViewById(R.id.lihat);


        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer hasiljual= new StringBuffer();
                //append adalah ditambahkan


                int hitungjual1 = 0;
                int hitungjual2 = 0;
                int hitungjual3 = 0;
                int jhjual;

                jhjual = Integer.parseInt(jumlah.getText().toString());


                if(check1.isChecked())
                {
                    hasiljual.append("\n Harga Perak : (Rp 1.000.000)");
                    hitungjual1 = jhjual * 1000000;

                }
                if(check2.isChecked())
                {
                    hasiljual.append("\n Harga Palladium : (Rp 2.000.000)");
                    hitungjual2 = jhjual * 2000000;

                }
                if(check3.isChecked())
                {
                    hasiljual.append("\n Harga Emas : (Rp 3.000.000)");
                    hitungjual3 =jhjual * 3000000;

                }
                if(rb.isChecked())
                {
                    hasiljual.append("\n Selesai");

                }



                Intent intentExtra = new Intent(MainActivity3.this, MainActivity4.class);
                //pengiriman data menggunakan objek intent extra
                intentExtra.putExtra("NAMA",nama.getText().toString());
                intentExtra.putExtra("JUMLAH",jumlah.getText().toString());
                intentExtra.putExtra("DTLOGAM",dataLogam.getSelectedItem().toString());
                intentExtra.putExtra("HITUNGJUAL1",String.valueOf(hitungjual1));
                intentExtra.putExtra("HITUNGJUAL2",String.valueOf(hitungjual2));
                intentExtra.putExtra("HITUNGJUAL3",String.valueOf(hitungjual3));

                String datacheckjual = hasiljual.toString();
                intentExtra.putExtra("Datajual", datacheckjual);

                startActivity(intentExtra);

            }

        });


    }
}