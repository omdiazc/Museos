package miguel.museos.view.middleFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import miguel.museos.R;
import miguel.museos.data.Museum;


/**
 * Created by miguel on 14/07/16.
 */
public class MiddleMuseumViewFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view =inflater.inflate(R.layout.fragment_museum_view, container , false);



        return view;

    }



    private Museum museum;


}
