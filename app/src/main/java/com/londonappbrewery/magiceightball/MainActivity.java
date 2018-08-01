package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        final int[] ballArray = new int[]  {
            R.mipmap.ball1,
            R.mipmap.ball2,
            R.mipmap.ball3,
            R.mipmap.ball4,
            R.mipmap.ball5
        };
        Button myButton = (Button) findViewById(R.id.askbutton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int Number = randomNumberGenerator.nextInt(5);
              //  int imageresource = ballArray[Number];
                ballDisplay.setImageResource(ballArray[Number]);
            }
        });
    }
}
