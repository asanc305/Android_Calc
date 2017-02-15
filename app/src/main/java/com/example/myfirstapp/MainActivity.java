package com.example.myfirstapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {

    Calculator calc;
    TextView box;
    Boolean display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc = new Calculator();
        box = (TextView) findViewById(R.id.display);
        display = false;
    }

    public void numberPressed(View view) {
        String x = (String) view.getTag();

        if(box.length() == 0 || display) {
            box.setText(x);
            display = false;
        }
        else {
            box.append(x);
            display = false;
        }
    }

    public void additionPressed(View view) {
        int term = Integer.parseInt((box.getText().toString()));
        int sum = calc.add(term);

        box.setText(Integer.toString(sum));
        display = true;

        /*
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, Integer.toString(sum), duration);
        toast.show();
        */
    }

    public void subtractionPressed(View view) {
        int term = Integer.parseInt(box.getText().toString());
        int sum = calc.subtract(term);

        box.setText(Integer.toString(sum));
        display = true;
    }

    public void clearAllPressed(View view) {
        calc.clear();
        box.setText("0");
        display = true;
    }

    public void clearPressed(View view) {
        box.setText("0");
        display = true;
    }
}
