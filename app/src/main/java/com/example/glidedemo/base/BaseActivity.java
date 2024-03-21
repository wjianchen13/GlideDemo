package com.example.glidedemo.base;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.glidedemo.GlideApp;
import com.example.glidedemo.R;

public class BaseActivity extends AppCompatActivity {

    private String url = "https://twww1.ayomet.com/public/images/gameIcon/wheel.png";
    private String url1 = "https://s11.ax1x.com/2024/01/18/pFkLu6K.png";
    private ImageView imgvTest;
    
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        imgvTest = findViewById(R.id.imgv_test);
    }
    
    public void onLoad(View v) {
        RequestOptions options = new RequestOptions()
                .transform(new CircleCrop())
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE);
        GlideApp.with(this)
                .load(url1)
                .circleCrop()
//                .fitCenter()
                .apply(options)
                .into(imgvTest);
    }
    
}