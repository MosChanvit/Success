package com.example.nont.success;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.ToneGenerator;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class setting extends AppCompatActivity {
    String musicstatus = "on";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);



        ToggleButton status = (ToggleButton) findViewById(R.id.sound);
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(musicstatus.equals("on")){
                    musicstatus="off";
                }
                else if(musicstatus.equals("off")){
                    musicstatus="off";
            }
            }
        });






        Button homefromsetting = (Button) findViewById(R.id.buttonformsetting);

        homefromsetting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(setting.this,MainActivity.class);
                startActivity(intent);



            }
        });

        Button solutionplay = (Button) findViewById(R.id.play);

        solutionplay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(setting.this,solutionplay.class);
                startActivity(intent);

            }
        });

        Button dev = (Button) findViewById(R.id.dev);

        dev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(setting.this,Dev.class);
                startActivity(intent);

            }
        });






    }



}
