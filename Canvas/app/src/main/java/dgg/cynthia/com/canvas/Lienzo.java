package dgg.cynthia.com.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by Cynthia on 01/05/2017.
 */
class Lienzo extends View {

    public Lienzo(Context context) {
        super(context);
    }

    protected void onDraw(Canvas canvas) {
        int ancho = canvas.getWidth();
        int alto = canvas.getHeight();
        Paint pincel1 = new Paint();
        pincel1.setARGB(255, 0, 0, 0);
        canvas.drawPoint(ancho / 2, alto / 2, pincel1);
        /*pintar fondo y linea*/
        canvas.drawLine(0, 30, ancho, 30, pincel1);
        pincel1.setStrokeWidth(4);
        canvas.drawLine(0, 60, ancho, 60, pincel1);
        /*pintar un rectangulo*/
        canvas.drawRect(10,200,ancho-10,220,pincel1);
        pincel1.setStyle(Paint.Style.STROKE);
        canvas.drawRect(10,150,ancho-10,190,pincel1);
        pincel1.setStrokeWidth(3);
        canvas.drawRect(10,110,ancho-10,140,pincel1);
        /*dibujar circulo*/
        pincel1.setARGB(255, 255, 0, 0);
        pincel1.setStyle(Paint.Style.STROKE);
        for (int f = 0; f < 10; f++) {
            canvas.drawCircle(ancho / 2, alto / 2, f * 15, pincel1);
        }
        /*dibujar ovalos*/
        pincel1.setARGB(255, 0, 0, 0);
        pincel1.setStrokeWidth(5);
        pincel1.setStyle(Paint.Style.STROKE);
        RectF rectangulo1 = new RectF(0, 0, ancho, alto);
        canvas.drawOval(rectangulo1, pincel1);

        int menor;
        if (ancho < alto)
            menor = ancho;
        else
            menor = alto;

        canvas.drawCircle(ancho / 2, alto / 2, menor / 2, pincel1);

    }
}
