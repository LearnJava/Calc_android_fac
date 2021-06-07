package com.example.calc_android_fac.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calc_android_fac.R;
import com.example.calc_android_fac.entity.Calculator;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    TextView resultTextView;
    StringBuffer resultText = new StringBuffer("");
    Calculator calc = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);

        initNumberKeys();

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
        findViewById(R.id.key_reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.delete(0, resultText.length());
                updateResultTextView(resultText.toString());
            }
        });
    }

    private void updateResultTextView(String str) {
        resultTextView.setText(str);
    }

    private void initNumberKeys() {
        Set<Integer> buttons = new HashSet<>(Arrays.asList(R.id.key_1, R.id.key_2,
                R.id.key_3, R.id.key_4, R.id.key_5, R.id.key_6, R.id.key_7, R.id.key_8,
                R.id.key_9, R.id.key_0));
        for (Integer btn: buttons) {
            findViewById(btn).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button btn = (Button) v;
                    resultText.append(btn.getText());
                    updateResultTextView(resultText.toString());
                }
            });
        }
    }

}