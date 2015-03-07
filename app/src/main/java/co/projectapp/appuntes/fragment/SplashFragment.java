package co.projectapp.appuntes.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import co.projectapp.appuntes.FragmentLoginFragment;
import co.projectapp.appuntes.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SplashFragment extends Fragment {


    public SplashFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }


    @Override
    public void onResume() {
        super.onResume();
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                // This method will be executed once the timer is over
                SplashFragment.this.getFragmentManager().beginTransaction()
                        .replace(R.id.container, new FragmentLoginFragment()).commit();
            }

        }, 2000);
    }


}
