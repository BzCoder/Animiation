package me.bzcoder.paint;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bzcoder.animation.R;
import me.bzcoder.paint.paintview.ArcView;
import me.bzcoder.paint.paintview.CircleView;
import me.bzcoder.paint.paintview.LineView;
import me.bzcoder.paint.paintview.MultiLineView;
import me.bzcoder.paint.paintview.MultiPointView;
import me.bzcoder.paint.paintview.OvalView;
import me.bzcoder.paint.paintview.PointView;
import me.bzcoder.paint.paintview.RectView;
import me.bzcoder.paint.paintview.RoundRectView;

/**
 * 
 * @author : BaoZhou
 * @date : 2019/2/1 9:36
 */
@Route(path = "/paint/PaintActivity")
public class PaintActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);
        FrameLayout root= findViewById(R.id.root);
        root.addView(new CircleView(PaintActivity.this));
        root.addView(new LineView(PaintActivity.this));
        root.addView(new MultiLineView(PaintActivity.this));
        root.addView(new PointView(PaintActivity.this));
        root.addView(new MultiPointView(PaintActivity.this));
        root.addView(new RectView(PaintActivity.this));
        root.addView(new RoundRectView(PaintActivity.this));
        root.addView(new OvalView(PaintActivity.this));
        root.addView(new ArcView(PaintActivity.this));
    }

}
