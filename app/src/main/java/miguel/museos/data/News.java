package miguel.museos.data;

/**
 * Created by miguel on 12/07/16.
 */
public class News implements Comparable<News>{
    private Museum museum;
    String summary,notice;
    int day, month, year;

    public News(Museum museum, String summary, String notice, int day, int month, int year) {
        this.museum = museum;
        this.summary = summary;
        this.notice = notice;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Museum getMuseum() {
        return museum;
    }

    public String getSummary() {
        return summary;
    }

    public String getNotice() {
        return notice;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDate(){
        return String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year);
    }

    @Override
    public int compareTo(News another) {

        if(year==another.getYear() ){
            if(month== another.getMonth()){

                if(day == another.getDay()){
                    return museum.compareTo(another.museum);
                }
                return (day>another.day)?-1:1;
            }
            else{
                return (month>another.month)?-1:1;
            }

                    }
        else{
            return (year>another.year)?-1:1;
        }


    }
}
