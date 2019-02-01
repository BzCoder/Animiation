package com.cztv.paint;

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
public class CircleView extends View {
 
	Context m_context;
	public CircleView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		m_context=context;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		
		//设置画笔基本属性
		Paint paint=new Paint();
		//抗锯齿功能
		paint.setAntiAlias(true);
		//设置画笔颜色    
		paint.setColor(Color.RED); 
		//设置填充样式   Style.FILL/Style.FILL_AND_STROKE/Style.STROKE
		paint.setStyle(Paint.Style.FILL);
		//设置画笔宽度
		paint.setStrokeWidth(5);
		//设置阴影
		paint.setShadowLayer(10, 15, 15, Color.GREEN);
		//设置画布背景颜色
        canvas.drawRGB(255, 255,255);
        //画圆
        canvas.drawCircle(190, 200, 150, paint);	
	}
 
}