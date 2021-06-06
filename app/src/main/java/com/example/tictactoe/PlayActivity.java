package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.tictactoe.R.layout.activity_play;
import static com.example.tictactoe.R.layout.activty_home;

public class PlayActivity extends AppCompatActivity {
int playerturn=0;
int flag=-9999;
TextView textView;
int gameestate[]={-1,-1,-1,-1,-1,-1,-1,-1,-1};
int allwinstate[][]={{0,1,2},
                 {3,4,5},
                 {6,7,8},
                 {0,3,6},
                 {1,4,7},
                 {2,5,8},
                 {0,4,8},
                 {2,4,6}};
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
{if(flag==-9999)
{
    ImageView imageView= (ImageView)view;
    int tag=Integer.parseInt(imageView.getTag().toString());
    if (gameestate[tag]!=-1)
    {
        Toast.makeText(this,"Already Tapped",Toast.LENGTH_LONG).show();
    }
    else {
        gameestate[tag] = playerturn;


        if (playerturn == 0) {
            imageView.setImageResource(R.drawable.o);
            playerturn = 1;
            textView.setText("X's turn");
        } else if (playerturn == 1) {
            imageView.setImageResource(R.drawable.x);
            playerturn = 0;
            textView.setText("O's turn");
        }
        for (int[] onewinstate : allwinstate) {
            if (gameestate[onewinstate[0]] == 0 &&
                    gameestate[onewinstate[0]] == gameestate[onewinstate[1]] &&
                    gameestate[onewinstate[1]] == gameestate[onewinstate[2]]) {
                flag = 0;
                break;
            } else if (gameestate[onewinstate[0]] == 1 &&
                    gameestate[onewinstate[0]] == gameestate[onewinstate[1]] &&
                    gameestate[onewinstate[1]] == gameestate[onewinstate[2]]) {
                flag = 1;
                break;
            } else {
                for (int k : gameestate) {
                    flag = -1;
                    if (k == -1) {
                        flag = -9999;
                        break;
                    }

                }

            }
        }

        if (flag == 0)
            textView.setText("Player O wins");
        else if (flag == 1)
            textView.setText("Player X wins");
        else if (flag == -1)
            textView.setText("Draw");
    }

    }
    else
{
    Toast.makeText(this,"",Toast.LENGTH_LONG);
}
}
}