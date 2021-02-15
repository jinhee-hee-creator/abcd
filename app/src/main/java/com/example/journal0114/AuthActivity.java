
package com.example.journal0114;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_auth );

        String toSay = getIntent().getStringExtra( "할말" );
        TextView textView = findViewById( R.id.tvAuth );
        textView.setText( toSay );
    }
}