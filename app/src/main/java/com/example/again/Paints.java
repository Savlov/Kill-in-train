package com.example.again;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Paints extends Activity implements View.OnClickListener {
    Button bt, bt2, bt3, bt4;
    ImageView im;
    int k, t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);
        bt = findViewById(R.id.button6);
        bt2 = findViewById(R.id.button11);
        bt3 = findViewById(R.id.button10);
        bt4 = findViewById(R.id.button13);
        im = findViewById(R.id.imageView);
        bt.setOnClickListener(Paints.this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        im.setImageResource(R.drawable.dp);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button6:
                k++;
                bt.setVisibility(View.INVISIBLE);
                if (k == 2) {
                    Intent w = new Intent();
                    String a="2";
                    w.putExtra("et",a);
                    setResult(RESULT_OK, w);
                    finish();
                }

                break;
            case R.id.button11:
                t++;
                if (t == 1) {
                    im.setImageResource(R.drawable.dsp);
                    bt.setText("Сикстинская мадонна");
                    bt2.setText("Девочка с персиками");
                    bt3.setText("Алёнушка");
                    bt4.setText("Джоконда");
                    bt.setVisibility(View.VISIBLE);

                    bt3.setVisibility(View.VISIBLE);
                    bt4.setVisibility(View.VISIBLE);
                }

               else if (t == 2) {
                    im.setImageResource(R.drawable.val);
                    bt.setText("7 вал");
                    bt2.setText("9 вал");
                    bt3.setText("Буря на море Галилейском");
                    bt4.setText("Чёрный квадрат");
                    bt.setVisibility(View.VISIBLE);
                    bt3.setVisibility(View.VISIBLE);
                    bt4.setVisibility(View.VISIBLE);
                }
               else if (t == 3) {
                    im.setImageResource(R.drawable.ml);
                    bt.setText("евушка с жемчужной серёжкой");
                    bt2.setText("Джоконда");
                    bt3.setText("Купчиха за чаем");
                    bt4.setText("Мадонна Литта");
                    bt.setVisibility(View.VISIBLE);

                    bt3.setVisibility(View.VISIBLE);
                    bt4.setVisibility(View.VISIBLE);
                }
               else if(t==4){
                    im.setImageResource(R.drawable.vs);
                    bt.setText("Девушка на лошади");
                    bt2.setText("Всадница");
                    bt3.setText("Всадник");
                    bt4.setText("Джоконда");
                    bt.setVisibility(View.VISIBLE);

                    bt3.setVisibility(View.VISIBLE);
                    bt4.setVisibility(View.VISIBLE);

                } else if(t==5){
                    Intent i = new Intent();

                    setResult(RESULT_OK, i);
                    finish();
                }
                break;
            case R.id.button10:
                k++;
                bt3.setVisibility(View.INVISIBLE);
                if (k == 2) {
                    Intent w = new Intent();
                    String a="2";                    w.putExtra("et",a);
                    setResult(RESULT_OK, w);
                    finish();
                }


                break;
            case R.id.button13:
                k++;
                bt4.setVisibility(View.INVISIBLE);
                if (k == 2) {
                    Intent w = new Intent();
                    String a="2";                    w.putExtra("et",a);
                    setResult(RESULT_OK, w);
                    finish();
                }

                break;

        }

    }

}
