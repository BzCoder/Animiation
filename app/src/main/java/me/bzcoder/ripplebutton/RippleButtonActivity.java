package me.bzcoder.ripplebutton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bzcoder.animation.R;
/**
 *
 * @author : BaoZhou
 * @date : 2019/3/28 20:52
 */
@Route(path = "/draw/RippleButtonActivity")
public class RippleButtonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ripple_button_activity);

    }
}
