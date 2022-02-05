package com.example.mycurrentlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    Animation topanim;
    ImageView image;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
         topanim= AnimationUtils.loadAnimation(this,R.anim.splash_animation);

         image=findViewById(R.id.logo);
  image.setAnimation(topanim);
  Thread thread=new Thread(){
      public void run(){
          try{
     sleep(4000);
          }
          catch(Exception e){
              e.printStackTrace();

          }
          finally {


              Intent intent=new Intent(SplashActivity.this, MainActivity.class);
              startActivity(intent);
          }
          }
  };
    thread.start();
    }
}