package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText pass_word;
    private Button button_spw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addPassword();
    }

    public  void addPassword(){

        pass_word = (EditText)findViewById(R.id.editTextPassword);
        button_spw = (Button) findViewById(R.id.button2);

        button_spw.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                          MainActivity.this, pass_word.getText(),
                                Toast.LENGTH_SHORT
                        ).show();

                    }
                }
        );
    }
    public void onButtonClick(View v) {


        EditText e1 = (EditText)findViewById(R.id.editTextNumber);

        EditText e2 = (EditText)findViewById(R.id.editTextNumber2);

        TextView t1 = (TextView)findViewById(R.id.textView);

        int Num1 = Integer.parseInt(e1.getText().toString());

        int Num2 = Integer.parseInt(e2.getText().toString());

        int sum = Num1 + Num2;

        t1.setText(Integer.toString(sum));
    }
}