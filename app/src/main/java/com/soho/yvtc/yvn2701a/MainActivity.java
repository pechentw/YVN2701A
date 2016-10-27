package com.soho.yvtc.yvn2701a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb = (ProgressBar) findViewById(R.id.progressBar);
    }

    public void clickshow(View v) {
        pb.setVisibility(View.VISIBLE);
    }

    public void clickhide(View v) {
        pb.setVisibility(View.INVISIBLE);
    }

    public void click1(View v) {
        pb.setVisibility(View.VISIBLE);
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        pb.setVisibility(View.INVISIBLE);
                    }
                });

            }
        }.start();
    }
}
