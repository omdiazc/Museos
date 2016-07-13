package miguel.museos.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentContainer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import miguel.museos.R;
import miguel.museos.data.Data;
import miguel.museos.data.Museum;
import miguel.museos.data.News;
import miguel.museos.data.Passport;
import miguel.museos.enums.Enum_tabs;
import miguel.museos.view.middleFragments.MiddleMuseumsFragment;
import miguel.museos.view.middleFragments.MiddleNewsFragment;
import miguel.museos.view.middleFragments.MiddlePassportFragment;

public class MainActivity extends AppCompatActivity implements TopFragment.OnFragmentInteractionListener,
        MiddlePassportFragment.OnFragmentInteractionListener, MiddleNewsFragment.OnFragmentInteractionListener,
        MiddleMuseumsFragment.OnFragmentInteractionListener
{


    public ArrayList<Museum> getMuseumList(){
        return  data.getMuseumList();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ourInstance= this;
        data = Data.getInstance();


        topFragment = new TopFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.topframeLayout,topFragment).commit();
        changeTab(Enum_tabs.NEWS);






    }


    public static MainActivity getInstance(){
        return ourInstance;
    }

    private static MainActivity ourInstance;

    @Override
    public void changeTab(Enum_tabs tab) {
        switch (tab) {
            case NEWS:
                news = new MiddleNewsFragment();
                layout = (FrameLayout) findViewById(R.id.middleFragmentLayout);
                layout.removeAllViewsInLayout();

                getSupportFragmentManager().beginTransaction().add(R.id.middleFragmentLayout,news).commit();
                break;
            case MUSEUMS:

                layout = (FrameLayout) findViewById(R.id.middleFragmentLayout);
                layout.removeAllViewsInLayout();
                museums= new MiddleMuseumsFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.middleFragmentLayout,museums).commit();

                break;
            case PASSPORT:

                layout = (FrameLayout) findViewById(R.id.middleFragmentLayout);
                layout.removeAllViewsInLayout();
                    passport = new MiddlePassportFragment();
//                getSupportFragmentManager().beginTransaction().hide(news);
                getSupportFragmentManager().beginTransaction().replace(R.id.middleFragmentLayout,passport).commit();

                break;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private static void comunication(String c) {
        Log.d("console_MainActivity", c);
    }

    private FrameLayout layout;
    private TopFragment topFragment;
    private Fragment news=null,museums=null,passport=null;
    private Fragment middle;
    private static Data data;


    public ArrayList<News> getNewsList() {
        return data.getNewsList();
    }


    public ArrayList<Passport> getPassportList() {
        return data.getPassportList();
    }
}
