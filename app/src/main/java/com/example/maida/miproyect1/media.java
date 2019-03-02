package com.example.maida.miproyect1;

import android.media.MediaPlayer;

public class media {

    private MediaPlayer ring;

    public media(MainActivity act)
    {
        ring = MediaPlayer.create(act, R.raw.despacito);
    }

    public void play()
    {
        ring.start();
    }

    public void pause()
    {
        ring.pause();
    }

    public void stop()
    {
        ring.stop();
    }
}
