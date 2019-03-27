package me.bzcoder.draw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bzcoder.animation.R;

/**
 * 自定义画图界面
 * @author : BaoZhou
 * @date : 2019/2/2 15:01
 */
@Route(path = "/draw/DrawActivity")
public class DrawActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_custom);
        FrameLayout root= findViewById(R.id.root);
        root.addView(new DrawView(DrawActivity.this));
    }
}
