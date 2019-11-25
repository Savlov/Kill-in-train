package com.example.again;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b, b2, b3;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         b1 = findViewById(R.id.button);

        b3 = findViewById(R.id.button7);
        b = findViewById(R.id.button4);

            startService(new Intent(this, MyServise.class));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, GameO.class);
                startActivity(i);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b.getText() == "Звук вкл") {
                    startService(new Intent(MainActivity.this, MyServise.class));
                    b.setText("Звук выкл");

                } else {
                    stopService(new Intent(MainActivity.this, MyServise.class));
                    b.setText("Звук вкл");
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(MainActivity.this, MyServise.class));
                finish();
                System.exit(0);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        stopService(new Intent(MainActivity.this, MyServise.class));

    }



    public void onBackPressed() {
        stopService(new Intent(this, MyServise.class));
        finish();
    }
}
