package com.example.journel0122;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_auth );

        String toSay = getIntent().getStringExtra( "to say" );
        TextView tv = findViewById( R.id.tv );
        tv.setText( toSay );

    }
}