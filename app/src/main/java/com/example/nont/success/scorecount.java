package com.example.nont.success;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.support.v7.appcompat.R.id.text;

public class scorecount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorecount);
        TextView answername=(TextView) findViewById(R.id.answername);

        TextView text = (TextView) findViewById(R.id.answerscorecount);
        Button buttonrefresh =(Button) findViewById(R.id.buttonrefresh);
        Button buttontohome =(Button) findViewById(R.id.buttontohome);
        Intent M = getIntent();
        int score=M.getIntExtra("score",-1);
        String status=M.getStringExtra("status");
        String s=Integer.toString(score);
        if(status.equals("1")){
            text.setText(s);
        }

        int sc= Integer.parseInt(s);
        if(sc<=5){
            answername.setText("กระจอก");
        }else if(sc>=6&&sc<=10){
            answername.setText("อ่อนว่ะ");
        }else if(sc>=11&&sc<=15){
            answername.setText("ได้แค่เนี๊ย");
        }else if(sc>=16&&sc<=20){
            answername.setText("หูยยยยย");
        }else if(sc>=21){
            answername.setText("เทพเกิ๊น");
        }
        buttonrefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(scorecount.this,Levelplay.class);
                startActivity(intent);
            }
        });

        buttontohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(scorecount.this,MainActivity.class);
                startActivity(intent);
            }
        });




    }
}
