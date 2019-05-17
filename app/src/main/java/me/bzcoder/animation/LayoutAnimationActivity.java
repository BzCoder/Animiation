package me.bzcoder.animation;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bzcoder.animation.R;

import java.util.ArrayList;
import java.util.List;


/**
 * @author : BaoZhou
 * @date : 2019/1/29 16:05
 */

@Route(path = "/animator/LayoutAnimationActivity")
public class LayoutAnimationActivity extends AppCompatActivity implements View.OnClickListener {

    private Button addData;
    private ListView listView;
    private ArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, getData());
        setContentView(R.layout.activity_linear_layout);
        initView();
    }


    private void initView() {
        addData = findViewById(R.id.add_data);
        listView = findViewById(R.id.list_view);
        addData.setOnClickListener(this);
        listView.setAdapter(mAdapter);


    }

    private List<String> getData() {
        List<String> data = new ArrayList<>();
        data.add("测试数据1");
        data.add("测试数据2");
        data.add("测试数据3");
        data.add("测试数据4");
        return data;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_data:
                mAdapter.addAll(getData());
                break;
            default:
                break;
        }
    }
}
