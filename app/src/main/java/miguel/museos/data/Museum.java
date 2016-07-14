package miguel.museos.data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import miguel.museos.view.MainActivity;

/**
 * Created by miguel on 11/07/16.
 */
public class Museum implements Comparable<Museum>{

    private String name;
    private String telephone;

    private String address;
    private String description;
    private String longitude;
    private String latitude;
    private String schedule;
    private Bitmap image;
    private Bitmap passportImage;
    private int id;



    public Museum(String name, String telephone, String longitude, String latitude, String address1, String description, String schedule,int id,int passportID) {
        this.name = name;
        this.telephone = telephone;
        this.address = address1;
        this.description = description;
        this.latitude=latitude;
        this.longitude=longitude;
        this.schedule = schedule;
        this.id=id;

        image=BitmapFactory.decodeResource(MainActivity.getInstance().getResources(),id);
        passportImage=BitmapFactory.decodeResource(MainActivity.getInstance().getResources(),passportID);


    }


    public String getSchedule() {
        return schedule;
    }

    public Bitmap getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress1() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public Bitmap getPassportImage() {
        return passportImage;
    }

    @Override
    public int compareTo(Museum another) {

        return name.compareTo(another.getName());

    }

    public int getid() {
        return id;
    }
}
