package com.cztv.paint.paintview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
/**
 * 
 * @author : BaoZhou
 * @date : 2019/2/2 9:28
 */
public class RoundRectView extends View{
    public RoundRectView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        //设置画笔颜色
        paint.setColor(Color.YELLOW);
        //设置填充样式
        paint.setStyle(Paint.Style.FILL);
        //设置画笔宽度
        paint.setStrokeWidth(15);

        RectF rect = new RectF(450, 500, 700, 800);
        canvas.drawRoundRect(rect, 20, 10, paint);

    }
}
