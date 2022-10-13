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

public class MainActivity5 extends AppCompatActivity {

    private EditText namabeli, jumlahbeli, uang;
    TextView lihatbeli;
    private Spinner dataLogambeli;
    private RadioButton rbbeli;
    private CheckBox check1beli, check2beli, check3beli;
    private Button prosesbeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        namabeli = findViewById(R.id.namabeli);
        jumlahbeli = findViewById(R.id.jumlahbeli);
        dataLogambeli = findViewById(R.id.dataLogambeli);
        check1beli = findViewById(R.id.check1beli);
        check2beli = findViewById(R.id.check2beli);
        check3beli = findViewById(R.id.check3beli);
        rbbeli = findViewById(R.id.rbbeli);
        uang = findViewById(R.id.uang);
        prosesbeli = findViewById(R.id.prosesbeli);
        lihatbeli = findViewById(R.id.lihat);



        prosesbeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer hasil= new StringBuffer();
                //append adalah ditambahkan

                int hitung1 = 0;
                int hitung2 = 0;
                int hitung3 = 0;
                int jh;
                int u;

                jh = Integer.parseInt(jumlahbeli.getText().toString());
                u = Integer.parseInt(uang.getText().toString());


                if(check1beli.isChecked())
                {
                    hasil.append("\n Harga Perak : (Rp 1.000.000)");
                    hitung1 = u - (jh * 1000000);

                }
                if(check2beli.isChecked())
                {
                    hasil.append("\n Harga Palladium : (Rp 2.000.000)");
                    hitung2 = u - (jh * 2000000);

                }
                if(check3beli.isChecked())
                {
                    hasil.append("\n Harga Emas : (Rp 3.000.000)");
                    hitung3 = u - (jh * 3000000);

                }
                if(rbbeli.isChecked())
                {
                    hasil.append("\n Selesai");

                }


                Intent intentExtra = new Intent(MainActivity5.this, MainActivity6.class);
                //pengiriman data menggunakan objek intent extra
                intentExtra.putExtra("NAMA",namabeli.getText().toString());
                intentExtra.putExtra("JUMLAH",jumlahbeli.getText().toString());
                intentExtra.putExtra("DTLOGAM",dataLogambeli.getSelectedItem().toString());
                intentExtra.putExtra("HITUNG1",String.valueOf(hitung1));
                intentExtra.putExtra("HITUNG2",String.valueOf(hitung2));
                intentExtra.putExtra("HITUNG3",String.valueOf(hitung3));

                String datacheck = hasil.toString();
                intentExtra.putExtra("Data", datacheck);

                startActivity(intentExtra);

            }

        });


    }
}