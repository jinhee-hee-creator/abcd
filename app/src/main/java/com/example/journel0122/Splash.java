package com.example.journel0122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash );

        Handler handler = new Handler();
        handler.postDelayed( new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent( getApplicationContext(), AuthActivity.class );
                intent.putExtra( "to say", "journelAPP" );
                startActivity( intent );
                finish();

            }
        }, 2000 );
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}