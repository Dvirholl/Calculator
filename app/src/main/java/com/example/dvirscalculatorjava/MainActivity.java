package com.example.dvirscalculatorjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int targil;
        //finding buttons
        Button clear = findViewById(R.id.Clear);
        Button change = findViewById(R.id.Change);
        Button backspace = findViewById(R.id.Backspace);
        Button divide = findViewById(R.id.Divide);
        Button digit1 = findViewById(R.id.digit1);
        Button digit2 = findViewById(R.id.digit2);
        Button digit3 = findViewById(R.id.digit3);
        Button multiply = findViewById(R.id.Multiply);
        Button digit4 = findViewById(R.id.digit4);
        Button digit5 = findViewById(R.id.digit5);
        Button digit6 = findViewById(R.id.digit6);
        Button minus = findViewById(R.id.Subtract);
        Button digit7 = findViewById(R.id.digit7);
        Button digit8 = findViewById(R.id.digit8);
        Button digit9 = findViewById(R.id.digit9);
        Button plus = findViewById(R.id.Add);
        Button dot = findViewById(R.id.Dot);
        Button digit0 = findViewById(R.id.digit0);
        Button equals = findViewById(R.id.Equals);
        //buttons found


    }
}