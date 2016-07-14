package miguel.museos.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

import miguel.museos.R;
import miguel.museos.data.Passport;

/**
 * Created by miguel on 12/07/16.
 */
public class Passport_adapter extends ArrayAdapter {


    private Context context;
    private ArrayList<Passport> newsList;

    public Passport_adapter(Context context, ArrayList<Passport> newsList) {
        super(context, R.layout.item_passport_adapter, newsList);
        this.newsList = newsList;
        this.context = context;

    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.item_passport_adapter, null);






        return  item;
    }

    Button scanner;
}
