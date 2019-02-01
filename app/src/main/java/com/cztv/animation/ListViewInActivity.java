package com.cztv.animation;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;


import com.alibaba.android.arouter.facade.annotation.Route;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author : BaoZhou
 * @date : 2019/1/31 17:03
 */
@Route(path = "/animator/ListViewInActivity")
public class ListViewInActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_in);
        List<Drawable> drawables = new ArrayList<>();
        drawables.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        drawables.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        drawables.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        drawables.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        drawables.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        drawables.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        drawables.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        drawables.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        drawables.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        drawables.add(getResources().getDrawable(R.drawable.ic_launcher_background));


        ListView listView = findViewById(R.id.list);
        ListAdapter adapter = new ListAdapter(this, listView, drawables, 300);
        listView.setAdapter(adapter);


    }
}