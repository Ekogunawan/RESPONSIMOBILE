package com.gmail.akakom16.eko.responsimobile;
//TODO 1 java : yaitu program di atas  adalah package dari nama projec
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
//TODO 2 java : yaitu program di atas adalah package dari class java sendiri yang bisas di panggil kapanpun

public class MainActivity extends AppCompatActivity {
//TODO 3 java: Yaitu program di atas adalah class MainActivity dari class java yang di guanakan dengan extend ke class turunan dengan nama appCompatActivity

      EditText editText1 ,editText2; //Deklarasi object dari class EdiText
    String text1 ,text2; //Deklarasi object string
    // TODO 4 java : Yaitu program di atas adalah mendeklarasikan Variabel yang sifatnya pubic yang bisa di akases di bebagai class di dalam java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO 5 java: Yaitu program di atas yaitu untuk fungsi ketika android akan di jalankan dan akan terhubung ke activity xml
    }
    public void loginMasuk(View view) {
        editText1 = (EditText)findViewById(R.id.edittext_username);
        editText2 = (EditText) findViewById(R.id.edittext_password);
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();
//TODO 6 java: Yaitu program di atas yaitu untuk Method onClick pada Button


        if ((text1.contains("Username"))&&((text2.contains("Password")))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
            //TODO 7 java: Yaitu program di atas yaitu untuk  Kondisi jika username dan password benar maka akan menampilkan pesan text toast  dan Login sukses dan masuk ke activity 2
        }

        else if ((text1.matches("")||text2.matches("")))

        //TODO 8 java: Yaitu program di atas yaitu untuk  Atau jika input text 1 dan text 2 kosong

        {

            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show();
//TODO 9 java: Yaitu program di atas yaitu Maka akan menampilkan pesan text toast
        }

        else {


            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show();
            //TODO 9 java: Yaitu program di atas yaitu jika kedua kondisi diatas tidak memenuhi
        }
    }
}
