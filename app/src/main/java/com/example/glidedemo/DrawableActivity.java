package com.example.glidedemo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;

public class DrawableActivity extends AppCompatActivity {

    private String url = "https://twww1.ayomet.com/public/images/gameIcon/wheel.png";
    private String url1 = "https://s11.ax1x.com/2024/01/18/pFkLu6K.png";
    private ImageView imgvTest;
    
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable);
        imgvTest = findViewById(R.id.imgv_test);
    }
    
    public void onLoad(View v) {
        Glide.with(this)
//                .asFile()
                .load(url)
//                .apply(requestOptions)
                .into(new CustomTarget<Drawable>() {

                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                        if(imgvTest != null)
                            imgvTest.setImageDrawable(resource);
                    }

                    @Override
                    public void onLoadCleared(@Nullable Drawable placeholder) {

                    }
                });
    }

    public void getDrawableGlide(String url, CustomTarget<Drawable> customTarget) {
        Glide.with(this).load(url).into(customTarget);
    }

}