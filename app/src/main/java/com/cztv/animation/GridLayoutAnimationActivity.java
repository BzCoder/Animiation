package com.cztv.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : BaoZhou
 * @date : 2019/1/31 13:36
 */
@Route(path = "/animator/GridLayoutAnimationActivity")
public class GridLayoutAnimationActivity extends Activity {
    private GridAdapter mGridAdapter;
    private List<String> mData = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        /**
         * 填充gridview
         */
        GridView grid = findViewById(R.id.grid);
        mData.addAll(getData());
        mGridAdapter = new GridAdapter();
        grid.setAdapter(mGridAdapter);
        /**
         * 按钮点击响应
         */
        Button addData = findViewById(R.id.add_data);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData();
            }
        });
    }

    private List<String> getData() {
        List<String> data = new ArrayList<String>();
        for (int i = 1; i < 35; i++) {
            data.add("DATA " + i);
        }
        return data;
    }

    public void addData() {
        mData.addAll(mData);
        mGridAdapter.notifyDataSetChanged();
    }

    public class GridAdapter extends BaseAdapter {
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView i = new TextView(GridLayoutAnimationActivity.this);
            i.setText(mData.get(position));
            i.setLayoutParams(new GridView.LayoutParams(GridView.LayoutParams.WRAP_CONTENT, GridView.LayoutParams.WRAP_CONTENT));
            return i;
        }

        @Override
        public final int getCount() {
            return mData.size();
        }

        @Override
        public final Object getItem(int position) {
            return null;
        }

        @Override
        public final long getItemId(int position) {
            return position;
        }
    }
}
