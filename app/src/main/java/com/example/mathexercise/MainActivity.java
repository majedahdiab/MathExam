package com.example.mathexercise;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView right;
    private int rightCount;
    private TextView wrong;
    private int wrongCount;
    private TextView mark;
    private int markCount;

    private TextView num1;
    private TextView num2;

    private Button single;
    private Button till20;
    private Button challenge;
    private Button check;

    private EditText answer;
    private boolean s,t,c;
    private int r1, r2;
    private int count;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rightCount = 0;
        wrongCount = 0;

        right = findViewById(R.id.rightId);
        wrong = findViewById(R.id.wrongId);
        num1 = findViewById(R.id.num1Id);
        num2 = findViewById(R.id.num2Id);
        single = findViewById(R.id.singleId);
        till20 = findViewById(R.id.till20Id);
        challenge = findViewById(R.id.chalngeId);
        check = findViewById(R.id.checkId);
        answer = findViewById(R.id.answerId);
        mark = findViewById(R.id.markId);
        markCount=0;
        count=0;
        s=false;
        t=false;
        c=false;

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count >= 0){
                    r1 = (int) (Math.random() * 9) + 1;
                    r2 = (int) (Math.random() * 9) + 1;
                    num1.setText(r1 + "");
                    num2.setText(r2 + "");
                    answer.setText("");
                    s = true;
                }
            }
        });


        till20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count >= 10) {
                    r1 = (int) (Math.random() * 11) + 10;
                    r2 = (int) (Math.random() * 9) + 1;
                    num1.setText(r1 + "");
                    num2.setText(r2 + "");
                    answer.setText("");
                    t = true;
                }
            }
        });

        challenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count >= 20) {
                    r1 = (int) (Math.random() * 100) + 1;
                    r2 = (int) (Math.random() * 100) + 1;
                    num1.setText(r1 + "");
                    num2.setText(r2 + "");
                    answer.setText("");
                    c = true;
                }
            }
        });


        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ansText = answer.getText().toString().trim();

                if (ansText.isEmpty()) {
                    answer.setError("Enter your answer");
                    return;
                }

                int userAnswer = Integer.parseInt(ansText);
                if (r1 * r2 == userAnswer) {
                    rightCount++;
                    right.setText("right:"+rightCount);
                    num1.setText("");
                    num2.setText("");
                    answer.setText("");
                    if(s){
                        markCount+=2;
                        count++;}
                    if(t){
                        markCount+=5;
                        count++;}
                    if(c)
                        markCount+=10;
                    mark.setText("mark:"+markCount);
                    s=false;
                    t=false;
                    c=false;

                } else {
                    wrongCount++;
                    wrong.setText("wrong:"+wrongCount);
                    num1.setText("");
                    num2.setText("");
                    answer.setText("");
                    if(s)
                        count=0;
                    if(t)
                        count=10;
                    if(c)
                        count=20;
                    s=false;
                    t=false;
                    c=false;
                }
            }
        });
    }
}
