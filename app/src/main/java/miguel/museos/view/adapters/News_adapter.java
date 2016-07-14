package miguel.museos.view.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import miguel.museos.R;
import miguel.museos.data.News;

/**
 * Created by miguel on 12/07/16.
 */
public class News_adapter extends ArrayAdapter {

    private Context context;
    private ArrayList<News> newsList;

    public News_adapter( Context context, ArrayList<News> newsList) {
        super(context, R.layout.item_news_adapter, newsList);
        this.context = context;
        this.newsList = newsList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.item_news_adapter, null);

        name = (TextView) item.findViewById(R.id.textView_name);
        summary= (TextView) item.findViewById(R.id.textView_summary);
        date= (TextView) item.findViewById(R.id.textView_date);

        name.setText(newsList.get(position).getMuseum().getName());
        summary.setText(newsList.get(position).getSummary());
        date.setText(newsList.get(position).getDate());


        image = (ImageView) item.findViewById(R.id.imageView_image);
        image.setImageBitmap(newsList.get(position).getImage());
        return item;
    }


    private static void comunication(String c) {
        Log.d("console_Datat", c);
    }

    TextView name,summary,date;
    ImageView image;
}
