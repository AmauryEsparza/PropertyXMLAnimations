package com.example.amaury.propertyxmlanimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {

    Button rotateButton, scaleButton, translateButton, alphaButton;
    ImageView githubImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotateButton = (Button) findViewById(R.id.button_rotate);
        scaleButton = (Button) findViewById(R.id.button_scale);
        translateButton = (Button) findViewById(R.id.button_translate);
        alphaButton = (Button) findViewById(R.id.button_alpha);

        githubImage = (ImageView) findViewById(R.id.imageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void rotateAnimation(View v){
        Animator anim = AnimatorInflater.loadAnimator(this, R.animator.rotate);
        anim.setTarget(githubImage);
        anim.start();
    }

    public void scaleAnimation(View v){
        Animator anim = AnimatorInflater.loadAnimator(this, R.animator.scale);
        anim.setTarget(githubImage);
        anim.start();
    }

    public void translateAnimation(View v){
        Animator anim = AnimatorInflater.loadAnimator(this, R.animator.translate);
        anim.setTarget(githubImage);
        anim.start();
    }

    public void alphaAnimation(View v){
        Animator anim = AnimatorInflater.loadAnimator(this, R.animator.alpha);
        anim.setTarget(githubImage);
        anim.start();
    }
}
