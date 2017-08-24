package com.i5d5.basemodule.ImageLoad;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * class_name: TestActivity
 * package_name: com.i5d5.basemodule.ImageLoad
 * acthor: lucheng
 * time: 2017/7/18 10:35
 */

public class TestActivity extends AppCompatActivity {
    private ImageView img1;
    private String url;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageLoaderManager.getInstance().showImage(ImageLoaderManager.getDefaultOptions(img1, url));
    }
}
