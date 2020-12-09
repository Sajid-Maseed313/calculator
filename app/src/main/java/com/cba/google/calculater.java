package com.cba.google;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculater extends AppCompatActivity {
    EditText edtfirst, edtsecond;
    Button add, sub, mul, div;
    TextView txtview;
    int first, second, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);
        edtfirst = (EditText) findViewById(R.id.edtfirst);
        edtsecond = (EditText) findViewById(R.id.edtsecond);
        add = (Button) findViewById(R.id.btnadd);
        sub = (Button) findViewById(R.id.btnsub);
        mul = (Button) findViewById(R.id.btnmul);
        div = (Button) findViewById(R.id.btndiv);
        txtview = (TextView) findViewById(R.id.txtview);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first = Integer.valueOf(edtfirst.getText().toString());
                second = Integer.valueOf(edtsecond.getText().toString());
                result = first + second;
                txtview.setText("Your Result is = " + result);

            }
        });
    }
}