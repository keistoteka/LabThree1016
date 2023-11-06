package com.example.labthree1016;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button MC,MR,MS,mPlus,mMinus,back,clearEverything,clear,plusMinus,squareRoot,n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,division,procent,multiplication,oneDevidedByX,minus,plus,dot,equal;
    TextView calculatorScreen;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MC = findViewById(R.id.MC);
        MR = findViewById(R.id.MR);
        MS = findViewById(R.id.MS);
        mPlus = findViewById(R.id.mPlus);
        mMinus = findViewById(R.id.mMinus);
        back = findViewById(R.id.back);
        clearEverything = findViewById(R.id.clearEverything);
        clear = findViewById(R.id.clear);
        plusMinus = findViewById(R.id.plusMinus);
        squareRoot = findViewById(R.id.squareRoot);
        n0 = findViewById(R.id.n0);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        division = findViewById(R.id.division);
        procent = findViewById(R.id.procent);
        multiplication = findViewById(R.id.multiplication);
        oneDevidedByX = findViewById(R.id.oneDevidedByX);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);

        calculatorScreen = findViewById(R.id.calculatorScreen);

        //onclick listeners

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(calculatorScreen.getText()+"0");
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(calculatorScreen.getText()+"1");
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(calculatorScreen.getText()+"2");
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(calculatorScreen.getText()+"3");
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(calculatorScreen.getText()+"4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(calculatorScreen.getText()+"5");
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(calculatorScreen.getText()+"6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(calculatorScreen.getText()+"7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(calculatorScreen.getText()+"8");
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(calculatorScreen.getText()+"9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(calculatorScreen.getText()+".");
            }
        });
        clearEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val= calculatorScreen.getText().toString();
                val=val.substring(0,val.length()-1);
                calculatorScreen.setText(val);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.setText(calculatorScreen.getText()+"+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.setText(calculatorScreen.getText()+"-");
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.setText(calculatorScreen.getText()+"×");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.setText(calculatorScreen.getText()+"÷");
            }
        });
        squareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = calculatorScreen.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                calculatorScreen.setText(String.valueOf(r));
            }
        });
    }
}

