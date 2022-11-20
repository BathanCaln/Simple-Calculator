package com.batuhancalin.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.sql.StatementEvent;

public class MainActivity extends AppCompatActivity {

    // eğer bir görünüm tanımlayacaksak globalda tanımlamak oncreate te findViewById sini yapmak bunları
//Bütün methodlarda kullanmamızı sağlacaktır

    EditText number1Text;
    EditText number2Text;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         number1Text = findViewById(R.id.number1Text);
         number2Text = findViewById(R.id.number2Text);
         resultText =  findViewById(R.id.resultText);


    }
    // parantez içine yazılan View view bunların bir görünüm tarafından çağırılacağını belirtiyor

    public void sum(View view) {

        // aşağıdaki komutla beraber stringi integer e çevirmiş oldum

        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultText.setText("Enter Number");

        } else{
            int number1 =  Integer.parseInt(number1Text.getText().toString());
            int number2 =  Integer.parseInt(number2Text.getText().toString());
            int result = number1 + number2;


            resultText.setText("Result: "+ result);

        }


    }

    public void multiply(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultText.setText("Enter Number");

        } else{
            int number1 =  Integer.parseInt(number1Text.getText().toString());
            int number2 =  Integer.parseInt(number2Text.getText().toString());
            int result = number1 * number2;


            resultText.setText("Result: "+ result);}

    }


        public void divide(View view){
            if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

                resultText.setText("Enter Number");

            } else{
                int number1 =  Integer.parseInt(number1Text.getText().toString());
                int number2 =  Integer.parseInt(number2Text.getText().toString());
                int result = number1 / number2;


                resultText.setText("Result: "+ result);
            }

    }

    public void deduct(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {

            resultText.setText("Enter Number");

        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 - number2;


            resultText.setText("Result: " + result);
        }


    }


}