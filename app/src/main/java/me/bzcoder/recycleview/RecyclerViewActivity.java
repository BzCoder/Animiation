package me.bzcoder.recycleview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bzcoder.animation.R;

import java.util.ArrayList;

/**
 * 自定义LayoutManager
 *
 * @author : BaoZhou
 * @date : 2019/5/19 9:43
 */
@Route(path = "/view/RecyclerViewActivity")
public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> mData = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_activity);
        initView();

    }

    private void initView() {
        generateData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new CustomLayoutManager());
        recyclerView.setAdapter(new RecyclerAdapter(this,mData));
    }


    private void generateData() {
        for (int i = 0; i < 200; i++) {
            mData.add("第 " + i + " 个item");
        }
    }
}
