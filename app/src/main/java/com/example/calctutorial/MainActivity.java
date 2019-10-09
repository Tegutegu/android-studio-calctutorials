package com.example.calctutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView result;
    Button Add,Subtract,Multiply,Divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);

        result = (TextView)findViewById(R.id.result);

        Add = (Button)findViewById(R.id.buttonAdd);
        Subtract = (Button)findViewById(R.id.buttonSubtract);
        Multiply = (Button)findViewById(R.id.buttonMultiply);
        Divide = (Button)findViewById(R.id.buttonDivide);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num1.getText().length() != 0 && num2.getText().length() != 0){
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());

                    double res = n1 + n2;

                    result.setText(String.valueOf(res));
                }
                else {
                    Toast.makeText(view.getContext(),"Please enter the numbers properly",Toast.LENGTH_SHORT).show();
                }

            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num1.getText() != null && num2.getText() != null){
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());

                    double res = n1 - n2;

                    result.setText(String.valueOf(res));
                }
                else {
                    Toast.makeText(view.getContext(),"Please enter the numbers properly",Toast.LENGTH_SHORT).show();
                }

            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num1.getText() != null && num2.getText() != null){
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());

                    double res = n1 * n2;

                    result.setText(String.valueOf(res));
                }
                else {
                    Toast.makeText(view.getContext(),"Please enter the numbers properly",Toast.LENGTH_SHORT).show();
                }

            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num1.getText() != null && num2.getText() != null){
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());

                    double res = n1 / n2;

                    result.setText(String.valueOf(res));
                }
                else {
                    Toast.makeText(view.getContext(),"Please enter the numbers properly",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
