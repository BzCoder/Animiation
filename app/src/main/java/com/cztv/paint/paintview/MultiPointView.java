package com.cztv.paint.paintview;

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
public class MultiPointView extends View {

	Context m_context;
	public MultiPointView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		m_context=context;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		Paint paint=new Paint();
		//设置画笔颜色
		paint.setColor(Color.GREEN);
		//设置填充样式
		paint.setStyle(Paint.Style.FILL);
		//设置画笔宽度
		paint.setStrokeWidth(15);

		float []pts={10,400,100,400,200,400,300,400};
		canvas.drawPoints(pts, 2, 4, paint);
	}
 
}