package com.example.kalkulatortrigonometri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText etAngka;
    private Button btnSin, btnCos, btnTan, btnCsc, btnSec, btnCot, btnLog;
    private TextView tvHasil;

    DecimalFormat df = new DecimalFormat("###.##########");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAngka = findViewById(R.id.angka);
        btnSin = findViewById(R.id.sin);
        btnCos = findViewById(R.id.cos);
        btnTan = findViewById(R.id.tan);
        btnCsc = findViewById(R.id.csc);
        btnSec = findViewById(R.id.sec);
        btnCot = findViewById(R.id.cot);
        btnLog = findViewById(R.id.log);
        tvHasil = findViewById(R.id.hasil);

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dSin = Math.sin(Math.toRadians(dAngka));

                    tvHasil.setText(df.format(dSin));
                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dCos = Math.cos(Math.toRadians(dAngka));

                    tvHasil.setText(df.format(dCos));
                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dTan = Math.tan(Math.toRadians(dAngka));

                    if (dTan > 3) {
                        tvHasil.setText("Tidak Terdefinisi");
                    }else {
                        tvHasil.setText(df.format(dTan));
                    }

                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dCsc = 1/Math.sin(Math.toRadians(dAngka));

                    if (dCsc > 3) {
                        tvHasil.setText("Tidak Terdefinisi");
                    }else {
                        tvHasil.setText(df.format(dCsc));
                    }

                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dSec = 1/Math.cos(Math.toRadians(dAngka));

                    if (dSec > 3) {
                        tvHasil.setText("Tidak Terdefinisi");
                    }else {
                        tvHasil.setText(df.format(dSec));
                    }

                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dCot = 1/Math.tan(Math.toRadians(dAngka));

                    if (dCot > 3) {
                        tvHasil.setText("Tidak Terdefinisi");
                    }else {
                        tvHasil.setText(df.format(dCot));
                    }

                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double dAngka = Double.valueOf(etAngka.getText().toString().trim());
                    double dLog = Math.log10(dAngka);

                    tvHasil.setText(df.format(dLog));
                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
