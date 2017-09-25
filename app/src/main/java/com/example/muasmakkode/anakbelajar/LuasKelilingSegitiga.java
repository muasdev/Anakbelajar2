package com.example.muasmakkode.anakbelajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LuasKelilingSegitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_keliling_segitiga);

        Button button = (Button) findViewById(R.id.button_luassegitiga);
        Button button1 = (Button) findViewById(R.id.button_kelilingsegitiga);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LuasSegitiga.class );
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KelilingSegitiga.class );
                startActivity(intent);
            }
        });
    }
}
