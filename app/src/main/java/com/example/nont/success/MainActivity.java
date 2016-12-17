package com.example.nont.success;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.sax.EndElementListener;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button) findViewById(R.id.buttonstart);
        Button scorehistory = (Button) findViewById(R.id.bottonscore);
        Button exit = (Button) findViewById(R.id.bottonexit);
        Button setting = (Button) findViewById(R.id.buttonsetting);



        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(MainActivity.this,Levelplay.class);
                startActivity(intent);


            }
        });

        scorehistory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(MainActivity.this,scorelevel.class);
                startActivity(intent);

            }
        });
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this); //สร้างออบเจ็คไดอาล็อค
                    dialog.setTitle("ออกจากเกม"); //ไปที่เเวรูเเล้วก็สตริง
                    dialog.setMessage("คุณต้องการออกจากเกมหรือไม่ ?");

                    dialog.setPositiveButton("ใช่", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Intent.ACTION_MAIN);
                                intent.addCategory(Intent.CATEGORY_HOME);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
                        }
                    });

                dialog.setNegativeButton("ไม่ใช่", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                    dialog.show();

            }
        });

        setting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(MainActivity.this,setting.class);
               startActivity(intent);

            }
        });

    }
}
