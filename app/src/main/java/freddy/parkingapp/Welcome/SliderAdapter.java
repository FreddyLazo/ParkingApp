package freddy.parkingapp.welcome;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import freddy.parkingapp.R;

/**
 * Created by Freddy on 30/09/2017.
 * email : freddy.lazo@pucp.pe
 */

public class SliderAdapter extends PagerAdapter {

    private Context ctx;

    public SliderAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.welcome_slider_raw, container, false);
        ImageView imageSlider = (ImageView) v.findViewById(R.id.image_slider);
        TextView textSlider = (TextView) v.findViewById(R.id.text_slider);
        container.addView(v);

        switch (position) {
            case 0:
                imageSlider.setImageResource(R.drawable.image_parking);
                textSlider.setText(R.string.text_parking_safe);
                break;
            case 1:
                imageSlider.setImageResource(R.drawable.image_parking_1);
                textSlider.setText(R.string.text_parking_problem);
                break;
            case 2:
                imageSlider.setImageResource(R.drawable.image_parking_2);
                textSlider.setText(R.string.text_parking_problem_2);
                break;
        }
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
