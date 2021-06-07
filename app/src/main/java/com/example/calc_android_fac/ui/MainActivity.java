package com.example.calc_android_fac.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calc_android_fac.R;
import com.example.calc_android_fac.entity.AppTheme;
import com.example.calc_android_fac.entity.ArifmeticActions;
import com.example.calc_android_fac.entity.Calculator;
import com.example.calc_android_fac.entity.ThemeStorage;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    TextView resultTextView;
    StringBuffer resultText = new StringBuffer("");
    Calculator calc = new Calculator();
    boolean canIClearDisplay = false;

    ThemeStorage themeStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setTheme(R.style.MyTheme_dark);
        themeStorage = new ThemeStorage(this);
        setTheme(themeStorage.getTheme().getResource());

        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);

        findViewById(R.id.change_theme).setOnClickListener(v -> {
            if (themeStorage.isDarkTheme()) {
                themeStorage.setTheme(AppTheme.DEFAULT);
            } else {
                themeStorage.setTheme(AppTheme.CUSTOM);
            }

            recreate();
        });

        initNumberKeys();

        findViewById(R.id.key_dot).setOnClickListener(v -> {
            if (!resultText.toString().contains(".")) {
                resultText.append(".");
                updateResultTextView(resultText.toString());
            }
        });
        findViewById(R.id.key_plus).setOnClickListener(v -> {
                    mathAction(ArifmeticActions.PLUS);
                }
        );

        findViewById(R.id.key_minus).setOnClickListener(v ->
                mathAction(ArifmeticActions.MINUS));

        findViewById(R.id.key_equals).setOnClickListener(v -> mathAction(ArifmeticActions.EQUALS));

        findViewById(R.id.key_multiply).setOnClickListener(v -> mathAction(ArifmeticActions.MULTIPLY));

        findViewById(R.id.key_divide).setOnClickListener(v -> mathAction(ArifmeticActions.DIVIDE));

        findViewById(R.id.key_backspace).setOnClickListener(v -> {
            if (resultText.length() > 0) {
                resultText.setLength(resultText.length() - 1);
                updateResultTextView(resultText.toString());
            }
        });

        findViewById(R.id.key_reset).setOnClickListener(v -> {
            calc = new Calculator();
            clearDisplay();
        });
    }

    private void updateResultTextView(String str) {
//        calc.setResult(Double.parseDouble(resultTextView.toString()));
        resultTextView.setText(str);
    }

    private void clearDisplay() {
        resultText.delete(0, resultText.length());
        updateResultTextView(resultText.toString());
    }

    private void initNumberKeys() {
        Set<Integer> buttons = new HashSet<>(Arrays.asList(R.id.key_1, R.id.key_2,
                R.id.key_3, R.id.key_4, R.id.key_5, R.id.key_6, R.id.key_7, R.id.key_8,
                R.id.key_9, R.id.key_0));
        for (Integer btn : buttons) {
            findViewById(btn).setOnClickListener(v -> {
                if (canIClearDisplay) {
                    clearDisplay();
                    canIClearDisplay = false;
                }
                Button btn1 = (Button) v;
                resultText.append(btn1.getText());
                updateResultTextView(resultText.toString());
            });
        }
    }

    private void mathAction(ArifmeticActions arifmeticActions) {
        if (calc.getFirstArg() == null) {
            calc.setFirstArg(Double.parseDouble(resultText.toString()));
            calc.setArifmeticActions(arifmeticActions);
            canIClearDisplay = true;
        } else if (calc.getFirstArg() != null && calc.getSecondArg() == null) {
            calc.setSecondArg(Double.parseDouble(resultText.toString()));
            calc.eq();
            if (calc.getArifmeticActions() == ArifmeticActions.EMPTY) {
                calc.setArifmeticActions(arifmeticActions);
            }
            updateResultTextView(calc.getResult().toString());
            canIClearDisplay = true;
        }
    }
}