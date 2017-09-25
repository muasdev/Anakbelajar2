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

public class KelilingSegitiga extends AppCompatActivity {

    Button btn_keliling;
    Button btn_reset;
    EditText edt_ab;
    EditText edt_ac;
    EditText edt_bc;
    TextView tv_hasil_keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_segitiga);

        btn_keliling = (Button) findViewById(R.id.button_keliling_segitiga);
        btn_reset = (Button) findViewById(R.id.button_reset_segitiga);
        edt_ab = (EditText) findViewById(R.id.edit_text_ab);
        edt_ac = (EditText) findViewById(R.id.edit_text_ac);
        edt_bc = (EditText) findViewById(R.id.edit_text_bc);

        tv_hasil_keliling = (TextView) findViewById(R.id.text_view_hasil_keliling);

        btn_keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Gets the two EditText controls' Editable values
                Editable editableValue1 = edt_ab.getText();
                Editable editableValue2 = edt_ac.getText();
                Editable editableValue3 = edt_bc.getText();

                // Initializes the double values and result
                double value_ab = 0;
                double value_ac = 0;
                double value_bc = 0;

                if (edt_ab.getText().toString().trim().length() == 0 || edt_ac.getText().toString().trim().length() == 0 || edt_bc.getText().toString().trim().length() == 0)
                    Toast.makeText(getApplicationContext(), "masukkan angka", LENGTH_SHORT).show();
                else {

                    value_ab = Double.parseDouble(editableValue1.toString());

                    value_ac = Double.parseDouble(editableValue2.toString());

                    value_bc = Double.parseDouble(editableValue2.toString());

                    displaykelilingpersegipanjang((int) (value_ab + value_ac + value_bc));

                }
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt_ab.setText("");
                edt_ac.setText("");
                edt_bc.setText("");

                tv_hasil_keliling.setText("0");
            }
        });


    }

    private void displaykelilingpersegipanjang(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.text_view_hasil_keliling);
        priceTextView.setText("Keliling Segitiga adalah " + number + " cm");
    }


}