package com.example.mathexercise;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView right;
    private int rightCount;
    private TextView wrong;
    private int wrongCount;
    //------------------
    private TextView num1;
    private TextView num2;
    //------------------
    private Button single;
    private Button till20;
    private Button challenge;
    private Button check;
    //------------------

    private EditText answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rightCount=0;
        wrongCount=0;
        right=findViewById(R.id.rightId);
        wrong=findViewById(R.id.wrongId);
        num1=findViewById(R.id.num1Id);
        num2=findViewById(R.id.num2Id);
        single=findViewById(R.id.singleId);
        till20=findViewById(R.id.till20Id);
        challenge=findViewById(R.id.chalngeId);
        check=findViewById(R.id.checkId);
    }
}