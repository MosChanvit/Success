package com.example.nont.success;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Levelplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levelplay);

        Button LE = (Button) findViewById(R.id.boutton_LE);
        Button LN = (Button) findViewById(R.id.button_LN);
        Button LH = (Button) findViewById(R.id.button_LH);

        LE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(Levelplay.this,play1.class);
                startActivity(intent);


            }
        });

        LN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(Levelplay.this,play2.class);
                startActivity(intent);


            }
        });

        LH.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(Levelplay.this,play3.class);
                startActivity(intent);


            }
        });
    }
}
