package com.example.journal0114;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Toolbar tb = findViewById( R.id.toolbar );
        setSupportActionBar( tb );



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate( R.menu.toolbar_menu, menu );
        return super.onCreateOptionsMenu( menu );
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.family:
                Toast.makeText( getApplicationContext(), "우리가족", Toast.LENGTH_LONG ).show();
                break;
            case R.id.d1:
                Toast.makeText( getApplicationContext(), "영원한 쟁반", Toast.LENGTH_LONG ).show();
                break;
            case R.id.d2:
                Toast.makeText( getApplicationContext(), "모기도 못잡는 쫄보", Toast.LENGTH_LONG ).show();
                break;
        }
        return super.onOptionsItemSelected( item );
    }
}