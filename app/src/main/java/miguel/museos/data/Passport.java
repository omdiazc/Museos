package miguel.museos.data;

/**
 * Created by miguel on 12/07/16.
 */
public class Passport {

    private Museum museum;
    private Boolean check;

    public Passport(Museum museum) {
        this.museum = museum;
        this.check= false;
    }


    public void setCheck(Boolean check) {
        this.check = check;
    }

    public Museum getMuseum() {

        return museum;
    }

    public Boolean getCheck() {
        return check;
    }
}
