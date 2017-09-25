package com.example.muasmakkode.anakbelajar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class LuasSegitiga extends AppCompatActivity {

    Button btn_luas;
    Button btn_reset;
    EditText edt_alas;
    EditText edt_tinggi;
    TextView tv_hasil_luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        btn_luas = (Button) findViewById(R.id.button_luas_segitiga);
        btn_reset = (Button) findViewById(R.id.button_reset_segitiga);
        edt_alas = (EditText) findViewById(R.id.edit_text_alas);
        edt_tinggi = (EditText) findViewById(R.id.edit_text_tinggi);

        tv_hasil_luas = (TextView) findViewById(R.id.text_view_hasil_luas);

        btn_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Gets the two EditText controls' Editable values
                Editable editableValue1 = edt_alas.getText();
                Editable editableValue2 = edt_tinggi.getText();

                // Initializes the double values and result
                double value_alas = 0;
                double value_tinggi = 0;

                if (edt_alas.getText().toString().trim().length() == 0 || edt_tinggi.getText().toString().trim().length() == 0)
                    Toast.makeText(getApplicationContext(), "masukkan angka", LENGTH_SHORT).show();
                else {

                    value_alas = Double.parseDouble(editableValue1.toString());

                    value_tinggi = Double.parseDouble(editableValue2.toString());

                    displayluassegitiga((int) (value_alas + value_tinggi));

                }
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt_alas.setText("");
                edt_tinggi.setText("");

                tv_hasil_luas.setText("0");
            }
        });


    }

    private void displayluassegitiga(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.text_view_hasil_luas);
        priceTextView.setText("Luas Segitiga adalah " + number + " cm2");
    }

}