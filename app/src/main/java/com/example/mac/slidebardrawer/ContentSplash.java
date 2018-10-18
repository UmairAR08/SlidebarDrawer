package com.example.mac.slidebardrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContentSplash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout.content_splash);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000); // waktu pending 3 Detik
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }finally {
                    startActivity(new Intent(ContentSplash.this, MainActivity.class));
                }
            }
        });
        thread.start();
    }
}
