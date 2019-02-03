package com.cztv.paint.paintview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * @author : BaoZhou
 * @date : 2019/2/2 9:28
 */
public class OvalView extends View {
    public OvalView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        //设置画笔颜色
        paint.setColor(Color.YELLOW);
        //设置填充样式
        paint.setStyle(Paint.Style.FILL);
        //设置画笔宽度
        paint.setStrokeWidth(15);

        RectF rect = new RectF(100, 900, 800, 1100);
        //画矩形
        canvas.drawRect(rect, paint);
        //更改画笔颜色
        paint.setColor(Color.GREEN);
        //同一个矩形画椭圆
        canvas.drawOval(rect, paint);

    }
}
