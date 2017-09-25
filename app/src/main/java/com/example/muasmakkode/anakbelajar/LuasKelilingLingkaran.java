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

public class LuasKelilingLingkaran extends AppCompatActivity {

    Button btn_luas;
    Button btn_keliling;
    Button btn_reset;
    EditText edt_jari;
    TextView tv_hasil_luas;
    TextView tv_hasil_keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_keliling_lingkaran);

        btn_luas = (Button) findViewById(R.id.button_luas_lingkaran);
        btn_keliling = (Button) findViewById(R.id.button_keliling_lingkaran);
        btn_reset = (Button) findViewById(R.id.button_reset_lingkaran);
        edt_jari = (EditText) findViewById(R.id.edit_text_jari2);
        tv_hasil_luas = (TextView) findViewById(R.id.text_view_hasil_luas);
        tv_hasil_keliling = (TextView) findViewById(R.id.text_view_hasil_keliling);

        btn_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edt_jari.getText().toString().trim().length() == 0)
                    Toast.makeText(getApplicationContext(), "masukkan jari-jari", LENGTH_SHORT).show();
                else {
                    // Gets the two EditText controls' Editable values
                    Editable editableValue1 = edt_jari.getText();

                    // Initializes the double values and result
                    double value_jari = 0;

                    // If the Editable values are not null, obtains their double values by parsing
                    if (editableValue1 != null)
                        value_jari = Double.parseDouble(editableValue1.toString());

                    displayluaslingkaran((int) (3.14 * value_jari * value_jari));
                }
            }
        });

        btn_keliling.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {

                if (edt_jari.getText().toString().trim().length() == 0)
                    Toast.makeText(getApplicationContext(), "masukkan jari-jari", LENGTH_SHORT).show();
                else {
                    // Gets the two EditText controls' Editable values
                    Editable editableValue1 = edt_jari.getText();

                    // Initializes the double values and result
                    double value_jari = 0;

                    // If the Editable values are not null, obtains their double values by parsing
                    if (editableValue1 != null)
                        value_jari = Double.parseDouble(editableValue1.toString());

                    displaykelilinglingkaran((int) (3.14 * value_jari));
                }
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {

                edt_jari.setText("");

                tv_hasil_luas.setText("0");
                tv_hasil_keliling.setText("0");
            }
        });


    }

    private void displayluaslingkaran(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.text_view_hasil_luas);
        priceTextView.setText("Luas Persegi adalah " + number + " cm2");
    }

    private void displaykelilinglingkaran(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.text_view_hasil_keliling);
        priceTextView.setText("Keliling Persegi adalah " + number + " cm");
    }


}
