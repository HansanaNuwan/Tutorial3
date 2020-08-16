package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    EditText num1,num2;
    String n1,n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editTextNumber5);
        num2 = findViewById(R.id.editTextNumber6);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                n1 = num1.getText().toString();
                intent.putExtra("Value1",n1);
                n2 = num2.getText().toString();
                intent.putExtra("Value2",n2);
                startActivity(intent);
                finish();

                Toast toast = Toast.makeText(getApplicationContext(), "You just clicked the Ok button....", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
    }
}