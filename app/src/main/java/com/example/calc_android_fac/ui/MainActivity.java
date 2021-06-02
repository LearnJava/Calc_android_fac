package com.example.calc_android_fac.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.calc_android_fac.R;
import com.example.calc_android_fac.entity.Calculator;

public class MainActivity extends AppCompatActivity {

    TextView resultTextView;
    StringBuffer resultText = new StringBuffer("");
    Calculator calc = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);

        findViewById(R.id.key_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.append(1);
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.append(2);
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.append(3);
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.append(4);
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.append(5);
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.append(6);
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.append(7);
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.append(8);
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.append(9);
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.append(0);
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_dot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.append(".");
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateResultTextView("");
            }
        });
        findViewById(R.id.key_minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateResultTextView("");
            }
        });
        findViewById(R.id.key_equls).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateResultTextView("");
            }
        });
        findViewById(R.id.key_multiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateResultTextView("");
            }
        });
        findViewById(R.id.key_divide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateResultTextView("");
            }
        });
        findViewById(R.id.key_backspace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setLength(resultText.length() - 1);
                updateResultTextView(resultText.toString());
            }
        });
    }

    private void updateResultTextView(String str) {
        resultTextView.setText(str);
    }

    private void resetTextView(String str) {
        resultText.append("Hello World");
        resultText.setLength(resultText.length() - 1);
    }

}