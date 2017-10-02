package freddy.parkingapp.welcome;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import butterknife.ButterKnife;
import freddy.parkingapp.BaseActivity;
import freddy.parkingapp.R;

public class WelcomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        initSliderFragment();

    }

    private void initSliderFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        SliderFragment sliderFragment = (SliderFragment) fragmentManager.findFragmentByTag("welcomeSliderFragment");
        if(sliderFragment==null){
            FragmentTransaction ft = fragmentManager.beginTransaction();
            sliderFragment = new SliderFragment();
            ft.replace(R.id.fragment_container,sliderFragment);
            ft.addToBackStack("welcomeSliderFragment");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            ft.commit();
        }
    }
}
