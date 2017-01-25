package com.example.pandithagd.ordinario1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtNumber1;
    private Button btnCalculate;
    private TextView txvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber1 = (EditText) findViewById(R.id.edt_number1);
        btnCalculate = (Button) findViewById(R.id.btn_calculate);

        txvResult = (TextView) findViewById(R.id.txv_result);



        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(edtNumber1.getText().toString());
                double result = 0;

                result = 2 * (Math.pow(a, 2) - (2 * a) * (3 * a) - 5 *
                        ((Math.pow(a, 2)) - 2)) + ((7 * (Math.pow(a, 2))) - (3 * a) + 6);


                txvResult.setText("" + result);
            }
        });

    }
}
