package com.eminegunes.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberText;
    EditText number2Text;
    TextView resault;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberText = findViewById(R.id.numberText);
        number2Text = findViewById(R.id.number2Text);
        resault = findViewById(R.id.resault);
    }
    public void sum(View view){

        if(numberText.getText().toString().matches("" ) || number2Text.getText().toString().matches("" )){
            resault.setText("Enter number!");
        }else{
            int number =Integer.parseInt(numberText.getText().toString());
            int number2 =Integer.parseInt(number2Text.getText().toString());
            int resaultt = number + number2;
            resault.setText("Resault: " + resaultt);
        }


    }
    public void deduct(View view){
        if(numberText.getText().toString().matches("" ) || number2Text.getText().toString().matches("" )){
            resault.setText("Enter number!");
        }else{
            int number =Integer.parseInt(numberText.getText().toString());
            int number2 =Integer.parseInt(number2Text.getText().toString());
            int resaultt = number - number2;
            resault.setText("Resault: " + resaultt);
        }

    }
    public void multiply(View view){
        if(numberText.getText().toString().matches("" ) || number2Text.getText().toString().matches("" )){
            resault.setText("Enter number!");
        } else{
            int number =Integer.parseInt(numberText.getText().toString());
            int number2 =Integer.parseInt(number2Text.getText().toString());
            int resaultt = number * number2;
            resault.setText("Resault: " + resaultt);
        }

    }
    public void divide(View view){
        if(numberText.getText().toString().matches("" ) || number2Text.getText().toString().matches("" )){
            resault.setText("Enter number!");
        }else{
            int number =Integer.parseInt(numberText.getText().toString());
            int number2 =Integer.parseInt(number2Text.getText().toString());
            int resaultt = number / number2;
            resault.setText("Resault: " + resaultt);
        }

    }
}