package miguel.museos.view.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import miguel.museos.R;
import miguel.museos.data.Museum;

/**
 * Created by miguel on 12/07/16.
 */
public class Museum_adapter extends ArrayAdapter<Museum> {


    public Museum_adapter(Context context, ArrayList<Museum> museumList) {
        super(context, R.layout.item_museum_adapter, museumList);
        this.context= context;
        this.museumList= museumList;

        if(museumList==null){
            comunication("error");
        }

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.item_museum_adapter, null);

        name = (TextView) item.findViewById(R.id.textView_name);

        name.setText(museumList.get(position).getName());


        return item;
    }

    @Override
    public Museum getItem(int position) {
        return museumList.get(position);
    }

    private static void comunication(String c) {
        Log.d("console_MuseumAdapter", c);
    }


    TextView name;
    Context context;
    ArrayList<Museum> museumList;
}
