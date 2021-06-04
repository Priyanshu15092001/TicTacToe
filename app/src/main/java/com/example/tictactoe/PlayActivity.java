package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.tictactoe.R.layout.activity_play;
import static com.example.tictactoe.R.layout.activty_home;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_play);
    }
    public void homeButtonClick(View view)
    {
        Intent intent=new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
public void playagainButtonClick(View view)
{
    Intent intent=new Intent(this,PlayActivity.class);
    startActivity(intent);
}
}