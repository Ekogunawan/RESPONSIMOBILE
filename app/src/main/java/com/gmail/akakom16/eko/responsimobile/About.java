package com.gmail.akakom16.eko.responsimobile;
//TODO 1 java : yaitu program di atas  adalah package dari nama projec
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//TODO 2 java : yaitu program di atas adalah package dari class java sendiri yang bisas di panggil kapanpun

public class About extends AppCompatActivity {
//TODO 3 java: Yaitu program di atas adalah class about dari class java yang di guanakan dengan extend ke class turunan dengan nama appCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //TODO 4 java: Yaitu program di atas yaitu untuk fungsi ketika android akan di jalankan dan akan terhubung ke activity xml

    }
}
