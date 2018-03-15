package com.example.lauden.calcfragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
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
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_top, fragment_top.newInstance());
        fragmentTransaction.add(R.id.fragment_bottom, fragment_keyboard.newInstance());
        fragmentTransaction.commit();


    }


    public void addToOperation(View view) {
        TextView operation = findViewById(R.id.operation);
        //Check if operation array is empty
        if (!operation.getText().equals("")) {
            //To prevent having multiples operator next to each other check last character
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
                }
            }
        }
        if (!isOperator((((Button) view).getText().toString().charAt(0)))) {
            operation.append(((Button) view).getText());
        }

    }
    public void makeSum(View view){
        CharSequence operation = ((TextView)(findViewById(R.id.operation))).getText();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_top, fragment_keyboard.newInstance());
        fragmentTransaction.replace(R.id.fragment_bottom, fragment_top.newInstance());
        fragmentTransaction.commit();
        TextView resultat = findViewById(R.id.resultat);
        if (!operation.equals("")) {
            resultat.setText("42");
            //operation.setText("");
        }

        }
    public boolean isOperator(char parChar) {
        char[] operators = new char[]{'+', '-', '*', '/','='};
        return new String(operators).indexOf(parChar) != -1;
    }
}