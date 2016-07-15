package miguel.museos.view.middleFragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import miguel.museos.R;
import miguel.museos.data.Museum;
import miguel.museos.view.MainActivity;
import miguel.museos.view.adapters.Museum_adapter;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class MiddleMuseumsFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public MiddleMuseumsFragment() {
        // Required empty public constructor
    }
    public static  MiddleMuseumsFragment newInstance(){
        MiddleMuseumsFragment fragment = new MiddleMuseumsFragment();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_middle_museums_fragmetn, container, false);

        vibrator= (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);


        listView = (ListView) view.findViewById(R.id.museums_listView);
        listView.setSmoothScrollbarEnabled(true);
        mainActivity= MainActivity.getInstance();
        itemAdapter = new Museum_adapter(view.getContext(),mainActivity.getMuseumList());
        listView.setAdapter(itemAdapter);
        listView.setDividerHeight(2);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mListener.onMuseumCLick((Museum) itemAdapter.getItem(position));
                vibrator.vibrate(100);
            }
        });





        return view;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {


        public void onMuseumCLick(Museum item);


        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

    private static void comunication(String c) {
        Log.d("console_MMFragment", c);
    }

    private SearchView searchView;
    private MainActivity mainActivity;
    private ListView listView;
    private ArrayAdapter itemAdapter;
    private Vibrator vibrator;

}
