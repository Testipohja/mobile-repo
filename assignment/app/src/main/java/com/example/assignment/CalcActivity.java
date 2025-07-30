package com.example.assignment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calc);

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numberText = (EditText) findViewById(R.id.numberText);
                EditText numberText2 = (EditText) findViewById(R.id.numberText2);
                TextView resultText = (TextView) findViewById(R.id.resultText);

                int num1 = Integer.parseInt(numberText.getText().toString());
                int num2 = Integer.parseInt(numberText2.getText().toString());
                int result = num1 + num2;
                resultText.setText(result + "");
            }
        });

        Button subtractButton = (Button) findViewById(R.id.subtractButton);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numberText = (EditText) findViewById(R.id.numberText);
                EditText numberText2 = (EditText) findViewById(R.id.numberText2);
                TextView resultText = (TextView) findViewById(R.id.resultText);

                int num1 = Integer.parseInt(numberText.getText().toString());
                int num2 = Integer.parseInt(numberText2.getText().toString());
                int result = num1 - num2;
                resultText.setText(result + "");
            }
        });

        Button multiplyButton = (Button) findViewById(R.id.multiplyButton);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numberText = (EditText) findViewById(R.id.numberText);
                EditText numberText2 = (EditText) findViewById(R.id.numberText2);
                TextView resultText = (TextView) findViewById(R.id.resultText);

                int num1 = Integer.parseInt(numberText.getText().toString());
                int num2 = Integer.parseInt(numberText2.getText().toString());
                int result = num1 * num2;
                resultText.setText(result + "");
            }
        });

        Button divideButton = (Button) findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numberText = (EditText) findViewById(R.id.numberText);
                EditText numberText2 = (EditText) findViewById(R.id.numberText2);
                TextView resultText = (TextView) findViewById(R.id.resultText);

                float num1 = Integer.parseInt(numberText.getText().toString());
                float num2 = Integer.parseInt(numberText2.getText().toString());
                float result = num1 / num2;
                resultText.setText(result + "");
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}