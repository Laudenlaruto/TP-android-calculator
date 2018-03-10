package com.example.lauden.calcfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Console;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addToOperation(View view) {
        TextView operation = findViewById(R.id.operation);
        TextView resultat = findViewById(R.id.resultat);
        if (!operation.getText().equals("")) {
            char lastchar = operation.getText().charAt(operation.getText().length() - 1);
            if (!isOperator(lastchar)) {
                switch (view.getId()) {
                    case R.id.addition:
                        operation.append("+");
                        break;
                    case R.id.soustraction:
                        operation.append("-");
                        break;
                    case R.id.multiplie:
                        operation.append("*");
                        break;
                    case R.id.divise:
                        operation.append("/");
                        break;
                    case R.id.somme:
                        operation.setText("");
                        String result = "Test";
                        resultat.setText(result);
                        break;
                }
            }
        }
        if (!isOperator((((Button) view).getText().toString().charAt(0)))) {
            operation.append(((Button) view).getText());
        }

    }

    public boolean isOperator(char parChar) {
        char[] operators = new char[]{'+', '-', '*', '/'};
        return new String(operators).indexOf(parChar) != -1;
    }
}