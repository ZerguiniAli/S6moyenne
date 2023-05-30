package com.example.s6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText exdam , tpdam , exia , tpia , exdss , tpdss , exsec , tpsec, red,start,projet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exdam = findViewById(R.id.exdam);
        tpdam = findViewById(R.id.tpdam);
        exia = findViewById(R.id.exia);
        tpia = findViewById(R.id.tpia);
        exdss = findViewById(R.id.exdss);
        tpdss = findViewById(R.id.tpdss);
        exsec = findViewById(R.id.exsec);
        tpsec = findViewById(R.id.tpsec);
        red = findViewById(R.id.exred);
        start = findViewById(R.id.start);
        projet = findViewById(R.id.projet);
        final int minValue = 00;
        final int maxValue = 20;

        exdam.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is not used
            }

            @Override
            public void afterTextChanged(Editable s) {
                String inputText = s.toString().trim();
                if (!inputText.isEmpty()) {
                    double value = Double.parseDouble(inputText);
                    if (value < minValue) {
                        s.replace(0, s.length(), String.valueOf(minValue));
                    } else if (value > maxValue) {
                        s.replace(0, s.length(), String.valueOf(maxValue));
                    }
                }
            }
        });
        tpdam.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is not used
            }

            @Override
            public void afterTextChanged(Editable s) {
                String inputText = s.toString().trim();
                if (!inputText.isEmpty()) {
                    double value = Double.parseDouble(inputText);
                    if (value < minValue) {
                        s.replace(0, s.length(), String.valueOf(minValue));
                    } else if (value > maxValue) {
                        s.replace(0, s.length(), String.valueOf(maxValue));
                    }
                }
            }
        });
        exia.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is not used
            }

            @Override
            public void afterTextChanged(Editable s) {
                String inputText = s.toString().trim();
                if (!inputText.isEmpty()) {
                    double value = Double.parseDouble(inputText);
                    if (value < minValue) {
                        s.replace(0, s.length(), String.valueOf(minValue));
                    } else if (value > maxValue) {
                        s.replace(0, s.length(), String.valueOf(maxValue));
                    }
                }
            }
        });
        tpia.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is not used
            }

            @Override
            public void afterTextChanged(Editable s) {
                String inputText = s.toString().trim();
                if (!inputText.isEmpty()) {
                    double value = Double.parseDouble(inputText);

                    if (value < minValue) {
                        s.replace(0, s.length(), String.valueOf(minValue));
                    } else if (value > maxValue) {
                        s.replace(0, s.length(), String.valueOf(maxValue));
                    }
                }
            }
        });
        exdss.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is not used
            }

            @Override
            public void afterTextChanged(Editable s) {
                String inputText = s.toString().trim();
                if (!inputText.isEmpty()) {
                    double value = Double.parseDouble(inputText);
                    if (value < minValue) {
                        s.replace(0, s.length(), String.valueOf(minValue));
                    } else if (value > maxValue) {
                        s.replace(0, s.length(), String.valueOf(maxValue));
                    }
                }
            }
        });
        tpdss.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is not used
            }

            @Override
            public void afterTextChanged(Editable s) {
                String inputText = s.toString().trim();
                if (!inputText.isEmpty()) {
                    double value = Double.parseDouble(inputText);

                    if (value < minValue) {
                        s.replace(0, s.length(), String.valueOf(minValue));
                    } else if (value > maxValue) {
                        s.replace(0, s.length(), String.valueOf(maxValue));
                    }
                }
            }
        });
        exsec.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is not used
            }

            @Override
            public void afterTextChanged(Editable s) {
                String inputText = s.toString().trim();
                if (!inputText.isEmpty()) {
                    double value = Double.parseDouble(inputText);
                    if (value < minValue) {
                        s.replace(0, s.length(), String.valueOf(minValue));
                    } else if (value > maxValue) {
                        s.replace(0, s.length(), String.valueOf(maxValue));
                    }
                }
            }
        });
        tpsec.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is not used
            }

            @Override
            public void afterTextChanged(Editable s) {
                String inputText = s.toString().trim();
                if (!inputText.isEmpty()) {
                    double value = Double.parseDouble(inputText);
                    if (value < minValue) {
                        s.replace(0, s.length(), String.valueOf(minValue));
                    } else if (value > maxValue) {
                        s.replace(0, s.length(), String.valueOf(maxValue));
                    }
                }
            }
        });
        red.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is not used
            }

            @Override
            public void afterTextChanged(Editable s) {
                String inputText = s.toString().trim();
                if (!inputText.isEmpty()) {
                    double value = Double.parseDouble(inputText);

                    if (value < minValue) {
                        s.replace(0, s.length(), String.valueOf(minValue));
                    } else if (value > maxValue) {
                        s.replace(0, s.length(), String.valueOf(maxValue));
                    }
                }
            }
        });
        start.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is not used
            }

            @Override
            public void afterTextChanged(Editable s) {
                String inputText = s.toString().trim();
                if (!inputText.isEmpty()) {
                    double value = Double.parseDouble(inputText);
                    if (value < minValue) {
                        s.replace(0, s.length(), String.valueOf(minValue));
                    } else if (value > maxValue) {
                        s.replace(0, s.length(), String.valueOf(maxValue));
                    }
                }
            }
        });
        projet.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is not used
            }

            @Override
            public void afterTextChanged(Editable s) {
                String inputText = s.toString().trim();
                if (!inputText.isEmpty()) {
                    double value = Double.parseDouble(inputText);
                    if (value < minValue) {
                        s.replace(0, s.length(), String.valueOf(minValue));
                    } else if (value > maxValue) {
                        s.replace(0, s.length(), String.valueOf(maxValue));
                    }
                }
            }
        });

    }

    public double UN (double m1 , int c1 , double m2 , int c2)
    {
        double M1 = m1 * c1 ;
        double M2 = m2 * c2 ;
        return  ((M1 + M2) / (c1 + c2));
    }
    public  double module (double ex , double tp)
    {
        double moyenne = (ex * 0.6) + (tp * 0.4);
        return moyenne;
    }

    public double moyenne (double M1, double M2 , double M3 , double M4, double M5 , double M6 , double M7)
    {
        double mo = (M1*3 + M2*3 + M3*3 + M4*3 + M5 + M6 + M7*3) / 17 ;
        return mo;
    }

    public void calc (View v)
    {
        String Exdam = (exdam.getText().toString());
        String Tpdam = (tpdam.getText().toString());
        String Exia = (exia.getText().toString());
        String Tpia = (tpia.getText().toString());
        String Exdss = (exdss.getText().toString());
        String Tpdss = (tpdss.getText().toString());
        String Exsec = (exsec.getText().toString());
        String Tpsec = (tpsec.getText().toString());
        String Red = (red.getText().toString());
        String Start = start.getText().toString();
        String Projet = projet.getText().toString();

        if (Exdam.isEmpty() || Tpdam.isEmpty() || Exia.isEmpty() || Tpia.isEmpty() || Exdss.isEmpty() ||Tpdss.isEmpty()
        || Exsec.isEmpty()||Tpsec.isEmpty() ||Red.isEmpty() ||Start.isEmpty() ||Projet.isEmpty())
        {
            Toast.makeText(this, "Make sure you entered all the values", Toast.LENGTH_SHORT).show();
        }
        else
        {
            double EXDAM  = Double.valueOf(Exdam);
            double TPDAM = Double.valueOf(Tpdam);
            double EXIA = Double.valueOf(Exia);
            double TPIA  = Double.valueOf(Tpia);
            double EXDSS = Double.valueOf(Exdss);
            double TPDSS = Double.valueOf(Tpdss);
            double EXSEC  = Double.valueOf(Exsec);
            double TPSEC = Double.valueOf(Tpsec);
            double RED = Double.valueOf(Red);
            double START  = Double.valueOf(Start);
            double PROJET = Double.valueOf(Projet);

            double DAM = module(EXDAM , TPDAM);
            double IA = module(EXIA , TPIA);
            double SEC = module(EXSEC , TPSEC);
            double DSS = module(EXDSS , TPDSS);

            double UE1 = UN(IA , 3 , DSS , 3);
            double UE2 = UN(DAM , 3 , SEC , 3);
            double UE3 = UN(RED , 1 , PROJET , 3);

            double res = moyenne(DAM , IA ,SEC , DSS , RED , START ,PROJET );
            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            double RES = Double.parseDouble(decimalFormat.format(res));
            Intent intent = new Intent(getApplicationContext() , resullt.class);
            intent.putExtra("dss" ,String.valueOf(decimalFormat.format(DSS)));
            intent.putExtra("DAM" , String.valueOf(decimalFormat.format(DAM)));
            intent.putExtra("IA" ,String.valueOf(decimalFormat.format(IA)));
            intent.putExtra("SEC" , String.valueOf(decimalFormat.format(SEC)));
            intent.putExtra("RED" , String.valueOf(decimalFormat.format(RED)));
            intent.putExtra("START",String.valueOf(decimalFormat.format(START)));
            intent.putExtra("PROJET",String.valueOf(decimalFormat.format(PROJET)));
            intent.putExtra("UE1",String.valueOf(decimalFormat.format(UE1)));
            intent.putExtra("UE2",String.valueOf(decimalFormat.format(UE2)));
            intent.putExtra("UE3",String.valueOf(decimalFormat.format(UE3)));
            intent.putExtra("res",String.valueOf(decimalFormat.format(RES)));
            startActivity(intent);
        }

    }

}