package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.security.FileIntegrityManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.tictactoe.R.layout.*;

public class PlayerNameActivity extends AppCompatActivity {
EditText player1,player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_player_name);
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
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }
    }
}