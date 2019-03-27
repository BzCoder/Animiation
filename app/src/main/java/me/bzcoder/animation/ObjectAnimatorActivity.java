package me.bzcoder.animation;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bzcoder.animation.R;


/**
 * 单独动画
 * @author : BaoZhou
 * @date : 2019/1/29 16:05
 */
@Route(path = "/animator/ObjectAnimatorActivity")
public class ObjectAnimatorActivity extends AppCompatActivity {
    TextView tv;
    TextView mTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_together);
        doAnimatorOne();
        doAnimatorTwo();
        keyFrameAnimator();
    }

    void doAnimatorOne() {
        tv = findViewById(R.id.tv_text);
        ObjectAnimator animator = ObjectAnimator.ofFloat(tv, "rotation", 0, 180, 0);
        animator.setDuration(1000);
        animator.setEvaluator(new FloatEvaluator());
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.setRepeatCount(Animation.INFINITE);
//        animator.setInterpolator(new BounceInterpolator());
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                int curValue = (int) animation.getAnimatedValue();
//                tv.layout(curValue, curValue, curValue + tv.getWidth(), curValue + tv.getHeight());
//            }
//        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(MD5Utils.encrypt(Long.toString(System.currentTimeMillis()), "MD5"));
                Intent intent = new Intent(ObjectAnimatorActivity.this, PlaySequentiallyActivity.class);
                startActivity(intent);
            }
        });
        animator.start();
    }


    void doAnimatorTwo() {
        mTextView = findViewById(R.id.tv_text2);
        PropertyValuesHolder rotationHolder = PropertyValuesHolder.ofFloat("Rotation", 60f, -60f, 40f, -40f, -20f, 20f, 10f, -10f, 0f);
        PropertyValuesHolder colorHolder = PropertyValuesHolder.ofInt("BackgroundColor", 0xffffffff, 0xffff00ff, 0xffffff00, 0xffffffff);
        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(mTextView, rotationHolder, colorHolder);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.setRepeatCount(Animation.INFINITE);
        animator.setDuration(3000);
        animator.setInterpolator(new AccelerateInterpolator());
        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {

            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {
                keyFrameAnimator();
            }
        });
        animator.start();
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
        Animator animator = ObjectAnimator.ofPropertyValuesHolder(imageView, frameHolder);
        animator.setDuration(1000);
        animator.start();
    }
}
