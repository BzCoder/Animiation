package me.bzcoder.bitmapshadow;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bzcoder.animation.R;

@Route(path = "/draw/BitmapShadowActivity")
public class BitmapShadowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bitmap_shadow_activity);
    }
}
