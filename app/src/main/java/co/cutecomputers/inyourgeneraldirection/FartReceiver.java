package co.cutecomputers.inyourgeneraldirection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;


public class FartReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {


        MediaPlayer mp = MediaPlayer.create(context, R.raw.farty);

        mp.start();

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
}
