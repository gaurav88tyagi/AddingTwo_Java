package com.example.addingtwo_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etFirstNum = findViewById(R.id.etFirstNum);
        final EditText etSecondNum = findViewById(R.id.etSecondNum);
        Button btnAdd = findViewById(R.id.btnAdd);
        final TextView tv = findViewById(R.id.tv);
        Button btnReset = findViewById(R.id.btnReset);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(etFirstNum.getText().toString()) || TextUtils.isEmpty(etSecondNum.getText().toString()))
                {
                    tv.setText("");
                    Toast.makeText(getApplicationContext(),"Invalid Input", LENGTH_SHORT).show();
                    return;
                }

                int firstNum = Integer.valueOf(etFirstNum.getText().toString());
                int secondNum = Integer.valueOf(etSecondNum.getText().toString());

                int sum = firstNum + secondNum;

                tv.setText(String.valueOf(firstNum) + " + " +String.valueOf(secondNum) + " = " + String.valueOf(sum));

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                etFirstNum.setText("");
                etSecondNum.setText("");
                tv.setText("");

            }
        });

    }
}
