package com.example.nont.success;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scorelevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorelevel);

        Button easy = (Button) findViewById(R.id.boutton_SE);
        Button hard = (Button) findViewById(R.id.button_SN);
        Button veryhard = (Button) findViewById(R.id.button_H);

        easy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(scorelevel.this,scorehistory.class);
                startActivity(intent);


            }
        });

        hard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(scorelevel.this,scorehistory.class);
                startActivity(intent);


            }
        });

        veryhard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(scorelevel.this,scorehistory.class);
                startActivity(intent);


            }
        });

    }
}
