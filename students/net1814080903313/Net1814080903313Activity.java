package edu.hzuapps.androidlabs.net1814080903313;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class Net1814080903313Activity extends AppCompatActivity {
    private ImageView welcomeImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeImg=this.findViewById(R.id.img_1);
        AlphaAnimation anima =  new AlphaAnimation(0.3f, 1.0f);
        anima.setDuration(10000);// 设置动画显示时间
        welcomeImg.startAnimation(anima);
        anima.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
welcomeImg.setBackgroundResource(R.drawable.img1);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
skip();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }


    private void skip() {
        Intent intent = new Intent(this,QueryFunction.class);
        startActivity(intent);
        finish();
    }
}
