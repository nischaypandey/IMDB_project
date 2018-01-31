package com.example.vibhor.imdb_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//SplashScreen which is getting lauched on every lauch of the application
public class SplashScreen extends AppCompatActivity {

    //onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //creating new thread
        Thread thread = new Thread()
        {
            //run method
            @Override
            public void run() {
                try {
                    //to stop the screen for 3 seconds calling sleep method
                    sleep(3000);

                    //calling MainActivity
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);

                    //starting MainActivity
                    startActivity(intent);

                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        //starting thread
        thread.start();

    }//end of onCreate method

}//end of class
