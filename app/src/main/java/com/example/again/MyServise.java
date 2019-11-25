package com.example.again;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
public class MyServise extends Service {
    private static final String TAG = "MyService";
    MediaPlayer player, player1, player2;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {


        player = MediaPlayer.create(this, R.raw.bg);
        player.setLooping(true);
        player1 = MediaPlayer.create(this, R.raw.consantraite);
        player1.setLooping(true);
        player2 = MediaPlayer.create(this, R.raw.train);
        player2.setLooping(true);
    }
    @Override
    public int  onStartCommand(Intent intent, int startid, int flag) {

        player.start();
        return super.onStartCommand(intent, flag, startid);
    }


    @Override
    public void onDestroy() {

        player.stop();
        player1.stop();
        player2.stop();
    }



}
