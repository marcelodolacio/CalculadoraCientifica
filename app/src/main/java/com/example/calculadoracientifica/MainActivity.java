package com.example.calculadoracientifica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView tv_main,tv_secundary;
    Button  btn_2nd, btn_deg, btn_sin, btn_cos, btn_tan, btn_elevate, btn_lg, btn_ln, btn_Lparentheses, btn_Rparentheses, btn_square, btn_clear, btn_backspace, btn_percent, btn_division, btn_fatorial,
            btn_7, btn_8, btn_9, btn_multiplicate, btn_divisionX, btn_4, btn_5, btn_6, btn_minus, btn_pi, btn_1, btn_2, btn_3, btn_plus, btn_0, btn_dot, btn_equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RECUPERANDO PELO (COMPONENTE TEXTVIEW)
        tv_main = findViewById(R.id.tv_main);
        tv_secundary = findViewById(R.id.tv_secundary);

        // RECUPERANDO PELO (COMPONENTE BUTTON)
        btn_2nd = findViewById(R.id.btn_2nd);
        btn_deg = findViewById(R.id.btn_deg);
        btn_sin = findViewById(R.id.btn_sin);
        btn_cos = findViewById(R.id.btn_cos);
        btn_tan = findViewById(R.id.btn_tan);
        btn_elevate = findViewById(R.id.btn_elevate);
        btn_lg = findViewById(R.id.btn_lg);
        btn_ln = findViewById(R.id.btn_ln);
        btn_Lparentheses = findViewById(R.id.btn_Lparentheses);
        btn_Rparentheses = findViewById(R.id.btn_Rparentheses);
        btn_square = findViewById(R.id.btn_square);
        btn_clear = findViewById(R.id.btn_clear);
        btn_backspace = findViewById(R.id.btn_backspace);
        btn_percent = findViewById(R.id.btn_percent);
        btn_division = findViewById(R.id.btn_division);
        btn_fatorial = findViewById(R.id.btn_fatorial);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_multiplicate = findViewById(R.id.btn_multiplicate);
        btn_divisionX = findViewById(R.id.btn_divisionX);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_minus = findViewById(R.id.btn_minus);
        btn_pi = findViewById(R.id.btn_pi);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_plus = findViewById(R.id.btn_plus);
        btn_0 = findViewById(R.id.btn_0);
        btn_dot = findViewById(R.id.btn_dot);
        btn_equal = findViewById(R.id.btn_equal);

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_7.getText().toString());
            }
        });

    }
}