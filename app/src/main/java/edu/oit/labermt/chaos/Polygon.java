package edu.oit.labermt.chaos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Polygon extends View {
    Paint paint_;

    public Polygon(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init()
    {
        paint_ = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint_.setStyle(Paint.Style.FILL);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(100, 100, 50, paint_);
    }
}
