package com.boucetta.minmax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11,
            button12, button13, button14, button15, button16, button17, button18, button19, button20,
            button21, button22, button23, button24, choose, min, max;
    ArrayList<Button> listButtons = new ArrayList<>();
    int countMin, countMax;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minimum and maximum algorithms");

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        choose = findViewById(R.id.choose);
        min = findViewById(R.id.min);
        max = findViewById(R.id.max);
        fillListButton();

        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random myRandom = new Random();

                for (Button button : listButtons) {
                    button.setTextSize(25);
                    button.setTextColor(getResources().getColor(R.color.black));
                    button.setText(Integer.toString(myRandom.nextInt(100)));
                    countMin = 0;
                    countMax = 0;
                }

            }
        });

        max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (listButtons.get(0).getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please choose", Toast.LENGTH_LONG).show();
                }
                else {
                    int max = Integer.parseInt(listButtons.get(0).getText().toString());
                    countMax = 0;
                    for (int i = 0; i <= 24; i++) {

                        if (Integer.parseInt(listButtons.get(i).getText().toString()) >= max) {
                            max = Integer.parseInt(listButtons.get(i).getText().toString());
                            countMax = i;

                        }
                    }
                    listButtons.get(countMax).setTextColor(getResources().getColor(R.color.blue));

                }


            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listButtons.get(0).getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please choose", Toast.LENGTH_LONG).show();
                }
                else {
                    int min = Integer.parseInt(listButtons.get(0).getText().toString());
                    countMin = 0;
                    for (int i = 0; i <= 24; i++) {

                        if (Integer.parseInt(listButtons.get(i).getText().toString()) <= min) {
                            min = Integer.parseInt(listButtons.get(i).getText().toString());
                            countMin = i;

                        }
                    }
                    listButtons.get(countMin).setTextColor(getResources().getColor(R.color.green));
                }
            }
        });

    }

    public void fillListButton() {
        listButtons.add(button0);
        listButtons.add(button1);
        listButtons.add(button2);
        listButtons.add(button3);
        listButtons.add(button4);
        listButtons.add(button5);
        listButtons.add(button6);
        listButtons.add(button7);
        listButtons.add(button8);
        listButtons.add(button9);
        listButtons.add(button10);
        listButtons.add(button11);
        listButtons.add(button12);
        listButtons.add(button13);
        listButtons.add(button14);
        listButtons.add(button15);
        listButtons.add(button16);
        listButtons.add(button17);
        listButtons.add(button18);
        listButtons.add(button19);
        listButtons.add(button20);
        listButtons.add(button21);
        listButtons.add(button22);
        listButtons.add(button23);
        listButtons.add(button24);

    }

}