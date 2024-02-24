package com.example.albarjanziandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {
    MaterialCardView cardBacaanMaulid, cardBarjanzi, cardQiyam, cardMahalul, cardTulisan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardBacaanMaulid = findViewById(R.id.cardBacaanMaulid);
        cardBarjanzi = findViewById(R.id.cardBarjanzi);
        cardQiyam = findViewById(R.id.cardQiyam);
        cardMahalul = findViewById(R.id.cardMahalul);
        cardTulisan = findViewById(R.id.cardTulisan);

        cardBacaanMaulid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BacaanMaulid.class));
            }
        });

        cardBarjanzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Barjanzi.class));
            }
        });

        cardQiyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Qiyam.class));
            }
        });

        cardMahalul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Mahalul.class));
            }
        });

        cardTulisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Tulisan.class));
            }
        });


    }
}