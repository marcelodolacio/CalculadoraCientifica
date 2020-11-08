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
//        btn_2nd = findViewById(R.id.btn_2nd);  // OK
//        btn_deg = findViewById(R.id.btn_deg); // OK
        btn_sin = findViewById(R.id.btn_sin); // OK
        btn_cos = findViewById(R.id.btn_cos); // OK
        btn_tan = findViewById(R.id.btn_tan); // OK
        btn_elevate = findViewById(R.id.btn_elevate); // OK
        btn_lg = findViewById(R.id.btn_lg); // OK
//        btn_ln = findViewById(R.id.btn_ln);// OK
        btn_Lparentheses = findViewById(R.id.btn_Lparentheses);// OK
        btn_Rparentheses = findViewById(R.id.btn_Rparentheses);// OK
        btn_square = findViewById(R.id.btn_square);// OK
        btn_clear = findViewById(R.id.btn_clear);// OK
        btn_backspace = findViewById(R.id.btn_backspace);// OK
        btn_percent = findViewById(R.id.btn_percent);// OK
        btn_division = findViewById(R.id.btn_division);// OK
        btn_fatorial = findViewById(R.id.btn_fatorial);// OK
        btn_7 = findViewById(R.id.btn_7);// OK
        btn_8 = findViewById(R.id.btn_8);// OK
        btn_9 = findViewById(R.id.btn_9);// OK
        btn_multiplicate = findViewById(R.id.btn_multiplicate);// OK
        btn_divisionX = findViewById(R.id.btn_divisionX);// OK
        btn_4 = findViewById(R.id.btn_4);// OK
        btn_5 = findViewById(R.id.btn_5);// OK
        btn_6 = findViewById(R.id.btn_6);// OK
        btn_minus = findViewById(R.id.btn_minus);// OK
        btn_pi = findViewById(R.id.btn_pi);// OK
        btn_1 = findViewById(R.id.btn_1);// OK
        btn_2 = findViewById(R.id.btn_2);// OK
        btn_3 = findViewById(R.id.btn_3);// OK
        btn_plus = findViewById(R.id.btn_plus);// OK
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
        //PRIMEIRA LINHA DE BOTOES
//        btn_2nd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String val = tv_main.getText().toString();
//                tv_main.setText(val+btn_2nd.getText().toString());
//            }
//        });
//        btn_deg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String val = tv_main.getText().toString();
//                tv_main.setText(val+btn_deg.getText().toString());
//            }
//        });
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_main.setText(tv_main.getText()+"sin");
            }
        });
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_main.setText(tv_main.getText()+"cos");
            }
        });
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_main.setText(tv_main.getText()+"tan");
            }
        });

        //SEGUNDA LINHA DE BOTOES
        btn_elevate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_main.setText(tv_main.getText()+"x^y");;
            }
        });
        btn_lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_lg.getText().toString());
            }
        });
//        btn_ln.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String val = tv_main.getText().toString();
//                tv_main.setText(val+btn_ln.getText().toString());
//            }
//        });
        btn_Lparentheses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_main.setText(tv_main.getText()+"(");
            }
        });
        btn_Rparentheses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_main.setText(tv_main.getText()+")");
            }
        });

        //TERCEIRA LINHA DE BOTOES
        btn_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val = tv_main.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                String result = String.valueOf(r);
                tv_main.setText(result);
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_main.setText("");
                tv_secundary.setText("");
            }
        });
        btn_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val = tv_main.getText().toString();
                val = val.substring(0, val.length() - 1);
                tv_main.setText(val);
            }
        });
        btn_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val = tv_main.getText().toString();
                val = val.substring(0, val.length() - 1);
                tv_main.setText(val);
            }
        });
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val = tv_main.getText().toString();
                if (!val.equals(""))
                {
                    tv_main.setText(val+btn_division.getText().toString());
                }
            }
        });

        // QUARTA LINHA DE BOTOES
        btn_fatorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv_main.getText().toString().contains(".")){
                    tv_main.setText("error! only integer numbers");
                }else{
                    int val = Integer.parseInt(tv_main.getText().toString());
                    int fact = factorial(val);
                    tv_main.setText(String.valueOf(fact));
                    tv_secundary.setText(val+"!"+"\n");
                }

            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_7.getText().toString());
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_8.getText().toString());
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_9.getText().toString());
            }
        });
        btn_multiplicate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                char last = val.charAt(val.length() -1);
                if (!val.equals(""))
                {
                    tv_main.setText(val+btn_multiplicate.getText().toString());
                }
            }
        });

        //QUINTA LINHA DE BOTOES
        btn_divisionX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_divisionX.getText().toString());
                String[] array = val.split("1/x");
                if(array[0].isEmpty()){
                    tv_main.setText("error!");
                }else{
                    double x1 = Double.parseDouble(array[0]);
                    tv_main.setText(1/x1 + "");
                }

            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_4.getText().toString());
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_5.getText().toString());
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_6.getText().toString());
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                char last = val.charAt(val.length() -1);
                if (last!='-')
                {
                    tv_main.setText(val+btn_minus.getText().toString());
                }
            }
        });

        //SEXTA LINHA DE BOTOES
        btn_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // tv_main.setText(tv_main.getText()+btn_pi.getText().toString());
                tv_main.setText(tv_main.getText()+"3.14");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_1.getText().toString());
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_2.getText().toString());
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_3.getText().toString());
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                if (!val.equals(""))
                {
                    tv_main.setText(val+btn_plus.getText().toString());
                }

            }
        });

        //SÉTIMA LINHA DE BOTOES

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_0.getText().toString());
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tv_main.getText().toString();
                tv_main.setText(val+btn_dot.getText().toString());
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tv_main.getText().toString().contains("x^y")){

                    String expression = tv_main.getText().toString();
                    String aux = expression.replace("x^y", "Elevate");
                    String[] array = aux.split("Elevate");
                    double x1 = Double.parseDouble(array[0]);
                    double x2 = Double.parseDouble(array[1]);
                    tv_main.setText(Math.pow(x1, x2) + "");
                }else if(tv_main.getText().toString().contains("lg")){

                    String expression = tv_main.getText().toString();

                    String[] array = expression.split("lg");
                    if(array[0].isEmpty()) {
                        double aux = Double.parseDouble(array[1]);
                        tv_main.setText(Math.log10(aux) + "");
                    }else{
                        double aux = Double.parseDouble(array[0]);
                        tv_main.setText(Math.log10(aux) + "");
                    }

                }else {
                    String val = tv_main.getText().toString();
                    String replacedString = val.replace('÷','/').replace('×', '*');
                    double result = Eval.eval(replacedString);
                    String r = String.valueOf(result);
                    tv_main.setText(r);
                    tv_secundary.setText(tv_secundary.getText().toString()+val+"\n");
                }

            }
        });


    }

    //METODO QUE FAZ O FATORIAL
    int factorial(int n)
    {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);

    }

}