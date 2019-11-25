package com.example.again;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Poisk1 extends Activity  {
    Button b, b1, b2, b3, b4;
    TextView tv;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poisk1);
        tv = findViewById(R.id.textView15);
        b = findViewById(R.id.button14);
        b1 = findViewById(R.id.button16);
        b2 = findViewById(R.id.button18);
        b3 = findViewById(R.id.button19);
        b4 = findViewById(R.id.button20);




    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            a++;
            if (a == 1) {
                b.setVisibility(View.GONE);
                tv.setText("Осталось найти:4");
            }
            if (a == 2) {
                b.setVisibility(View.GONE);
                tv.setText("Осталось найти:3");

            }
            if (a == 3) {
                b.setVisibility(View.GONE);
                tv.setText("Осталось найти:2");
            }
            if (a == 4) {
                b.setVisibility(View.GONE);
                tv.setText("Осталось найти:1");
            }
            if (a == 5) {
                b.setVisibility(View.GONE);
                Intent l = new Intent(Poisk1.this, GameO.class);
                setResult(RESULT_OK, l);
                finish();
            }
        }
    });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                if (a == 1) {
                    b1.setVisibility(View.GONE);
                    tv.setText("Осталось найти:4");
                }
                if (a == 2) {
                    b1.setVisibility(View.GONE);
                    tv.setText("Осталось найти:3");

                }
                if (a == 3) {
                    b1.setVisibility(View.GONE);
                    tv.setText("Осталось найти:2");
                }
                if (a == 4) {
                    b1.setVisibility(View.GONE);
                    tv.setText("Осталось найти:1");
                }
                if (a == 5) {
                    b1.setVisibility(View.GONE);
                    Intent l = new Intent(Poisk1.this, GameO.class);
                    setResult(RESULT_OK, l);
                   finish();
                }
            }
        });
           b2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   a++;
                   if (a == 1) {
                       b2.setVisibility(View.GONE);
                       tv.setText("Осталось найти:4");
                   }
                   if (a == 2) {
                       b2.setVisibility(View.GONE);
                       tv.setText("Осталось найти:3");

                   }
                   if (a == 3) {
                       b2.setVisibility(View.GONE);
                       tv.setText("Осталось найти:2");
                   }
                   if (a == 4) {
                       b2.setVisibility(View.GONE);
                       tv.setText("Осталось найти:1");
                   }
                   if (a == 5) {
                       b2.setVisibility(View.GONE);
                       Intent l = new Intent(Poisk1.this, GameO.class);
                       setResult(RESULT_OK, l);
                       finish();
                   }
               }
           });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        a++;
                        if (a == 1) {
                            b3.setVisibility(View.GONE);
                            tv.setText("Осталось найти:4");
                        }
                        if (a == 2) {
                            b3.setVisibility(View.GONE);
                            tv.setText("Осталось найти:3");

                        }
                        if (a == 3) {
                            b3.setVisibility(View.GONE);
                            tv.setText("Осталось найти:2");
                        }
                        if (a == 4) {
                            b3.setVisibility(View.GONE);
                            tv.setText("Осталось найти:1");
                        }
                        if (a == 5) {
                            b3.setVisibility(View.GONE);
                            Intent l = new Intent(Poisk1.this, GameO.class);
                            setResult(RESULT_OK, l);
                            finish();
                        }
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        a++;
                        if (a == 1) {
                            b4.setVisibility(View.GONE);
                            tv.setText("Осталось найти:4");
                        }
                        if (a == 2) {
                            b4.setVisibility(View.GONE);
                            tv.setText("Осталось найти:3");

                        }
                        if (a == 3) {
                            b4.setVisibility(View.GONE);
                            tv.setText("Осталось найти:2");
                        }
                        if (a == 4) {
                            b4.setVisibility(View.GONE);
                            tv.setText("Осталось найти:1");
                        }
                        if (a == 5) {
                            b4.setVisibility(View.GONE);
                            Intent l = new Intent(Poisk1.this, GameO.class);
                            setResult(RESULT_OK, l);
                            finish();

                        }
                    }
                });

        }
    }

