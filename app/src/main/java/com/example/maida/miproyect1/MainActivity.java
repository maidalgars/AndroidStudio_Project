package com.example.maida.miproyect1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _media= new media(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Paso ", Toast.LENGTH_SHORT).show();
    }

    private media _media;

    public void ClickPlay(View view) {
        this._media.play();
    }

    public void ClickPause(View view) {
        this._media.pause();
    }

    public void ClickStop(View view) {
        this._media.stop();
    }

}