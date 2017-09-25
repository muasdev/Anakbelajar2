package com.example.muasmakkode.anakbelajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MatematikaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika);

        Button button2 = (Button) findViewById(R.id.button_belajar_persegi);
        Button button3 = (Button) findViewById(R.id.button_belajar_persegi_panjang);
        Button button4 = (Button) findViewById(R.id.button_belajar_segitiga);
        Button button5 = (Button) findViewById(R.id.button_belajar_lingkaran);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LuasKelilingPersegi.class );
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LuasKelilingPersegiPanjang.class );
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LuasKelilingSegitiga.class );
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LuasKelilingLingkaran.class );
                startActivity(intent);
            }
        });

    }


}
