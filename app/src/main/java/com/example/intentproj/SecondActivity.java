package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText num1, num2;
    String n1, n2;
    TextView ans;
    private Button buttonP, buttonM, buttonMulti, buttonD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonP = findViewById(R.id.plusbtn);
        buttonM = findViewById(R.id.minbtn);
        buttonMulti = findViewById(R.id.mulbtn);
        buttonD = findViewById(R.id.divbtn);
        ans = findViewById(R.id.Answer);

        num1 = findViewById(R.id.editTextNumber3);
        num2 = findViewById(R.id.editTextNumber4);

        n1 = getIntent().getExtras().getString("Value1");
        num1.setText(n1);
        n2 = getIntent().getExtras().getString("Value2");
        num2.setText(n2);

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int answer = number1 + number2;

                ans.setText(n1 + " + " + n2 + " = " + Integer.toString(answer));
            }
        });

        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int answer = number1 - number2;

                ans.setText(n1 + " - " + n2 + " = " + Integer.toString(answer));
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int answer = number1 * number2;

                ans.setText(n1 + " * " + n2 + " = " + Integer.toString(answer) );
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int answer = number1 / number2;

                ans. setText(n1 + " / " + n2 + " = " + Integer.toString(answer));
            }
        });
    }
}