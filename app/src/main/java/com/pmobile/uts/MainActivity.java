package com.pmobile.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.dataUsername);
        password = findViewById(R.id.dataPassword);
        login = findViewById(R.id.btnLogin);

        login.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
       String isiusername = username.getText().toString();
       String isipassword = password.getText().toString();

            if (isiusername.equals("ardhana") && isipassword.equals("19390100004")){
                Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_LONG).show();
                //inisialisasi intent
                Intent intentLogin = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intentLogin);

            }else {
                //false
                //snackbar
                Snackbar gagal = Snackbar.make(v.getRootView(), "Login Failed", Snackbar.LENGTH_LONG);
                gagal.show();
            }
            }
        }
