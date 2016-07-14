package miguel.museos.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import miguel.museos.R;
import miguel.museos.enums.Enum_tabs;

public class TopFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_top, container, false);
        tabHost = (TabHost) view.findViewById(R.id.MainMenuBar_tabHost);
        tabHost.setup();

        for (Enum_tabs tab : Enum_tabs.values()) {
            addTab(tab);
        }
        return view;
    }


    private void addTab(final Enum_tabs name){
        TabHost.TabSpec ts = tabHost.newTabSpec(name.toString());
        ts.setIndicator(name.toString(getContext()));
        ts.setContent(R.id.MainMenuBar_linearLayout);
        tabHost.addTab(ts);

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                comunication(tabHost.getCurrentTabTag());
                mListener.changeTab(Enum_tabs.valueOf(tabHost.getCurrentTabTag()));
            }
        });
//        tabHost.getTabWidget().getChildTabViewAt(count).setBackground(geticon(count));
//        tabHost.getTabWidget().getChildTabViewAt(count).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(tab!=name){
//                    tab= name;;
//
//
//                    mListener.changeTab(tab);
//                }
//
//            }
//        });
        count++;
    }


    public void setTab(Enum_tabs tab, Context context){
        tabHost.setCurrentTabByTag(tab.toString(context));
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    public interface OnFragmentInteractionListener {

        void changeTab(Enum_tabs tab);

        public void onFragmentInteraction(Uri uri);
    }

    public Enum_tabs getTab() {
        return tab;
    }

    private static void comunication(String c) {
        Log.d("console_TopFragment", c);
    }
    private OnFragmentInteractionListener mListener;
    private Enum_tabs tab;
    private TabHost tabHost;
    private int count;
}
