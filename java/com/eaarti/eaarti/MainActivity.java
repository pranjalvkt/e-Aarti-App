package com.eaarti.eaarti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnJagdish, btnGayatri, btnlakshmi, btnShiv, btnKrishna, btnRam, btnGanesh, btnMiscellaneous, btnAmbe;
    TextView selectAny, dev;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJagdish = findViewById(R.id.btnJagdish);
        btnAmbe = findViewById(R.id.btnAmbe);
        btnGanesh = findViewById(R.id.btnGanesh);
        btnGayatri = findViewById(R.id.btnGayatri);
        btnKrishna = findViewById(R.id.btnKrishna);
        btnlakshmi = findViewById(R.id.btnLakshmi);
        btnMiscellaneous = findViewById(R.id.btnMiscellaneous);
        btnRam = findViewById(R.id.btnRam);
        btnShiv = findViewById(R.id.btnShiv);

        btnJagdish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, VishnuImage.class);
                startActivity(i);
            }
        });

        btnAmbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AmbeImage.class);
                startActivity(i);
            }
        });

        btnGayatri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, GayatriImage.class);
                startActivity(i);
            }
        });

        btnlakshmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LakshmiIamge.class);
                startActivity(i);
            }
        });

        btnRam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RamImage.class);
                startActivity(i);
            }
        });

        btnKrishna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, KrishnaImage.class);
                startActivity(i);
            }
        });

        btnGanesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, GaneshImage.class);
                startActivity(i);
            }
        });

        btnShiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShivImage.class);
                startActivity(i);
            }
        });

        btnMiscellaneous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, About.class);
                startActivity(i);
            }
        });

    }
}
