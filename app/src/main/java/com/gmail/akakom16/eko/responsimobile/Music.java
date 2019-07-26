package com.gmail.akakom16.eko.responsimobile;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//TODO 1 java : yaitu program di atas adalah package dari class java sendiri yang bisas di panggil kapanpun


public class Music extends AppCompatActivity implements View.OnClickListener{
    //TODO 2 java: Yaitu program di atas adalah class music dari class java yang di guanakan dengan extend ke class turunan dengan nama appCompatActivity

    EditText editWaktu;
    Button tombolPlay;
    Button tombolStop;
    //TODO 3 : mendeklarasikan variabel dari masing masing componen yaitu etittext dan button
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        editWaktu = findViewById(R.id.et_waktu);
        tombolPlay = findViewById(R.id.bt_play);
        tombolStop = findViewById(R.id.bt_stop);
        tombolPlay.setOnClickListener(this);
        tombolStop.setOnClickListener(this);
          //TODO 4 : Mendeklarasikan class untuk pertama kali android studio di jalankan atau aplikasi di jalankan

      }
    @Override
     public void onClick(View view){
        switch (view.getId()){
            case R.id.bt_play:
                callPlay();
                break;
            case R.id.bt_stop:
                stopPlay();
                break;
            //TODO 5 : mendeklarasikan method void untuk perintah jika di clikk untuk id bt_play untuk method callpalya dan bt_stop dengan method stopplay

        }
    }
      public void callPlay() {
        int detik = Integer.parseInt(editWaktu.getText().toString());
        Intent intent = new Intent(Music.this, MyService.class);

        PendingIntent pendingIntent = PendingIntent.getService(Music.this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
          //TODO 6 : memdeklarasikan method callplay dengan di dalamnya akan di deklarasikan pending intent untuk menunda waktu intent di jalankan

       if (alarmManager != null) {
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (detik * 1000), pendingIntent);
            Toast.makeText(getApplicationContext(), "song play after" + detik + "second !", Toast.LENGTH_LONG).show();
        }
          // TODO 7 : Mendeklarasikan alarm manager jika sistem android mempunyai sistem alarm managaer

      }
     public void stopPlay(){
        stopService(new Intent(Music.this, MyService.class));
    }
    //TODO 8 : mendeklarasikan method stopplay dengna mengisikan stop jika di klik intent pada button stop

}
