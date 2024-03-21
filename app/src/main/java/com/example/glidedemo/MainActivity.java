package com.example.glidedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.glidedemo.base.BaseActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 基础使用
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, BaseActivity.class));
    }

    /**
     * 加载成Drawable
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, DrawableActivity.class));
    }

}