package com.example.mathexercise;

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

    private TextView num1;
    private TextView num2;

    private Button single;
    private Button till20;
    private Button challenge;
    private Button check;

    private EditText answer;

    private int r1, r2;

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

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1 = (int) (Math.random() * 9) + 1;
                r2 = (int) (Math.random() * 9) + 1;
                num1.setText(r1+"");
                num2.setText(r2+"");
                answer.setText("");
            }
        });


        till20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1 = (int) (Math.random() * 11) + 10;
                r2 = (int) (Math.random() * 9) + 1;
                num1.setText(r1 + "");
                num2.setText(r2 +  "");
                answer.setText("");
            }
        });

        challenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1 = (int) (Math.random() * 100) + 1;
                r2 = (int) (Math.random() * 100) + 1;
                num1.setText(r1+"");
                num2.setText(r2+"");
                answer.setText("");
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
                } else {
                    wrongCount++;
                    wrong.setText("wrong:"+wrongCount);
                    num1.setText("");
                    num2.setText("");
                    answer.setText("");
                }
            }
        });
    }
}
