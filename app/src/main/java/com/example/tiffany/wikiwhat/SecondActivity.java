package com.example.tiffany.wikiwhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button e,m,h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        e = (Button) findViewById(R.id.easy);
        if (e == null)
            Log.d("myTag","e is null");
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToThirdActivity("easy");

            }
        });
        m = (Button) findViewById(R.id.medium);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToThirdActivity("medium");
            }
        });
        h = (Button) findViewById(R.id.hard);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToThirdActivity("hard");
            }
        });
    }
    private void goToThirdActivity(String level){
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("level", level);
        startActivity(intent);
    }
}
