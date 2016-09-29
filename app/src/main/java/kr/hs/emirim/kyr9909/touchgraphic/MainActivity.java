package kr.hs.emirim.kyr9909.touchgraphic;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    DrawShape ds = new DrawShape(getApplicationContext());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linear=(LinearLayout)findViewById(R.id.linear_view);
        linear.addView(ds);
    }
    public void drawShape(View view){


    }
    class DrawShape extends View{
        DrawShape(Context context){
            super(context);

        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float cx=getWidth()/2.0f;
            float cy=getHeight()/2.0f;
            Paint paint=new Paint();
            paint.setStrokeWidth(7);
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(cx,cy,50,paint);
            paint.setColor(Color.MAGENTA);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(10,10,210,160,paint);

        }
    }
}