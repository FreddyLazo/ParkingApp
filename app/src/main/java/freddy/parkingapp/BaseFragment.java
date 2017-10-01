package freddy.parkingapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Freddy on 30/09/2017.
 * email : freddy.lazo@pucp.pe
 */

public class BaseFragment extends Fragment {

    protected Context ctx;
    protected ProgressDialog mProgressDialog;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ctx = getActivity();
        mProgressDialog = new ProgressDialog(ctx);
    }
}
