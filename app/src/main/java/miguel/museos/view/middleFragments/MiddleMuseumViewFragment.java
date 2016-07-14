package miguel.museos.view.middleFragments;

import android.net.Uri;
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

    private OnFragmentInteractionListener mListener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view =inflater.inflate(R.layout.fragment_museum_view, container , false);



        return view;

    }

    public void setMuseum(Museum museum) {
        this.museum = museum;
    }

    public interface OnFragmentInteractionListener {

        public void closeMuseumVIew();


        public void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }



    private Museum museum;


}
