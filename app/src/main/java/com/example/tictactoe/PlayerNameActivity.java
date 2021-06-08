package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.security.FileIntegrityManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.tictactoe.R.layout.*;

public class PlayerNameActivity extends AppCompatActivity {
EditText player1,player2;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_player_name);

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        player1=findViewById(R.id.editTextTextPersonName);
        player2=findViewById(R.id.editTextTextPersonName2);
    }
    public void playButtonClick(View view)
    {if (player1.getText().toString().isEmpty())
    {
        Toast.makeText(this, "ENTER PLAYER NAME 1", Toast.LENGTH_SHORT).show();
    }
    else if (player2.getText().toString().isEmpty())
    {
        Toast.makeText(this, "ENTER PLAYER NAME 2", Toast.LENGTH_SHORT).show();
    }
    else {
        String player0=this.player1.getText().toString();
        String player1=this.player2.getText().toString();
        sharedPreferences.edit().putString("player0", player0).putString("player1",player1).apply();
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }
    }
}