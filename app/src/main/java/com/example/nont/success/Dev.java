package com.example.nont.success;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dev extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev);

        Button homefromdev = (Button) findViewById(R.id.buttonfromdev);

        homefromdev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(Dev.this,MainActivity.class);
                startActivity(intent);


            }
        });
    }
}
