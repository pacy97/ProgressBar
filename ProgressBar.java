package com.example.Pacasian.pacy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sumith on 16-10-2017.
 */

public class about extends AppCompatActivity {

ProgressBar progressbar;
Button button;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        progressbar=(ProgressBar)findViewById(R.id.tv);
        button=(Button)finViewById(R.id.button);
        button=(TextView)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Thread threa =new Thread()
               {
               @Override
               public void run(){
               super.run();
               or (int k = 0; k <= 100; ) {
                     try {
                         sleep(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     progressBar.setProgress(k);
                     k = k + 10;
                 }
             }

         };
         thread.start();
               }
               }
               
            }
        });
    }
}
