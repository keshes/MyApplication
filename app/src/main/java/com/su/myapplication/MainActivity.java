package com.su.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_view);

        ImageView imageView= findViewById(R.id.imageView3);
        ScrollView scrollView=findViewById(R.id.scrollView);
        scrollView.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        BitmapDrawable bitmapDrawable=(BitmapDrawable) res.getDrawable(R.drawable.spring_1);

        int width=bitmapDrawable.getIntrinsicWidth();
        int height=bitmapDrawable.getIntrinsicHeight();

        imageView.setImageDrawable(bitmapDrawable);
        imageView.getLayoutParams().width=width;
        imageView.getLayoutParams().height=height;

    }
}
