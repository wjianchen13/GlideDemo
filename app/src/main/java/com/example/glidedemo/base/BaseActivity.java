package com.example.glidedemo.base;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.glidedemo.GlideApp;
import com.example.glidedemo.R;

public class BaseActivity extends AppCompatActivity {

    private String url = "https://timg.kiwii.tv/upload/anchor_image/345X257/99/4029899_54acf4035e058.jpg";
    private ImageView imgvTest;
    
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        imgvTest = findViewById(R.id.imgv_test);
    }
    
    public void onLoad(View v) {
        GlideApp.with(this)
                .load(url)
                .circleCrop()
//                .fitCenter()
                .into(imgvTest);
    }
    
}