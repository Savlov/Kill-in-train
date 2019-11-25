package com.example.again;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class PutiCanvas extends View {
    float x, a;
    String S;
    int i;
    int t = 14, t1, v, p, l, n;

    Context context;
    float y, b;
    int k;

    public PutiCanvas(Context context) {
        super(context);



    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float angle = 30;
        Bitmap bt;
        float rx = getHeight() / 2;
        float ry = getWidth() / 2;

            bt = BitmapFactory.decodeResource(getResources(), R.drawable.pr2);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        paint.setColor(Color.argb(255, 255, 255, 255));
          canvas.drawBitmap(bt, 0, 0, paint);
        paint.setColor(Color.argb(100, 255, 255, 255));
        canvas.drawPaint(paint);

        Paint shadowPaint = new Paint();
        shadowPaint.setAntiAlias(true);
        shadowPaint.setColor(Color.BLACK);
        shadowPaint.setTextSize(80);

        canvas.drawText("Осталось:" + t, getWidth() / 10, getHeight() - getHeight() / 10, shadowPaint);
        shadowPaint.setTextSize(40);
        canvas.drawText("Ближайшие дороги:", getWidth() / 2, getHeight() - getHeight() / 10 - 100, shadowPaint);
        canvas.drawText("вверх:" + v, getWidth() / 2, getHeight() - getHeight() / 10 - 55, shadowPaint);
        canvas.drawText("вниз:" + n, getWidth() / 2, getHeight() - getHeight() / 10 - 5, shadowPaint);
        canvas.drawText("враво:" + p, getWidth() / 2, getHeight() - getHeight() / 10 + 40, shadowPaint);
        canvas.drawText("влево:" + l, getWidth() / 2, getHeight() - getHeight() / 10 + 85, shadowPaint);

        paint.setColor(Color.argb(255, 124, 252, 0));

        canvas.drawRect(getWidth() / 2 - 10, getHeight() - (getHeight() / 4), getWidth() / 2 + 10, getHeight() - (getHeight() / 4) * 2, paint);

        paint.setColor(Color.argb(255, 255, 165, 0));
        canvas.drawRect(getWidth() / 2 - 10, getHeight() - (getHeight() / 4) + 10, getWidth() / 2 + getWidth() / 4, getHeight() - (getHeight() / 4) - 10, paint);
        paint.setColor(Color.argb(255, 255, 0, 0));
        canvas.drawRect(getWidth() / 2 + getWidth() / 4 - 20, getHeight() - (getHeight() / 4), getWidth() / 2 + getWidth() / 4, getHeight() - (getHeight() / 4) * 2, paint);
        paint.setColor(Color.argb(255, 255, 165, 0));
        canvas.drawRect(getWidth() / 2 - 10, getHeight() - (getHeight() / 4) * 2 + 10, getWidth() / 2 + getWidth() / 4, getHeight() - (getHeight() / 4) * 2 - 10, paint);
        paint.setColor(Color.argb(255, 139, 0, 0));
        canvas.drawRect(getWidth() / 2 + 10, getHeight() - (getHeight() / 4) * 2, getWidth() / 2 - 10, (getHeight() / 2) - getHeight() / 5, paint);
        paint.setColor(Color.argb(255, 255, 255, 0));
        canvas.drawRect(getWidth() / 2 + getWidth() / 4 - 20, getHeight() - (getHeight() / 4) * 2, getWidth() / 2 + getWidth() / 4, (getHeight() / 2) - getHeight() / 5, paint);
        canvas.drawRect(getWidth() / 2 + getWidth() / 4, (getHeight() / 2) - getHeight() / 5, getWidth() / 3, (getHeight() / 2) - getHeight() / 5 - 20, paint);
        paint.setColor(Color.argb(255, 124, 252, 0));
        canvas.drawRect(getWidth() / 2 + getWidth() / 4, getHeight() - (getHeight() / 4) * 2 + 10, getWidth() / 3, getHeight() - (getHeight() / 4) * 2 - 10, paint);
        canvas.drawRect(getWidth() / 3, getHeight() - (getHeight() / 4) * 2 + 10, getWidth() / 3 + 20, (getHeight() / 2) - getHeight() / 5 - 20, paint);
        canvas.drawRect(getWidth() / 2 - 10, getHeight() / 3, getWidth() / 2 + 10, getHeight() / 8, paint);
        if (a == 0 && b == 0) {
            paint.setColor(Color.argb(170, 0, 0, 255));
            canvas.drawCircle(getWidth() / 2, getHeight() - (getHeight() / 4), 50, paint);
            paint.setColor(Color.argb(255, 0, 0, 255));
        }

        if (a == 1 && b == 1) {
            paint.setColor(Color.argb(255, 0, 0, 175));
            canvas.drawCircle(getWidth() / 2, getHeight() - (getHeight() / 4), 50, paint);
            paint.setColor(Color.argb(255, 0, 0, 255));
            canvas.drawCircle(getWidth() / 2 + getWidth() / 4 - 10, getHeight() - (getHeight() / 4) - 10, 50, paint);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, 50, paint);
            p = 5;
            v = 2;
            invalidate();

        }
        if (a == 2 && b == 2) {
            n = 0;
            p = 0;
            v = 7;
            l = 5;
            paint.setColor(Color.argb(255, 0, 0, 175));
            canvas.drawCircle(getWidth() / 2 + getWidth() / 4 - 10, getHeight() - (getHeight() / 4) - 10, 50, paint);
            paint.setColor(Color.argb(255, 0, 0, 255));
            canvas.drawCircle(getWidth() / 2 + getWidth() / 4 - 10, getHeight() / 2, 50, paint);
            canvas.drawCircle(getWidth() / 2, getHeight() - (getHeight() / 4), 50, paint);
            invalidate();


        }
        if (a == 22 && b == 22) {
            paint.setColor(Color.argb(255, 0, 0, 175));
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, 50, paint);
            paint.setColor(Color.argb(255, 0, 0, 255));
            canvas.drawCircle(getWidth() / 2, getHeight() / 3 + 40, 50, paint);
            canvas.drawCircle(getWidth() / 2, getHeight() - (getHeight() / 4), 50, paint);
            canvas.drawCircle(getWidth() / 2 + getWidth() / 4 - 10, getHeight() / 2, 50, paint);
            canvas.drawCircle(getWidth() / 3 + 10, getHeight() / 2, 50, paint);
            invalidate();
            v = 11;
            p = 2;
            l = 2;
            n = 2;

        }
        if (a == 3 && b == 3) {
            v = 4;
            n = 7;
            l = 2;
            p = 0;
            paint.setColor(Color.argb(255, 0, 0, 175));
            canvas.drawCircle(getWidth() / 2 + getWidth() / 4 - 10, getHeight() / 2, 50, paint);
            paint.setColor(Color.argb(255, 0, 0, 255));
            canvas.drawCircle(getWidth() / 2 + getWidth() / 4 - 10, getHeight() - (getHeight() / 4) - 10, 50, paint);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, 50, paint);
            canvas.drawCircle(getWidth() / 2 + getWidth() / 4 - 10, getHeight() / 4 + 98, 50, paint);
            invalidate();

        }
        if (a == 32 && b == 32) {

            paint.setColor(Color.argb(255, 0, 0, 175));
            canvas.drawCircle(getWidth() / 2, getHeight() / 3 + 40, 50, paint);
            paint.setColor(Color.argb(255, 0, 0, 255));
            canvas.drawCircle(getWidth() / 2, getHeight() / 4 + 100, 50, paint);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, 50, paint);
            // left verx canvas.drawCircle(getWidth() / 3+10, getHeight()/3-80, 50, paint);
            invalidate();
            v = 1;
            p = 0;
            l = 0;
            n = 11;
        }
        if (a == 33 & b == 33) {
            paint.setColor(Color.argb(255, 0, 0, 175));
            canvas.drawCircle(getWidth() / 3 + 10, getHeight() / 2, 50, paint);
            paint.setColor(Color.argb(255, 0, 0, 255));
            canvas.drawCircle(getWidth() / 3 + 10, getHeight() / 3 - 80, 50, paint);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, 50, paint);
            v = 5;
            p = 2;
            l = 0;
            n = 0;

        }
        if (a == 42 && b == 42) {
            paint.setColor(Color.argb(255, 0, 0, 175));
            canvas.drawCircle(getWidth() / 3 + 10, getHeight() / 3 - 80, 50, paint);
            paint.setColor(Color.argb(255, 0, 0, 255));
            canvas.drawCircle(getWidth() / 3 + 10, getHeight() / 2, 50, paint);
            canvas.drawCircle(getWidth() / 2, getHeight() / 4 + 100, 50, paint);
            p = 3;
            l = 0;
            v = 0;
            n = 5;
        }
        if (a == 43 && b == 43) {
            paint.setColor(Color.argb(255, 0, 0, 175));
            canvas.drawCircle(getWidth() / 2 + getWidth() / 4 - 10, getHeight() / 4 + 98, 50, paint);
            paint.setColor(Color.argb(255, 0, 0, 255));
            canvas.drawCircle(getWidth() / 2, getHeight() / 4 + 100, 50, paint);
            canvas.drawCircle(getWidth() / 2 + getWidth() / 4 - 10, getHeight() / 2, 50, paint);
            v = 0;
            n = 4;
            p = 0;
            l = 3;


        }
        if (a == 6 && b == 6) {
            paint.setColor(Color.argb(255, 0, 0, 175));
            canvas.drawCircle(getWidth() / 2, getHeight() / 4 + 100, 50, paint);
            paint.setColor(Color.argb(255, 0, 0, 255));
            canvas.drawCircle(getWidth() / 3 + 10, getHeight() / 3 - 80, 50, paint);
            canvas.drawCircle(getWidth() / 2, getHeight() / 3 + 40, 50, paint);
            canvas.drawCircle(getWidth() / 2 + getWidth() / 4 - 10, getHeight() / 4 + 98, 50, paint);
            canvas.drawCircle(getWidth() / 2, getHeight() / 8, 50, paint);
            n = 1;
            p = 3;
            l = 3;
            v = 2;
        }
        if (a == 10 && b == 10) {

            paint.setColor(Color.argb(255, 255, 255, 255));
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, 10000, paint);
            paint.setColor(Color.argb(255, 0, 0, 0));
            shadowPaint.setTextSize(80);
            if (t >= 0) {
                S = "Вовремя";
                canvas.drawText(S, getWidth() / 2 - getWidth() / 8, getHeight() / 2, shadowPaint);
                shadowPaint.setTextSize(40);
                canvas.drawText("Нажмите кнопку 'назад' для продолжения",getWidth() / 2 - getWidth() / 8, getHeight() / 2+45, shadowPaint);
            } else {
                System.out.println(t+ "Here");
                S = "Опоздал";
                canvas.drawText(S, getWidth() / 2- getWidth() / 8, getHeight() / 2, shadowPaint);
                shadowPaint.setTextSize(40);
                canvas.drawText("Нажмите на экран для продолжения",getWidth() / 2 - getWidth() / 8, getHeight() / 2+45, shadowPaint);

                a = 0;
                b = 0;
                t = 14;
                n = 0;
                v = 0;
                p = 0;
                l = 0;
            }


        }


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();

        float y = event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                System.out.print("This is x:");
                System.out.println(x);
                System.out.print("This is y:");
                System.out.println(y);
                if (x >= getWidth() / 2 - 25 && x <= getWidth() / 2 + 25 && y <= getHeight() - (getHeight() / 4) + 25 && y >= getHeight() - (getHeight() / 4) - 25) {
                    if (a == 22 & b == 22) {
                        t = t - n;
                    } else if (a == 22 && b == 22) {
                        t = t - l;
                    }
                    a = 1;
                    b = 1;
                    k++;
                    invalidate();
                }
                if (k >= 1 && x >= getWidth() / 2 + getWidth() / 4 - 10 - 20 && x <= getWidth() / 2 + getWidth() / 4 - 10 + 20 && y <= getHeight() - (getHeight() / 4) - 10 + 20 && y >= getHeight() - (getHeight() / 4) - 10 - 20) {
                    if (a == 1 && b == 1) {
                        t = t - p;
                    } else if (a == 3 && b == 3) {
                        t = t - n;
                    }
                    a = 2;
                    b = 2;
                    k++;


                    invalidate();
                }
                if (k >= 1 && x >= getWidth() / 2 - 20 && x <= getWidth() / 2 + 20 && y <= getHeight() / 2 + 20 && y >= getHeight() / 2 - 20) {
                    if (a == 1 && b == 1) {
                        t = t - v;
                    } else if (a == 33 && b == 33) {
                        t = t - p;
                    } else if (a == 3 && b == 3) {
                        t = t - l;
                    } else if (a == 32 && b == 32) {
                        t = t - n;
                    }
                    a = 22;
                    b = 22;
                    k++;

                    invalidate();
                }
                if (k >= 3 && x >= getWidth() / 3 - 10 && x <= getWidth() / 3 + 30 && y <= getHeight() / 2 + 20 && y >= getHeight() / 2 - 20) {
                    if (a == 22 && b == 22) {
                        t = t - l;
                    } else if (a == 42 && b == 42) {
                        t = t - n;
                    }
                    a = 33;
                    b = 33;
                    k++;
                }
                if (k >= 4 && x >= getWidth() / 3 - 10 && x <= getWidth() / 3 + 30 && y >= getHeight() / 3 - 80 - 20 && y <= getHeight() / 3 - 80 + 20) {
                    if (a == 33 && b == 33) {
                        t = t - v;
                    } else if (a == 6 && b == 6) {
                        t = t - p;
                    }
                    a = 42;
                    b = 42;
                    k++;
                    invalidate();
                }
                if (k >= 4 && x >= getWidth() / 2 + getWidth() / 4 - 10 - 20 && x <= getWidth() / 2 + getWidth() / 4 - 10 + 20 && y >= getHeight() / 3 - 80 - 20 && y <= getHeight() / 3 - 80 + 20) {
                    if (a == 3 && b == 3) {
                        t = t - v;
                    } else if (a == 6 && b == 6) {
                        t = t - l;
                    }
                    a = 43;
                    b = 43;
                    k++;
                }
                if (k >= 2 && x >= getWidth() / 2 + getWidth() / 4 - 10 - 20 && x <= getWidth() / 2 + getWidth() / 4 - 10 + 20 && y <= getHeight() / 2 + 20 && y >= getHeight() / 2 - 20) {
                    if (a == 43 && b == 43) {
                        t = t - n;
                    } else if (a == 2 && b == 2) {
                        t = t - v;
                    } else if (a == 22 && b == 22) {
                        t = t - l;
                    }

                    a = 3;
                    b = 3;
                    k++;


                    invalidate();
                }

                if (k >= 2 && x >= getWidth() / 2 - 20 && x <= getWidth() / 2 + 20 && y <= getHeight() / 3 + 60 && y >= getHeight() / 3 + 20) {
                    if (a == 22 && b == 22) {
                        t = t - v;
                    } else if (a == 6 && b == 6) {
                        t = t - n;
                    }
                    a = 32;
                    b = 32;
                    k++;
                    invalidate();
                }

                if (k >= 3 && x >= getWidth() / 2 - 20 && x <= getWidth() / 2 + 20 && y >= getHeight() / 4 + 100 - 20 && y <= getHeight() / 4 + 100 + 20) {
                    if (a == 32 && b == 32) {
                        t = t - v;
                    } else if (a == 42 && b == 42) {
                        t = t - p;
                    } else if (a == 43 && b == 43) {
                        t = t - l;
                    }
                    a = 6;
                    b = 6;
                    k++;
                    invalidate();
                }
                if (k >= 4 && x >= getWidth() / 2 - 20 && x <= getWidth() / 2 + 20 && y >= getHeight() / 8 - 20 && y <= getHeight() / 8 + 20) {
                   if(a==6 && b==6){
                       t=t-v;
                   }
                    a = 10;
                    b = 10;
                    k++;
                }
                break;
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                invalidate();
                break;
        }


        return true;


    }


}
