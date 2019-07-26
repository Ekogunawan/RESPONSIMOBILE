package com.gmail.akakom16.eko.responsimobile;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
//TODO 1 java : yaitu program di atas adalah package dari class java sendiri yang bisas di panggil kapanpun
public class MyService extends Service {
    //TODO 2 java: Yaitu program di atas adalah class service dari class java yang di guanakan dengan extend ke class turunan dengan nama service

    MediaPlayer mediaPlayer;
    public MyService() {
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate(){
        mediaPlayer=MediaPlayer.create(this, R.raw.perfect);
        mediaPlayer.setLooping(true);
        //TODO 3: membuat class raw dengan isi file dengan nama perfect

    }
    @Override
    public int onStartCommand(Intent intent,int flags, int startId){
        mediaPlayer.start();
        return START_STICKY;
        //TODO 4: membuat method ketika menjalankan musik

    }
    @Override
    public void onDestroy(){
        mediaPlayer.stop();
        //TODO 5: membuat method ketika mematikan musik
    }
}
