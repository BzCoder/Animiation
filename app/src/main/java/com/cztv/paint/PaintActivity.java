package com.cztv.paint;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cztv.animation.R;
import com.cztv.paint.paintview.ArcView;
import com.cztv.paint.paintview.CircleView;
import com.cztv.paint.paintview.LineView;
import com.cztv.paint.paintview.MultiLineView;
import com.cztv.paint.paintview.MultiPointView;
import com.cztv.paint.paintview.OvalView;
import com.cztv.paint.paintview.PointView;
import com.cztv.paint.paintview.RectView;
import com.cztv.paint.paintview.RoundRectView;

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
