package me.bzcoder.paint.paintview;

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
public class ArcView extends View {
    public ArcView(Context context) {
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

        RectF rect1 = new RectF(100, 1000, 300, 1300);
        canvas.drawArc(rect1, 0, 90, true, paint);

        RectF rect2 = new RectF(400, 1000, 600, 1300);
        canvas.drawArc(rect2, 0, 90, false, paint);

    }
}
