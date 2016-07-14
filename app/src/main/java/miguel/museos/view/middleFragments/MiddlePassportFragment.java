package miguel.museos.view.middleFragments;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import miguel.museos.R;
import miguel.museos.view.MainActivity;
import miguel.museos.view.QrActivity;
import miguel.museos.view.adapters.Passport_adapter;

public class MiddlePassportFragment extends Fragment {

    private OnFragmentInteractionListener mListener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        view =inflater.inflate(R.layout.fragment_middle_passport, container, false);
        listView = (ListView) view.findViewById(R.id.listView_passport);
        listView.setSmoothScrollbarEnabled(true);
        mainActivity= MainActivity.getInstance();
        itemAdapter = new Passport_adapter(view.getContext(),mainActivity.getPassportList());
        listView.setAdapter(itemAdapter);
        listView.setDividerHeight(2);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                comunication(String.valueOf(position));
//                TODO IMPLEMENTAR EL CLICK
            }
        });
        scanner = (Button) view.findViewById(R.id.button_scanner);
        scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScanner();
            }
        });

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode== 12){
            listView.invalidateViews();
            comunication("hola");

        }


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

    public void openScanner(){
        startActivityForResult(new Intent(getActivity(), QrActivity.class), 12);

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

    private static void comunication(String c) {
        Log.d("console_PassportF.", c);
    }


    private View view;
    private Button scanner;
    private MainActivity mainActivity;
    private ListView listView;
    private ArrayAdapter itemAdapter;


}
