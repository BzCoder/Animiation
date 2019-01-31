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
    private Button linear_layout;
    private Button grid_layout;
    private Button addDeleteLayout;
    private Button addDeleteCustomLayout;
    private Button listInLayout;

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
        layout = findViewById(R.id.linear_layout);
        single.setOnClickListener(this);
        combine.setOnClickListener(this);
        flower.setOnClickListener(this);
        layout.setOnClickListener(this);
        linear_layout = (Button) findViewById(R.id.linear_layout);
        linear_layout.setOnClickListener(this);
        grid_layout = (Button) findViewById(R.id.grid_layout);
        grid_layout.setOnClickListener(this);
        addDeleteLayout = (Button) findViewById(R.id.add_delete_layout);
        addDeleteLayout.setOnClickListener(this);
        addDeleteCustomLayout = (Button) findViewById(R.id.add_delete_custom_layout);
        addDeleteCustomLayout.setOnClickListener(this);
        listInLayout = (Button) findViewById(R.id.list_in_layout);
        listInLayout.setOnClickListener(this);
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
            case R.id.linear_layout:
                ARouter.getInstance().build("/animator/LayoutAnimationActivity").navigation();
                break;
            case R.id.grid_layout:
                ARouter.getInstance().build("/animator/GridLayoutAnimationActivity").navigation();
                break;
            case R.id.add_delete_layout:
                ARouter.getInstance().build("/animator/AddDeleteAnimationActivity").navigation();
                break;
            case R.id.add_delete_custom_layout:
                ARouter.getInstance().build("/animator/AddDeleteCustomAnimationActivity").navigation();
                break;
            case R.id.list_in_layout:
                ARouter.getInstance().build("/animator/ListViewInActivity").navigation();
                break;
            default:
                break;

        }
    }
}
