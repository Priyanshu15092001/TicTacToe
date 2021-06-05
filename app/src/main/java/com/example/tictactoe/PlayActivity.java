package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.tictactoe.R.layout.activity_play;
import static com.example.tictactoe.R.layout.activty_home;

public class PlayActivity extends AppCompatActivity {
int playerturn=0;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_play);
        textView=(TextView)findViewById(R.id.textView3);
        textView.setText("O's turn");
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
public void playerTapped(View view)
{
    ImageView imageView= (ImageView)view;
    int tag=Integer.parseInt(imageView.getTag().toString());
if (playerturn == 0)
{
    imageView.setImageResource(R.drawable.o);
    playerturn=1;
    textView.setText("X's turn");
}
else if (playerturn==1)
{
    imageView.setImageResource(R.drawable.x);
    playerturn=0;
    textView.setText("O's turn");
}
}
}