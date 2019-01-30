package com.cztv.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.alibaba.android.arouter.facade.annotation.Route;

import java.util.ArrayList;
import java.util.List;



/**
 * 联合动画
 *
 * @author : BaoZhou
 * @date : 2019/1/29 16:05
 */

@Route(path = "/animator/LayoutAnimationActivity")
public class LayoutAnimationActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);
    }



}
