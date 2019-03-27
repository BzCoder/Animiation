package me.bzcoder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bzcoder.animation.R;


/**
 * @author : BaoZhou
 * @date : 2019/1/29 16:05
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button single;
    private Button combine;
    private Button flower;
    private Button linearLayout;
    private Button gridLayout;
    private Button addDeleteLayout;
    private Button addDeleteCustomLayout;
    private Button listInLayout;
    private Button paintLayout;
    private Button drawLayout;
    private Button waveLayout;
    private Button qqRedPointLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {

        single = (Button) findViewById(R.id.single);
        single.setOnClickListener(this);
        combine = (Button) findViewById(R.id.combine);
        combine.setOnClickListener(this);
        flower = (Button) findViewById(R.id.flower);
        flower.setOnClickListener(this);
        linearLayout = (Button) findViewById(R.id.linear_layout);
        linearLayout.setOnClickListener(this);
        gridLayout = (Button) findViewById(R.id.grid_layout);
        gridLayout.setOnClickListener(this);
        addDeleteLayout = (Button) findViewById(R.id.add_delete_layout);
        addDeleteLayout.setOnClickListener(this);
        addDeleteCustomLayout = (Button) findViewById(R.id.add_delete_custom_layout);
        addDeleteCustomLayout.setOnClickListener(this);
        listInLayout = (Button) findViewById(R.id.list_in_layout);
        listInLayout.setOnClickListener(this);
        paintLayout = (Button) findViewById(R.id.paint_layout);
        paintLayout.setOnClickListener(this);

        drawLayout = (Button) findViewById(R.id.draw_layout);
        drawLayout.setOnClickListener(this);
        waveLayout = (Button) findViewById(R.id.wave_layout);
        waveLayout.setOnClickListener(this);
        qqRedPointLayout = (Button) findViewById(R.id.qq_red_point_layout);
        qqRedPointLayout.setOnClickListener(this);
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
            case R.id.paint_layout:
                ARouter.getInstance().build("/paint/PaintActivity").navigation();
                break;
            case R.id.draw_layout:
                ARouter.getInstance().build("/draw/DrawActivity").navigation();
                break;
            case R.id.wave_layout:
                ARouter.getInstance().build("/draw/WaveActivity").navigation();
                break;
            case R.id.qq_red_point_layout:
                ARouter.getInstance().build("/draw/QQRedPointActivity").navigation();
                break;
            default:
                break;


        }
    }
}
