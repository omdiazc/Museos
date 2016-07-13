package miguel.museos.view.middleFragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import miguel.museos.R;
import miguel.museos.view.MainActivity;

import miguel.museos.view.adapters.News_adapter;


public class MiddleNewsFragment extends Fragment {


    private OnFragmentInteractionListener mListener;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_middle_news, container, false);
        listView = (ListView) view.findViewById(R.id.listView_news);
        listView.setSmoothScrollbarEnabled(true);
        mainActivity= MainActivity.getInstance();
        itemAdapter = new News_adapter(view.getContext(),mainActivity.getNewsList());
        listView.setAdapter(itemAdapter);
        listView.setDividerHeight(2);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                comunication(String.valueOf(position));
//                TODO IMPLEMENTAR EL CLICK
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

  
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }
    private MainActivity mainActivity;
    private ListView listView;
    private ArrayAdapter itemAdapter;

}
