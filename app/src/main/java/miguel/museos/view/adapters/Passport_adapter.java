package miguel.museos.view.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import miguel.museos.R;
import miguel.museos.data.Passport;

/**
 * Created by miguel on 12/07/16.
 */
public class Passport_adapter extends ArrayAdapter {


    private Context context;
    private ArrayList<Passport> passportList;

    public Passport_adapter(Context context, ArrayList<Passport> passportList) {
        super(context, R.layout.item_passport_adapter, passportList);
        this.passportList = passportList;
        this.context = context;

    }





    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.item_passport_adapter, null);

        image = (ImageView) item.findViewById(R.id.imageView_image);
        image.setImageBitmap(passportList.get(position).getMuseum().getPassportImage());
        name = (TextView) item.findViewById(R.id.textView_name);
        name.setText(passportList.get(position).getMuseum().getName());
        name.setTextColor(Color.BLACK);

        if(!passportList.get(position).getCheck()){
            name.setTextColor(Color.GRAY);
            image.setAlpha(127);

        }



        return  item;
    }

    private ImageView image;
    private TextView name;
}
