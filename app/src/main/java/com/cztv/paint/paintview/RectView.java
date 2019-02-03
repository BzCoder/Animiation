package com.cztv.paint.paintview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/**
 * @author : BaoZhou
 * @date : 2019/2/1 11:41
 */
public class RectView extends View {

    Context m_context;

    public RectView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub

        m_context = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        //设置画笔颜色
        paint.setColor(Color.RED);
        //设置填充样式
        paint.setStyle(Paint.Style.FILL);
        //设置画笔宽度
        paint.setStrokeWidth(15);
        //直接构造
        canvas.drawRect(10, 500, 100, 600, paint);

        RectF rect = new RectF(120, 500, 210, 600);
        //使用RectF构造
        canvas.drawRect(rect, paint);

        Rect rect2 = new Rect(230, 500, 320, 600);
        //使用Rect构造
        canvas.drawRect(rect2, paint);
    }

}