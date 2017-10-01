package freddy.parkingapp.Welcome;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import freddy.parkingapp.BaseFragment;
import freddy.parkingapp.R;

/**
 * Created by Freddy on 30/09/2017.
 * email : freddy.lazo@pucp.pe
 */

public class SliderFragment extends BaseFragment {

    @BindView(R.id.slider_pager)
    ViewPager sliderPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.slider_fragment_layout, container, false);
        ButterKnife.bind(this, v);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}
