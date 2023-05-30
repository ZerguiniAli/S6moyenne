package com.example.s6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resullt extends AppCompatActivity {

    TextView dss , ia , f1 , se , dam , f2 , red , pr, me , st , res ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resullt);
        dss = findViewById(R.id.ds);
        ia = findViewById(R.id.Ia);
        f1 = findViewById(R.id.U1);
        se = findViewById(R.id.sec);
        dam = findViewById(R.id.dam);
        f2 = findViewById(R.id.U2);
        red = findViewById(R.id.Red);
        pr = findViewById(R.id.PRJ);
        me = findViewById(R.id.ME);
        st = findViewById(R.id.start);
        res = findViewById(R.id.res);

        Intent intent = getIntent();
        String Dss = intent.getStringExtra("dss");
        String Dam = intent.getStringExtra("DAM");
        String Ia = intent.getStringExtra("IA");
        String Sec = intent.getStringExtra("SEC");
        String Red = intent.getStringExtra("RED");
        String Start = intent.getStringExtra("START");
        String Projet = intent.getStringExtra("PROJET");
        String Ue1 = intent.getStringExtra("UE1");
        String Ue2 = intent.getStringExtra("UE2");
        String Ue3 = intent.getStringExtra("UE3");
        String Res = intent.getStringExtra("res");

        dss.setText(Dss);
        ia.setText(Ia);
        f1.setText(Ue1);
        se.setText(Sec);
        dam.setText(Dam);
        f2.setText(Ue2);
        red.setText(Red);
        pr.setText(Projet);
        me.setText(Ue3);
        st.setText(Start);
        res.setText(Res);
    }
}