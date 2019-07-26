package com.gmail.akakom16.eko.responsimobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
//TODO 1 java : yaitu program di atas adalah package dari class java sendiri yang bisas di panggil kapanpun
public class SecondActivity extends AppCompatActivity {
    //TODO 2 java: Yaitu program di atas adalah class kedua dari class java yang di guanakan dengan extend ke class turunan dengan nama appCompatActivity

    Button btnGrafik,btnData,btnLike,btnPesan,btnView,btnWeb,btnCari,btnKomentar,btnNotifikasi;
    //TODO 3 java: Yaitu program diatas mendeklarasikan variabel
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//TODO 4 java: Yaitu program diatas mendeklarasikan fungsi saat android dijalankan
        //Get ID tombol & Event Tombol
        btnGrafik= (Button) findViewById(R.id.btnAbout);
        btnGrafik.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol ABOUT", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this, About.class);
                startActivity(intent);
//TODO 5 java: Yaitu program diatas mendeklarasikan nilai variabel ketika di clikk akan berpindah activity lain
            } });

        btnData= (Button) findViewById(R.id.btnDatas);
        btnData.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol VIEW", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this, DataView.class);
                startActivity(intent);
                //TODO 6 java: Yaitu program diatas mendeklarasikan nilai variabel ketika di clikk akan berpindah activity lain
            } });

        btnLike= (Button) findViewById(R.id.btnMusic);
        btnLike.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol MUSIC", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this, Music.class);
                startActivity(intent);
                //TODO 7 java: Yaitu program diatas mendeklarasikan nilai variabel ketika di clikk akan berpindah activity lain
            } });

        btnPesan= (Button) findViewById(R.id.btnPhone);
        btnPesan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol PHONE", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this, Phone.class);
                startActivity(intent);
//TODO 8 java: Yaitu program diatas mendeklarasikan nilai variabel ketika di clikk akan berpindah activity lain

            } });

        btnView= (Button) findViewById(R.id.btnCamera);
        btnView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol CAMERA", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this, Camera.class);
                startActivity(intent);
//TODO 49java: Yaitu program diatas mendeklarasikan nilai variabel ketika di clikk akan berpindah activity lain
            } });

        btnWeb= (Button) findViewById(R.id.btnWeb);
        btnWeb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol WEB SERVICE", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this, WebService.class);
                startActivity(intent);
                //TODO 10 java: Yaitu program diatas mendeklarasikan nilai variabel ketika di clikk akan berpindah activity lain
            } });

    }
}
