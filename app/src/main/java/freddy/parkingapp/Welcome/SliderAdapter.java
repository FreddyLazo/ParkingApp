package freddy.parkingapp.welcome;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        return 1;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.welcome_slider_raw, container,false);
        ImageView imageSlider = (ImageView) v.findViewById(R.id.image_slider);
        TextView textSlider = (TextView) v.findViewById(R.id.text_slider);
        container.addView(v);

        switch (position){
            case 0:
                imageSlider.setImageResource(R.drawable.image_parking);
                textSlider.setText(R.string.app_name);
        }
        return v;
    }

}
