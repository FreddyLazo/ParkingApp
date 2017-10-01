package freddy.parkingapp;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by Freddy on 30/09/2017.
 * email : freddy.lazo@pucp.pe
 */

public class BaseFragment extends Fragment {

    private Context ctx;
    private ProgressDialog mProgressDialog;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ctx = getActivity();
        mProgressDialog = new ProgressDialog(ctx);
    }
}
