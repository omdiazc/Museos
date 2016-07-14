package miguel.museos.data;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;

import miguel.museos.R;

/**
 * Created by miguel on 12/07/16.
 */
public class Data {
    private static Data ourInstance = new Data();


    public static Data getInstance() {
        return ourInstance;
    }

    private Data() {
        museumList = new ArrayList<>();
        newsList = new ArrayList<>();
        passportList= new ArrayList<>();
        museumList.add(new Museum("Museo Nacional", "33333333", "longitude",
                "latitude", "address1", "descripcion","horario", R.drawable.museo_nacional,R.drawable.logo_museo_nacional));
        museumList.add(new Museum("Museo del Oro", "33333333", "longitude",
                "latitude", "address1", "descripcion","horario", R.drawable.museo_del_oro,R.drawable.logo_museo_del_oro));
        museumList.add(new Museum("Planetario de Bogota", "33333333", "longitude",
                "latitude", "address1","descripcion","horario",R.drawable.planetario_de_bogota,R.drawable.logo_planetario_de_bogota));
        museumList.add(new Museum("Museo de Arte moderno", "33333333", "longitude",
                "latitude", "address1", "descripcion","horario",R.drawable.museo_mambo,R.drawable.logo_mambo));
        museumList.add(new Museum("Casa museo Gaitan", "33333333", "longitude",
                "latitude", "address1", "descripcion","horario",R.drawable.casa_museo_gaitan,R.drawable.logo_gaitan));
        museumList.add(new Museum("Museo de historia natural UN", "33333333", "longitude",
                "latitude", "address1", "descripcion","horario",R.drawable.museo_de_historia_natura,R.drawable.logo_museo_de_historia_natural));
        museumList.add(new Museum("Casa de la Moneda de Colombia", "33333333", "longitude",
                "latitude", "address1", "descripcion","horario",R.drawable.casa_de_la_moneda,R.drawable.logo_casa_de_la_moneda));
        museumList.add(new Museum("Museo Historico de la Policia Nacional", "33333333", "longitude",
                "latitude", "address1",  "descripcioR.drawablen","horario",R.drawable.museo_policia_nacional,R.drawable.logo_policia_nacional));

        newsList.add(new News(museumList.get(1), "nueva exposicion sobre la vida en el atlantico", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 26, 06, 2011,R.drawable.new_1));
        newsList.add(new News(museumList.get(5), "nueva exposicion sobre la universidad nacional", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 2, 02, 2010,R.drawable.new_2));
        newsList.add(new News(museumList.get(3), "nueva exposicion sobre la vida en el atlantico", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 22, 06, 2015,R.drawable.new_3));
        newsList.add(new News(museumList.get(3), "nueva exposicion sobre la vida en el atlantico", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 6, 8, 2015,R.drawable.new_4));
        newsList.add(new News(museumList.get(3), "nueva exposicion sobre la vida en el atlantico", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 6, 8, 2016,R.drawable.new_5));



        for(int i =0; i<museumList.size();i++){
            passportList.add(new Passport(museumList.get(i)));


        }

        Collections.sort(newsList);


    }

    public ArrayList<News> getNewsList() {
        return newsList;
    }

    private static void comunication(String c) {
        Log.d("console_Data", c);
    }


    public final String url = "http://museapi-museal.rhcloud.com/obtener_museos.php";

    public ArrayList<Passport> getPassportList() {
        return passportList;
    }

    public ArrayList<Museum> getMuseumList() {
        return museumList;
    }

    private ArrayList<Museum> museumList;
    private ArrayList<News> newsList;
    private ArrayList<Passport> passportList;

    public int checkMuseum(String text) {


        for(int i =0; i<passportList.size();i++){
            if(text.compareTo(passportList.get(i).getMuseum().getName())==0){
                if(!passportList.get(i).getCheck()){
                    passportList.get(i).setCheck(true);

                    return  0;

                }
                else {
                    return 1;
                }

            }
        }

        return -1;
    }
}
