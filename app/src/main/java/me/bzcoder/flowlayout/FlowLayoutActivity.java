package me.bzcoder.flowlayout;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bzcoder.animation.R;

/**
 * @author : BaoZhou
 * @date : 2019/5/14 17:44
 */
@Route(path = "/draw/FlowLayoutActivity")
public class FlowLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow_layout);
    }
}
