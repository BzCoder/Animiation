package me.bzcoder.animation;

import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bzcoder.animation.R;


/**
 * 联合动画
 *
 * @author : BaoZhou
 * @date : 2019/1/29 16:05
 */

@Route(path = "/animator/PlaySequentiallyActivity")
public class PlaySequentiallyActivity extends AppCompatActivity {
    TextView tv;
    TextView mTextView;
    ImageView imageView;
    ObjectAnimator animator, animator2, animator3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_together);
        doAnimatorOne();
        doAnimatorTwo();
        keyFrameAnimator();


        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet.Builder builder = animatorSet2.play(animator);
        builder.after(animator2);
        builder.after(animator3);
        animatorSet2.start();


    }

    void doAnimatorOne() {
        tv = findViewById(R.id.tv_text);
        animator = ObjectAnimator.ofFloat(tv, "rotation", 0, 180, 0);
        animator.setDuration(3000);
        animator.setEvaluator(new FloatEvaluator());
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(MD5Utils.encrypt(Long.toString(System.currentTimeMillis()), "MD5"));
                keyFrameAnimator();
            }
        });
    }


    void doAnimatorTwo() {
        mTextView = findViewById(R.id.tv_text2);
        PropertyValuesHolder rotationHolder = PropertyValuesHolder.ofFloat("Rotation", 60f, -60f, 40f, -40f, -20f, 20f, 10f, -10f, 0f);
        PropertyValuesHolder colorHolder = PropertyValuesHolder.ofInt("BackgroundColor", 0xffffffff, 0xffff00ff, 0xffffff00, 0xffffffff);
        animator2 = ObjectAnimator.ofPropertyValuesHolder(mTextView, rotationHolder, colorHolder);
        animator2.setDuration(3000);
        animator2.setInterpolator(new AccelerateInterpolator());
    }

    void keyFrameAnimator() {
        imageView = findViewById(R.id.icon);
        Keyframe frame0 = Keyframe.ofFloat(0f, 0);
        Keyframe frame1 = Keyframe.ofFloat(0.1f, -20f);
        Keyframe frame2 = Keyframe.ofFloat(0.2f, 20f);
        Keyframe frame3 = Keyframe.ofFloat(0.3f, -20f);
        Keyframe frame4 = Keyframe.ofFloat(0.4f, 20f);
        Keyframe frame5 = Keyframe.ofFloat(0.5f, -20f);
        Keyframe frame6 = Keyframe.ofFloat(0.6f, 20f);
        Keyframe frame7 = Keyframe.ofFloat(0.7f, -20f);
        Keyframe frame8 = Keyframe.ofFloat(0.8f, 20f);
        Keyframe frame9 = Keyframe.ofFloat(0.9f, -20f);
        Keyframe frame10 = Keyframe.ofFloat(1, 0);
        PropertyValuesHolder frameHolder = PropertyValuesHolder.ofKeyframe("rotation", frame0, frame1, frame2, frame3, frame4, frame5, frame6, frame7, frame8, frame9, frame10);
        animator3 = ObjectAnimator.ofPropertyValuesHolder(imageView, frameHolder);
        animator3.setDuration(3000);
    }
}
