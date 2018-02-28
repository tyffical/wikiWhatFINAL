package com.example.tiffany.wikiwhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {
    private Button a1,a2,a3,a4;
    private ImageView q;
    private int c = 0; //keeps track of current question
    private int d = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        q = (ImageView) findViewById(R.id.e1);
        a1 = (Button) findViewById(R.id.answer1);
        a2 = (Button) findViewById(R.id.answer2);
        a3 = (Button) findViewById(R.id.answer3);
        a4 = (Button) findViewById(R.id.answer4);
        final int[] eq = new int[5];
        eq[0] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/eq1", null, null);
        eq[1] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/eq2", null, null);
        eq[2] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/eq3", null, null);
        eq[3] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/eq4", null, null);
        eq[4] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/eq5", null, null);
        final int[] mq = new int[5];
        mq[0] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/mq1", null, null);
        mq[1] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/mq2", null, null);
        mq[2] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/mq3", null, null);
        mq[3] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/mq4", null, null);
        mq[4] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/mq5", null, null);
        final int[] hq = new int[5];
        hq[0] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/hq1", null, null);
        hq[1] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/hq2", null, null);
        hq[2] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/hq3", null, null);
        hq[3] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/hq4", null, null);
        hq[4] = getResources().getIdentifier("com.example.tiffany.wikiwhat:drawable/hq5", null, null);
        final ArrayList<String> easy = new ArrayList<String>();
        easy.add(getString(R.string.eq1a1));
        easy.add(getString(R.string.eq1a2));
        easy.add(getString(R.string.eq1a3));
        easy.add(getString(R.string.eq1a4));
        easy.add(getString(R.string.eq2a1));
        easy.add(getString(R.string.eq2a2));
        easy.add(getString(R.string.eq2a3));
        easy.add(getString(R.string.eq2a4));
        easy.add(getString(R.string.eq3a1));
        easy.add(getString(R.string.eq3a2));
        easy.add(getString(R.string.eq3a3));
        easy.add(getString(R.string.eq3a4));
        easy.add(getString(R.string.eq4a1));
        easy.add(getString(R.string.eq4a2));
        easy.add(getString(R.string.eq4a3));
        easy.add(getString(R.string.eq4a4));
        easy.add(getString(R.string.eq5a1));
        easy.add(getString(R.string.eq5a2));
        easy.add(getString(R.string.eq5a3));
        easy.add(getString(R.string.eq5a4));
        final ArrayList<String> medium = new ArrayList<String>();
        medium.add(getString(R.string.mq1a1));
        medium.add(getString(R.string.mq1a2));
        medium.add(getString(R.string.mq1a3));
        medium.add(getString(R.string.mq1a4));
        medium.add(getString(R.string.mq2a1));
        medium.add(getString(R.string.mq2a2));
        medium.add(getString(R.string.mq2a3));
        medium.add(getString(R.string.mq2a4));
        medium.add(getString(R.string.mq3a1));
        medium.add(getString(R.string.mq3a2));
        medium.add(getString(R.string.mq3a3));
        medium.add(getString(R.string.mq3a4));
        medium.add(getString(R.string.mq4a1));
        medium.add(getString(R.string.mq4a2));
        medium.add(getString(R.string.mq4a3));
        medium.add(getString(R.string.mq4a4));
        medium.add(getString(R.string.mq5a1));
        medium.add(getString(R.string.mq5a2));
        medium.add(getString(R.string.mq5a3));
        medium.add(getString(R.string.mq5a4));
        final ArrayList<String> hard = new ArrayList<String>();
        hard.add(getString(R.string.hq1a1));
        hard.add(getString(R.string.hq1a2));
        hard.add(getString(R.string.hq1a3));
        hard.add(getString(R.string.hq1a4));
        hard.add(getString(R.string.hq2a1));
        hard.add(getString(R.string.hq2a2));
        hard.add(getString(R.string.hq2a3));
        hard.add(getString(R.string.hq2a4));
        hard.add(getString(R.string.hq3a1));
        hard.add(getString(R.string.hq3a2));
        hard.add(getString(R.string.hq3a3));
        hard.add(getString(R.string.hq3a4));
        hard.add(getString(R.string.hq4a1));
        hard.add(getString(R.string.hq4a2));
        hard.add(getString(R.string.hq4a3));
        hard.add(getString(R.string.hq4a4));
        hard.add(getString(R.string.hq5a1));
        hard.add(getString(R.string.hq5a2));
        hard.add(getString(R.string.hq5a3));
        hard.add(getString(R.string.hq5a4));
        final Intent intent = getIntent();
        if (intent.getStringExtra("level").equals("easy")){
            a1.setText(easy.get(0));
            a2.setText(easy.get(1));
            a3.setText(easy.get(2));
            a4.setText(easy.get(3));
            q.setImageResource(eq[0]);
        }
        else if (intent.getStringExtra("level").equals("medium")){
            a1.setText(medium.get(0));
            a2.setText(medium.get(1));
            a3.setText(medium.get(2));
            a4.setText(medium.get(3));
            q.setImageResource(mq[0]);
        }
        else if (intent.getStringExtra("level").equals("hard")){
            a1.setText(hard.get(0));
            a2.setText(hard.get(1));
            a3.setText(hard.get(2));
            a4.setText(hard.get(3));
            q.setImageResource(hq[0]);
        }
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intent.getStringExtra("level").equals("easy")) {
                    if (c == 12)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(easy.get(c));
                        a2.setText(easy.get(c + 1));
                        a3.setText(easy.get(c + 2));
                        a4.setText(easy.get(c + 3));
                        q.setImageResource(eq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                } else if (intent.getStringExtra("level").equals("medium")) {
                    if (c == 12)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(medium.get(c));
                        a2.setText(medium.get(c + 1));
                        a3.setText(medium.get(c + 2));
                        q.setImageResource(mq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                } else if (intent.getStringExtra("level").equals("hard")) {
                    if (c == 4 || c == 16)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(hard.get(c));
                        a2.setText(hard.get(c + 1));
                        a3.setText(hard.get(c + 2));
                        a4.setText(hard.get(c + 3));
                        q.setImageResource(hq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                }
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intent.getStringExtra("level").equals("easy")) {
                    if (c == 8)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(easy.get(c));
                        a2.setText(easy.get(c + 1));
                        a3.setText(easy.get(c + 2));
                        a4.setText(easy.get(c + 3));
                        q.setImageResource(eq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                } else if (intent.getStringExtra("level").equals("medium")) {
                    if (c == 0 || c ==4)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(medium.get(c));
                        a2.setText(medium.get(c + 1));
                        a3.setText(medium.get(c + 2));
                        a4.setText(medium.get(c + 3));
                        q.setImageResource(mq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                } else if (intent.getStringExtra("level").equals("hard")) {
                    if (c == 0)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(hard.get(c));
                        a2.setText(hard.get(c + 1));
                        a3.setText(hard.get(c + 2));
                        a4.setText(hard.get(c + 3));
                        q.setImageResource(hq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                }
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intent.getStringExtra("level").equals("easy")) {
                    if (c == 4 || c == 16)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(easy.get(c));
                        a2.setText(easy.get(c + 1));
                        a3.setText(easy.get(c + 2));
                        a4.setText(easy.get(c + 3));
                        q.setImageResource(eq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                } else if (intent.getStringExtra("level").equals("medium")) {
                    if (c == 16)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(medium.get(c));
                        a2.setText(medium.get(c + 1));
                        a3.setText(medium.get(c + 2));
                        a4.setText(medium.get(c + 3));
                        q.setImageResource(mq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                } else if (intent.getStringExtra("level").equals("hard")) {
                    if (c == 12)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(hard.get(c));
                        a2.setText(hard.get(c + 1));
                        a3.setText(hard.get(c + 2));
                        a4.setText(hard.get(c + 3));
                        q.setImageResource(hq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                }
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intent.getStringExtra("level").equals("easy")) {
                    if (c == 0)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(easy.get(c));
                        a2.setText(easy.get(c + 1));
                        a3.setText(easy.get(c + 2));
                        a4.setText(easy.get(c + 3));
                        q.setImageResource(eq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                } else if (intent.getStringExtra("level").equals("medium")) {
                    if (c == 8)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(medium.get(c));
                        a2.setText(medium.get(c + 1));
                        a3.setText(medium.get(c + 2));
                        a4.setText(medium.get(c + 3));
                        q.setImageResource(mq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                } else if (intent.getStringExtra("level").equals("hard")) {
                    if (c == 8)
                        Toast.makeText(ThirdActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(ThirdActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    c += 4;
                    d++;
                    if (c < 20) {
                        a1.setText(hard.get(c));
                        a2.setText(hard.get(c + 1));
                        a3.setText(hard.get(c + 2));
                        a4.setText(hard.get(c + 3));
                        q.setImageResource(hq[d]);
                    }
                    else {
                        goToFourthActivity();
                    }
                }
            }
        });
    }
    private void goToFourthActivity(){
        Intent z = new Intent(this, FourthActivity.class);
        startActivity(z);
    }
}