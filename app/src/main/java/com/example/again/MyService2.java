package com.example.again;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService2  extends Service {
    private static final String TAG = "MyService";
    MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {




        player = MediaPlayer.create(this, R.raw.train);
        player.setLooping(true);
    }
    @Override
    public int  onStartCommand(Intent intent, int startid, int flag) {

        player.start();
        return super.onStartCommand(intent, flag, startid);
    }


    @Override
    public void onDestroy() {

        player.stop();

    }



}

