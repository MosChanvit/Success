package com.example.nont.success;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scorehistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorehistory);

        Button homefromhistory = (Button) findViewById(R.id.buttonhomefromhistory);

        homefromhistory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(scorehistory.this,MainActivity.class);
                startActivity(intent);


            }
        });
    }
}
