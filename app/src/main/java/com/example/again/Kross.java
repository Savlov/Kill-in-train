package com.example.again;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Kross extends Activity {
    EditText ed;
    TextView tv, tv1, tv2;
    int k=0;
    Button bt,bt1,bt2,bt3;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kross);
        ed=findViewById(R.id.editText1);
        bt=findViewById(R.id.button22);
        bt1=findViewById(R.id.button23);
        bt2=findViewById(R.id.button24);
        bt3=findViewById(R.id.button15);
        tv=findViewById(R.id.textView31);
        tv1=findViewById(R.id.textView8);
        tv2=findViewById(R.id.textView9);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tv=ed.getText().toString();
                if(tv.equals("революция")){
                    bt.setVisibility(View.VISIBLE);
                    bt1.setVisibility(View.GONE);
                    bt3.setVisibility(View.GONE);
                }

            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(Kross.this, GameO.class);
                setResult(RESULT_OK, w);
                finish();
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(Kross.this, GameO.class);
                setResult(RESULT_CANCELED, w);
                finish();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(k==0){
                    tv1.setVisibility(View.VISIBLE);
                    k++;
                } else if(k>=1){
                    tv2.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
