package lib.homhomlib.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;

/**
 * Created by Linhh on 16/4/20.
 */
public final class CrushAnimation {

    private CrushAnimation(){}

    public static void crushView(View view){
        view.setTranslationX(50);
        view.setTranslationX(-100);
        view.setTranslationX(100);
        view.setTranslationX(-100);
        view.setTranslationX(100);
        view.setTranslationX(-100);


//        animator.setDuration(3000);
//        animator.setRepeatMode(ValueAnimator.REVERSE);
//        animator.start();
    }

    private static Bitmap convertViewToBitmap(View view){
        Bitmap bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmap));
        return bitmap;
    }
}
