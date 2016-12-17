package com.example.nont.success;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class play3 extends AppCompatActivity {
    int Mscore = 0;
    

    Randomall r  = new Randomall();

    String d1=r.random11();
    String d2=r.random22();
    String d3=r.random33();
    String oper= r.randomOper();
    String oper2= r.randomOper2();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play3);
        final TextView n1 = (TextView) findViewById(R.id.n1);
        final TextView n2 = (TextView) findViewById(R.id.n2);
        final TextView n3 = (TextView) findViewById(R.id.n3);
        final TextView tv_oper =(TextView) findViewById(R.id.tv_oper) ;
        final TextView tv_oper2 =(TextView) findViewById(R.id.tv_oper2) ;

        Button bt_send=(Button) findViewById(R.id.bt_send);
        Button bt_next=(Button) findViewById(R.id.bt_next);
        final TextView score=(TextView) findViewById(R.id.score);
        final TextView tv_answer=(TextView) findViewById(R.id.tv_answer);


        score.setText(Integer.toString(Mscore));


            d1=r.random11();
            d2=r.random22();
            d3=r.random33();
            oper=r.randomOper();
            oper2=r.randomOper2();
            n1.setText(d1);
            n2.setText(d2);
            n3.setText(d3);
            tv_oper.setText(oper);
            tv_oper2.setText(oper2);
            tv_answer.setText("");









            bt_send.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ans = tv_answer.getText().toString();
                    if(tv_answer.getText().toString().equals("")){
                        Toast toast = Toast.makeText ( play3.this, "ใส่คำตอบก่อนดิ", Toast.LENGTH_SHORT );
                        toast.show ( );
                    }
                    else {

                        if (oper.equals("+") && oper2.equals("+")) {
                            if (Integer.parseInt(d1) + Integer.parseInt(d2) + Integer.parseInt(d3) == Integer.parseInt(ans)) {
                                //int ss = Integer.parseInt(score.getText().toString());
                                Mscore += 3;
                                score.setText(Integer.toString(Mscore));
                                MediaPlayer ye = MediaPlayer.create(play3.this, R.raw.ye);
                                ye.start();

                                d1 = r.random11();
                                d2 = r.random22();
                                d3 = r.random33();
                                oper = r.randomOper();
                                oper2 = r.randomOper2();
                                n1.setText(d1);
                                n2.setText(d2);
                                n3.setText(d3);
                                tv_oper.setText(oper);
                                tv_oper2.setText(oper2);
                                tv_answer.setText("");
                            } else {
                                if(Mscore>0){
                                    Mscore -= 1;
                                    Toast toast = Toast.makeText(play3.this, "ลบ 1 คะเเนน", Toast.LENGTH_SHORT);
                                    toast.show();}
                                score.setText(Integer.toString(Mscore));
                                tv_answer.setText("");
                            }
                        }
                        else if (oper.equals("-") && oper2.equals("-")) {
                            if (Integer.parseInt(d1) - Integer.parseInt(d2) - Integer.parseInt(d3) == Integer.parseInt(ans)) {
                                //int ss = Integer.parseInt(score.getText().toString());
                                Mscore += 3;
                                score.setText(Integer.toString(Mscore));
                                MediaPlayer ye = MediaPlayer.create(play3.this, R.raw.ye);
                                ye.start();
                                d1 = r.random11();
                                d2 = r.random22();
                                d3 = r.random33();
                                oper = r.randomOper();
                                oper2 = r.randomOper2();
                                n1.setText(d1);
                                n2.setText(d2);
                                n3.setText(d3);
                                tv_oper.setText(oper);
                                tv_oper2.setText(oper2);
                                tv_answer.setText("");
                            } else {
                                if(Mscore>0){
                                    Mscore -= 1;
                                    Toast toast = Toast.makeText(play3.this, "ลบ 1 คะเเนน", Toast.LENGTH_SHORT);
                                    toast.show();}
                                score.setText(Integer.toString(Mscore));
                                tv_answer.setText("");
                            }
                        }
                        else if (oper.equals("+") && oper2.equals("-")) {
                            if (Integer.parseInt(d1) + Integer.parseInt(d2) - Integer.parseInt(d3) == Integer.parseInt(ans)) {
                                //int ss = Integer.parseInt(score.getText().toString());
                                Mscore += 3;
                                score.setText(Integer.toString(Mscore));
                                MediaPlayer ye = MediaPlayer.create(play3.this, R.raw.ye);
                                ye.start();
                                d1 = r.random11();
                                d2 = r.random22();
                                d3 = r.random33();
                                oper = r.randomOper();
                                oper2 = r.randomOper2();
                                n1.setText(d1);
                                n2.setText(d2);
                                n3.setText(d3);
                                tv_oper.setText(oper);
                                tv_oper2.setText(oper2);
                                tv_answer.setText("");
                            } else {
                                if(Mscore>0){
                                    Mscore -= 1;
                                    Toast toast = Toast.makeText(play3.this, "ลบ 1 คะเเนน", Toast.LENGTH_SHORT);
                                    toast.show();}
                                score.setText(Integer.toString(Mscore));
                                tv_answer.setText("");
                            }
                        }
                        else if (oper.equals("-") && oper2.equals("+")) {
                            if (Integer.parseInt(d1) - Integer.parseInt(d2) + Integer.parseInt(d3) == Integer.parseInt(ans)) {
                                //int ss = Integer.parseInt(score.getText().toString());
                                Mscore += 3;
                                score.setText(Integer.toString(Mscore));
                                MediaPlayer ye = MediaPlayer.create(play3.this, R.raw.ye);
                                ye.start();
                                d1 = r.random11();
                                d2 = r.random22();
                                d3 = r.random33();
                                oper = r.randomOper();
                                oper2 = r.randomOper2();
                                n1.setText(d1);
                                n2.setText(d2);
                                n3.setText(d3);
                                tv_oper.setText(oper);
                                tv_oper2.setText(oper2);
                                tv_answer.setText("");
                            } else {
                                if(Mscore>0){
                                    Mscore -= 1;
                                    Toast toast = Toast.makeText(play3.this, "ลบ 1 คะเเนน", Toast.LENGTH_SHORT);
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
                    Toast toast = Toast.makeText(play3.this, "ลบ 1 คะเเนน", Toast.LENGTH_SHORT);
                    toast.show();}
                d1 = r.random11();
                d2 = r.random22();
                d3 = r.random33();
                oper= r.randomOper();
                oper2= r.randomOper2();
                n1.setText(d1);
                n2.setText(d2);
                n3.setText(d3);
                tv_oper.setText(oper);
                tv_oper2.setText(oper2);
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
                Intent intent = new Intent(play3.this, scorecount.class);
                intent.putExtra("score", Mscore);
                intent.putExtra("status", "1");
                startActivity(intent);

            }
        }.start();

    }
}
