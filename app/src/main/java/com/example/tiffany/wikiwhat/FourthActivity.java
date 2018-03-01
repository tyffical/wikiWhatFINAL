package com.example.tiffany.wikiwhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    private int score;
    private TextView scoreNum;
    private TextView scoreText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        final Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);
        scoreNum = (TextView) findViewById(R.id.scorenumber);
        scoreNum.setText(String.valueOf(score));
        scoreText = (TextView) findViewById(R.id.scoretext);
        showScoreMessage();
    }

    public void showScoreMessage(){
        switch(score){
            case 0: scoreText.setText(getString(R.string.scorezero));
            case 1: scoreText.setText(getString(R.string.scoreone));
            case 2: scoreText.setText(getString(R.string.scoretwo));
            case 3: scoreText.setText(getString(R.string.scorethree));
            case 4: scoreText.setText(getString(R.string.scorefour));
            case 5: scoreText.setText(getString(R.string.scorefive));
        }
    }
}
