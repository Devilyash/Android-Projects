package com.example.fadinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void fade(View view)  {

        ImageView dog = (ImageView) findViewById(R.id.dog);

        ImageView dog2 = (ImageView) findViewById(R.id.dog2);

        dog.animate().alpha(0f).setDuration(2000);

        dog2.animate().alpha(1f).setDuration(2000);



    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView dog2 = (ImageView) findViewById(R.id.dog2);
        dog2.animate().alpha(0f).setDuration(2000);

    }
}
