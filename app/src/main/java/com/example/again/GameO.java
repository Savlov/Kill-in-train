package com.example.again;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GameO extends Activity {
    Button bc, bc1, bc2, bc3, bc4, bc5, bc7, bc6;
    TextView tvc, tvc1, tvc2, tvc3, tvc4, tvc5, tvc6, tvc8;
    TextView tv, tv1, tv2, tv3, tv4, tv5, tv6, tv7, ftv16, ftv125, ftv, ftv1, ftv2, ftv3, ftv4, ftv5, ftv6;
    int k;
    TextView fftv, fftv2;
    Button ffb, ffbt, ffbt1;

    Button b, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, fb, fb181, fb12, fb19, fb1, fb2, fb3, fb4, fb5, fb6;
    RelativeLayout rl;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        startService(new Intent(GameO.this, MyServise.class));


        this.ftv = findViewById(R.id.textViewf111);
        this.ftv1 = findViewById(R.id.textViewf112);
        this.ftv2 = findViewById(R.id.textViewf115);
        this.ftv3 = findViewById(R.id.textViewf113);
        this.ftv4 = findViewById(R.id.textViewf114);
        this.ftv5 = findViewById(R.id.textViewf116);
        this.ftv6 = findViewById(R.id.textViewf151);
        this.ftv125 = findViewById(R.id.textViewf125);
        this.ftv16 = findViewById(R.id.textViewf16);
        this.fftv = findViewById(R.id.textViewff10);
        this.fftv2 = findViewById(R.id.textViewff112);
        this.ffbt1 = findViewById(R.id.buttonff15);
        this.ffb = findViewById(R.id.buttonff16);
        this.ffbt = findViewById(R.id.buttonff17);


        this.tvc = findViewById(R.id.textViewc);
        this.tvc1 = findViewById(R.id.textViewc2);
        this.tvc3 = findViewById(R.id.textViewc4);
        this.tvc5 = findViewById(R.id.textViewc7);
        this.tvc6 = findViewById(R.id.textViewc8);
        this.tvc8 = findViewById(R.id.textViewc9);

        this.tv = findViewById(R.id.textView);
        this.tv2 = findViewById(R.id.textView2);
        this.tv3 = findViewById(R.id.textView3);
        this.tv4 = findViewById(R.id.textView4);
        this.tv5 = findViewById(R.id.textView5);
        this.tv6 = findViewById(R.id.textView6);
        this.tv7 = findViewById(R.id.textView7);
        rl = findViewById(R.id.rLayout);
        this.b = findViewById(R.id.button12);
        this.tv5 = findViewById(R.id.textView5);
        this.b6 = findViewById(R.id.button111);
        this.b7 = findViewById(R.id.button11);
        this.b8 = findViewById(R.id.button13);

        this.fb = findViewById(R.id.buttonf16);
        this.fb1 = findViewById(R.id.buttonf17);
        this.fb12 = findViewById(R.id.buttonf192);
        this.fb2 = findViewById(R.id.buttonf18);
        this.fb3 = findViewById(R.id.buttonf19);
        this.fb4 = findViewById(R.id.buttonf20);
        this.fb5 = findViewById(R.id.buttonf21);
        this.fb6 = findViewById(R.id.buttonf22);
        this.fb19 = findViewById(R.id.buttonf191);
        this.fb181 = findViewById(R.id.buttonf181);
        this.bc = findViewById(R.id.buttonc12);
        this.bc1 = findViewById(R.id.buttonc2);
        this.bc2 = findViewById(R.id.buttonc3);
        this.bc3 = findViewById(R.id.buttonc5);
        this.bc4 = findViewById(R.id.buttonc8);
        this.bc5 = findViewById(R.id.buttonc21);
       // this.bc6 = findViewById(R.id.buttonc22);
        this.bc7 = findViewById(R.id.buttonc9);


        this.b1 = findViewById(R.id.button2);
        this.b2 = findViewById(R.id.button3);
        this.b3 = findViewById(R.id.button5);
        this.b4 = findViewById(R.id.button8);
        this.b5 = findViewById(R.id.button9);
        this.b7 = findViewById(R.id.button11);


        b.setVisibility(View.VISIBLE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.setVisibility(View.GONE);
                tv.setVisibility(View.VISIBLE);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setVisibility(View.GONE);
                b1.setVisibility(View.GONE);
                tv3.setVisibility(View.VISIBLE);
                rl.setBackgroundResource(R.drawable.bg);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl.setBackgroundResource(R.drawable.sp);
                tv.setVisibility(View.GONE);
                tv3.setVisibility(View.GONE);
                tv2.setVisibility(View.VISIBLE);
                b2.setVisibility(View.GONE);
                b1.setVisibility(View.GONE);
                b3.setVisibility(View.VISIBLE);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv3.setVisibility(View.GONE);
                tv2.setVisibility(View.GONE);
                tv4.setVisibility(View.VISIBLE);
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                b4.setVisibility(View.VISIBLE);
                rl.setBackgroundResource(R.drawable.gar);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv4.setVisibility(View.GONE);
                b4.setVisibility(View.GONE);

                b.setVisibility(View.GONE);

                Intent w = new Intent(GameO.this, Puti.class);


                startActivityForResult(w, 1);

                rl.setBackgroundResource(R.drawable.dr);
                tv5.setVisibility(View.VISIBLE);

                b7.setVisibility(View.VISIBLE);
                b6.setVisibility(View.VISIBLE);

            }

        });
        k++;


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setVisibility(View.GONE);
                b7.setVisibility(View.GONE);
                tv5.setVisibility(View.GONE);
                Intent l = new Intent(GameO.this, Poisk1.class);
                startActivityForResult(l, 1);
                rl.setBackgroundResource(R.drawable.p);
                tv7.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);


            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl.setBackgroundResource(R.drawable.p);
                b6.setVisibility(View.GONE);
                b7.setVisibility(View.GONE);
                tv5.setVisibility(View.GONE);
                tv6.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl.setBackgroundResource(R.drawable.p);
                b5.setVisibility(View.GONE);
                tv5.setVisibility(View.GONE);
                fb.setVisibility(View.VISIBLE);
                tv6.setVisibility(View.GONE);
                stopService(new Intent(GameO.this, MyServise.class));

            }
        });


        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl.setBackgroundResource(R.drawable.pp2);
                startService(new Intent(GameO.this,MyService2.class));
                tv4.setVisibility(View.GONE);
                tv7.setVisibility(View.GONE);
                tv5.setVisibility(View.GONE);
                ftv.setVisibility(View.VISIBLE);
                fb.setVisibility(View.GONE);
                fb1.setVisibility(View.VISIBLE);
                fb2.setVisibility(View.VISIBLE);

            }
        });

        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ftv.setVisibility(View.GONE);
                fb2.setVisibility(View.GONE);
                ftv3.setVisibility(View.VISIBLE);
                fb1.setVisibility(View.GONE);
                // fb32.setVisibility(View.VISIBLE);


            }
        });
        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ftv.setVisibility(View.GONE);
                fb2.setVisibility(View.GONE);
                ftv1.setVisibility(View.VISIBLE);
                fb1.setVisibility(View.GONE);
                rl.setBackgroundResource(R.drawable.bgk);
                fb3.setVisibility(View.VISIBLE);
                fb12.setVisibility(View.VISIBLE);

            }
        });
        fb12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ftv1.setVisibility(View.GONE);
                fb3.setVisibility(View.GONE);
                fb12.setVisibility(View.GONE);
                ftv4.setVisibility(View.VISIBLE);
                fb19.setVisibility(View.VISIBLE);
            }
        });
        fb19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ftv4.setVisibility(View.GONE);
                fb19.setVisibility(View.GONE);
                ftv125.setVisibility(View.VISIBLE);
                fb181.setVisibility(View.VISIBLE);


            }
        });
        fb181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(GameO.this, Paints.class);
                startActivityForResult(w, 1);
                String str = getIntent().getStringExtra("et");

                ftv125.setVisibility(View.GONE);
                fb181.setVisibility(View.GONE);
                if (str == ("2")) {
                    ftv16.setVisibility(View.VISIBLE);

                } else {

                    ftv5.setVisibility(View.VISIBLE);
                    fb5.setVisibility(View.VISIBLE);
                }
                k++;


            }
        });
        fb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ftv2.setVisibility(View.GONE);
                fb3.setVisibility(View.GONE);
                fb12.setVisibility(View.GONE);
                ftv1.setVisibility(View.GONE);
                rl.setBackgroundResource(R.drawable.pk);
                ftv6.setVisibility(View.VISIBLE);
                fb4.setVisibility(View.VISIBLE);

            }
        });
        fb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ftv3.setVisibility(View.GONE);
                fb4.setVisibility(View.GONE);
                fb5.setVisibility(View.GONE);
                ftv4.setVisibility(View.GONE);
                Intent w = new Intent(GameO.this, Kross.class);
                startActivityForResult(w, 1);
                fb6.setVisibility(View.VISIBLE);

            }
        });
        fb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ftv3.setVisibility(View.GONE);
                fb4.setVisibility(View.GONE);
                ftv5.setVisibility(View.VISIBLE);
                fb6.setVisibility(View.VISIBLE);
                fb5.setVisibility(View.GONE);

            }
        });
        fb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fb6.setVisibility(View.GONE);
                ftv5.setVisibility(View.GONE);
                bc.setVisibility(View.VISIBLE);
                ftv6.setVisibility(View.GONE);

            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bc.setVisibility(View.GONE);
                bc3.setVisibility(View.VISIBLE);
                tvc.setVisibility(View.VISIBLE);
            }
        });
        bc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvc1.setVisibility(View.VISIBLE);
                bc3.setVisibility(View.GONE);
                tvc.setVisibility(View.GONE);
                bc1.setVisibility(View.VISIBLE);
                bc2.setVisibility(View.VISIBLE);
            }
        });
        bc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvc3.setVisibility(View.VISIBLE);
                bc1.setVisibility(View.GONE);
                bc2.setVisibility(View.GONE);
                tvc1.setVisibility(View.GONE);
                bc4.setVisibility(View.VISIBLE);
            }
        });
        bc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc1.setVisibility(View.GONE);
                bc2.setVisibility(View.GONE);
                tvc1.setVisibility(View.GONE);
                tvc5.setVisibility(View.VISIBLE);
                bc4.setVisibility(View.VISIBLE);
            }
        });
        bc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvc3.setVisibility(View.GONE);
                bc4.setVisibility(View.GONE);
                tvc5.setVisibility(View.GONE);
                bc4.setVisibility(View.GONE);
                tvc6.setVisibility(View.VISIBLE);
                bc5.setVisibility(View.VISIBLE);
            }
        });
        bc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvc5.setVisibility(View.GONE);
                bc5.setVisibility(View.GONE);
                tvc6.setVisibility(View.GONE);
                bc7.setVisibility(View.VISIBLE);
                tvc8.setVisibility(View.VISIBLE);
            }
        });
        bc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc7.setVisibility(View.GONE);
                tvc8.setVisibility(View.GONE);
                ffbt1.setVisibility(View.VISIBLE);

            }
        });
        ffbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ffbt1.setVisibility(View.GONE);
                fftv.setVisibility(View.VISIBLE);
                ffb.setVisibility(View.VISIBLE);
            }
        });
        ffb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fftv.setVisibility(View.GONE);
                ffb.setVisibility(View.GONE);
                ffbt.setVisibility(View.VISIBLE);
                fftv2.setVisibility(View.VISIBLE);
            }
        });
        ffbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Вы прошли игру, поздравляю!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                stopService(new Intent(GameO.this,MyServise.class));
                stopService(new Intent(GameO.this, MyService2.class));
                finish();
            }
        });

    }
}
