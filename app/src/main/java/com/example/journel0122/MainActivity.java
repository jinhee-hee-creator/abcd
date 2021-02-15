package com.example.journel0122;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
            case R.id.setting:
                Toast.makeText( getApplicationContext(), "메뉴", Toast.LENGTH_LONG ).show();
                break;
            case R.id.sin:
                Toast.makeText( getApplicationContext(), "얼큰", Toast.LENGTH_LONG ).show();
                break;
            case R.id.jin:
                Toast.makeText( getApplicationContext(), "맵싹", Toast.LENGTH_LONG ).show();
                break;
            case R.id.yeol:
                Toast.makeText( getApplicationContext(), "든든", Toast.LENGTH_LONG ).show();
                break;

        }


        return super.onOptionsItemSelected( item );
    }
}