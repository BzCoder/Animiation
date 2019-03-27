package me.bzcoder.paint.paintview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 *
 * @author : BaoZhou
 * @date : 2019/2/1 11:41
 */
public class MultiLineView extends View {

	Context m_context;
	public MultiLineView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		m_context=context;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint paint=new Paint();
		//设置画笔颜色
		paint.setColor(Color.BLACK);
		//设置填充样式
		paint.setStyle(Paint.Style.FILL);
		//设置画笔宽度
		paint.setStrokeWidth(5);
		float []pts={600,100,800,200,600,200,800,400};
		canvas.drawLines(pts, paint);
	}
 
}