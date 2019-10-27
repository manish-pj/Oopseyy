package com.brogrammers.oops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name, caption, btn;
    ImageView ivSplash;
    Animation smalltobig, fleft, fhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);
        fleft = AnimationUtils.loadAnimation(this, R.anim.fleft);
        fhelper = AnimationUtils.loadAnimation(this, R.anim.fhelper);



        name = (TextView) findViewById(R.id.name);
        caption = (TextView) findViewById(R.id.caption);
        btn = (TextView) findViewById(R.id.btn);

        ivSplash = (ImageView) findViewById(R.id.ivSplash);


        ivSplash.startAnimation(smalltobig);

        name.setTranslationX(400);
        caption.setTranslationX(400);
        btn.setTranslationX(400);

        name.setAlpha(0);
        caption.setAlpha(0);
        btn.setAlpha(0);

        name.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        caption.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        btn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(900).start();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ax = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(ax);
                overridePendingTransition(R.anim.fleft, R.anim.fhelper);
            }
        });
    }
}
