package miguel.museos.data;

/**
 * Created by miguel on 11/07/16.
 */
public class Museum implements Comparable<Museum>{

    private String name;
    private String id;
    private String telephone;
    private String longitude;
    private String latitude;
    private String address1;
    private String address2;
    private String address3;
    private String description;


    public Museum(String name, String telephone, String longitude, String latitude, String address1, String address2, String address3, String description) {
        this.name = name;
        this.telephone = telephone;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getAddress3() {
        return address3;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Museum another) {

        return name.compareTo(another.getName());

    }
}
