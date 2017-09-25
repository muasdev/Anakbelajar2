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

public class LuasKelilingPersegiPanjang extends AppCompatActivity {

    Button btn_luas;
    Button btn_keliling;
    Button btn_reset;
    EditText edt_panjang;
    EditText edt_lebar;
    TextView tv_hasil_luas;
    TextView tv_hasil_keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_keliling_persegi_panjang);

        btn_luas = (Button) findViewById(R.id.button_luas_persegi_panjang);
        btn_keliling = (Button) findViewById(R.id.button_keliling_persegi_panjang);
        btn_reset = (Button) findViewById(R.id.button_reset_persegi_panjang);
        edt_panjang = (EditText) findViewById(R.id.edit_text_panjang);
        edt_lebar = (EditText) findViewById(R.id.edit_text_lebar);
        tv_hasil_luas = (TextView) findViewById(R.id.text_view_hasil_luas);
        tv_hasil_keliling = (TextView) findViewById(R.id.text_view_hasil_keliling);

        btn_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Gets the two EditText controls' Editable values
                Editable editableValue1 = edt_panjang.getText();
                Editable editableValue2 = edt_lebar.getText();

                // Initializes the double values and result
                double value_panjang = 0;
                double value_lebar = 0;

                if (edt_panjang.getText().toString().trim().length() == 0 || edt_lebar.getText().toString().trim().length() == 0)
                    Toast.makeText(getApplicationContext(), "masukkan angka", LENGTH_SHORT).show();
                else {

                    value_panjang = Double.parseDouble(editableValue1.toString());

                    value_lebar = Double.parseDouble(editableValue2.toString());

                    displayluaspersegipanjang((int) (value_panjang * value_lebar));
                }
            }
        });

        btn_keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Gets the two EditText controls' Editable values
                Editable editableValue1 = edt_panjang.getText();
                Editable editableValue2 = edt_lebar.getText();

                // Initializes the double values and result
                double value_panjang = 0;
                double value_lebar = 0;

                if (edt_panjang.getText().toString().trim().length() == 0 || edt_lebar.getText().toString().trim().length() == 0)
                    Toast.makeText(getApplicationContext(), "masukkan angka", LENGTH_SHORT).show();
                else {

                    value_panjang = Double.parseDouble(editableValue1.toString());

                    value_lebar = Double.parseDouble(editableValue2.toString());

                    displaykelilingpersegipanjang((int) (2 * (value_panjang + value_lebar)));
                }
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt_panjang.setText("");
                edt_lebar.setText("");

                tv_hasil_luas.setText("0");
                tv_hasil_keliling.setText("0");
            }
        });


    }

    private void displayluaspersegipanjang(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.text_view_hasil_luas);
        priceTextView.setText("Luas Persegi Panjang adalah " + number + " cm2");
    }

    private void displaykelilingpersegipanjang(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.text_view_hasil_keliling);
        priceTextView.setText("Keliling Persegi Panjang adalah " + number + " cm");
    }


}
