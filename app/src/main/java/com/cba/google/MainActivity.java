package com.cba.google;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button single, dbl, rst;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.text);
        single = findViewById(R.id.btnsingl);
        dbl = findViewById(R.id.btndouble);
        rst = findViewById(R.id.btnreset);

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                txt.setText(" Tasbih :" + counter);


            }
        });
        dbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 2;
                txt.setText(" Tasbih :" + counter);

            }
        });
        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                txt.setText(" Tasbih :" + counter);

            }
        });
    }
}