package com.example.nont.success;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



import DB.DatabaseHelper;


public class play1 extends AppCompatActivity {
    int Mscore = 0;
    private String TAG = play1.class.getSimpleName();

    Randomall r  = new Randomall();

    String d1=r.random1();
    String d2=r.random2();
    String oper= r.randomOper();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play1);
        final TextView tv1 = (TextView) findViewById(R.id.textView4);
        final TextView tv2 = (TextView) findViewById(R.id.textView2);
        Button bt_send=(Button) findViewById(R.id.bt_send);
        Button bt_next=(Button) findViewById(R.id.bt_next);
        final TextView score=(TextView) findViewById(R.id.score);
        final TextView tv_answer=(TextView) findViewById(R.id.tv_answer);
       final TextView tv_oper =(TextView) findViewById(R.id.tv_oper) ;

        score.setText(Integer.toString(Mscore));

        tv1.setText(d1);
        tv2.setText(d2);
        tv_oper.setText(oper);


        bt_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String ans= tv_answer.getText().toString();

                if(tv_answer.getText().toString().equals("")){
                    Toast toast = Toast.makeText ( play1.this, "ใส่คำตอบก่อนดิ", Toast.LENGTH_SHORT );
                    toast.show ( );
                }
                else {

                    if (oper.equals("+")) {
                        if (Integer.parseInt(d1) + Integer.parseInt(d2) == Integer.parseInt(ans)) {
                            //int ss = Integer.parseInt(score.getText().toString());
                            Mscore += 1;
                            score.setText(Integer.toString(Mscore));

                            MediaPlayer ye = MediaPlayer.create(play1.this, R.raw.ye);
                            ye.start();

                            d1 = r.random1();
                            d2 = r.random2();
                            oper= r.randomOper();
                            tv1.setText(d1);
                            tv2.setText(d2);
                            tv_oper.setText(oper);
                            tv_answer.setText("");
                        } else {
                            if(Mscore>0){
                                Mscore -= 1;
                                Toast toast = Toast.makeText(play1.this, "ลบ 1 คะเเนน", Toast.LENGTH_SHORT);
                                toast.show();}
                            score.setText(Integer.toString(Mscore));
                            tv_answer.setText("");
                        }
                    }
                    if (oper.equals("-")) {
                        if (Integer.parseInt(d1) - Integer.parseInt(d2) == Integer.parseInt(ans)) {
                            //int ss = Integer.parseInt(score.getText().toString());
                            Mscore += 1;
                            score.setText(Integer.toString(Mscore));
                            MediaPlayer ye = MediaPlayer.create(play1.this, R.raw.ye);
                            ye.start();

                            d1 = r.random1();
                            d2 = r.random2();
                            oper= r.randomOper();
                            tv1.setText(d1);
                            tv2.setText(d2);
                            tv_oper.setText(oper);
                            tv_answer.setText("");
                        } else {
                            if(Mscore>0){
                                Mscore -= 1;
                                Toast toast = Toast.makeText(play1.this, "ลบ 1 คะเเนน", Toast.LENGTH_SHORT);
                                toast.show();}
                            score.setText(Integer.toString(Mscore));
                            tv_answer.setText("");
                        }
                    }
                }
            }
        });
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Mscore>0){
                    Mscore -= 1;
                    Toast toast = Toast.makeText(play1.this, "ลบ 1 คะเเนน", Toast.LENGTH_SHORT);
                    toast.show();
                }
                d1 = r.random1();
                d2 = r.random2();
                oper= r.randomOper();
                tv1.setText(d1);
                tv2.setText(d2);
                tv_oper.setText(oper);
                tv_answer.setText("");
                score.setText(Integer.toString(Mscore));



            }
        });
        CountDownTimer cdt = new CountDownTimer(1000*60, 1000) {
            int time = 60;
            public void onTick(long millisUntilFinished) {
                time--;
                String t = Integer.toString(time);
                TextView time = (TextView) findViewById(R.id.time);
                time.setText(t);


            }
            public void onFinish() {
                TextView score = (TextView) findViewById(R.id.score);
                int s = Integer.parseInt(score.getText().toString());
                Mscore = s;
                Intent intent = new Intent(play1.this, scorecount.class);
                intent.putExtra("score", Mscore);
                intent.putExtra("status", "1");

               DatabaseHelper helper = new DatabaseHelper(play1.this);
                SQLiteDatabase db = helper.getWritableDatabase();
                ContentValues cv = new ContentValues();
                cv.put(DatabaseHelper.COL_scoreE,Mscore);
                db.insert(DatabaseHelper.TABLE_Easy,null,cv);

                //finish();
                Log.i(TAG,"เเข้าแล้วนะ");
                startActivity(intent);

            }
        }.start();


    }

}


