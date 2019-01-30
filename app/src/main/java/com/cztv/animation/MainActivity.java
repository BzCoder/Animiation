package com.cztv.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;


/**
 * @author : BaoZhou
 * @date : 2019/1/29 16:05
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button single;
    private Button combine;
    private Button flower;
    private Button layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {
        single = findViewById(R.id.single);
        combine = findViewById(R.id.combine);
        flower = findViewById(R.id.flower);
        layout = findViewById(R.id.layout);

        single.setOnClickListener(this);
        combine.setOnClickListener(this);
        flower.setOnClickListener(this);
        layout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.single:
                ARouter.getInstance().build("/animator/ObjectAnimatorActivity").navigation();
                break;
            case R.id.combine:
                ARouter.getInstance().build("/animator/PlaySequentiallyActivity").navigation();
                break;
            case R.id.flower:
                ARouter.getInstance().build("/animator/FlowerAnimatorActivity").navigation();
                break;
            case R.id.layout:
                ARouter.getInstance().build("/animator/LayoutAnimationActivity").navigation();
                break;
            default:
                break;
        }
    }
}
