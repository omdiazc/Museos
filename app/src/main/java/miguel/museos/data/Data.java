package miguel.museos.data;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.Collections;

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
        museumList.add(new Museum("1", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("2", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("3", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("4", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("5", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("6", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("7", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("8", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("9", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("10", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("11", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("12", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("13", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));
        museumList.add(new Museum("14", "33333333", "longitude", "latitude", "address1", "address2", "address3", "descripcion"));

        newsList.add(new News(museumList.get(3), "nueva exposicion sobre la vida en el atlantico", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 26, 06, 2011));
        newsList.add(new News(museumList.get(3), "nueva exposicion sobre la universidad nacional", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 2, 02, 2010));
        newsList.add(new News(museumList.get(3), "nueva exposicion sobre la vida en el atlantico", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 22, 06, 2015));
        newsList.add(new News(museumList.get(3), "nueva exposicion sobre la vida en el atlantico", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 6, 8, 2015));

        for(int i =0; i<museumList.size();i++){
            passportList.add(new Passport(museumList.get(i)));
        }

        Collections.sort(newsList);


    }

    public ArrayList<News> getNewsList() {
        return newsList;
    }

    public void loadData(Context context) {


        RequestQueue queue = Volley.newRequestQueue(context);

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        process(response);
//                        comunication("Response is: "+ response.substring(0,500));

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                comunication("That didn't work!");
            }
        });
        queue.add(stringRequest);


    }

    public void process(String string) {
        String[] properties = {"Id", "Nombre", "Telefono", "Latitud", "Longitud",
                "Direccion1", "Direccion2", "Direccion3", "Descripcion"};


        int cantidad;
        // Cantidad
        int index = 0;

        while (':' != string.charAt(index))
            index++;

        index += 2;

        int indexTemp = index;
        while (',' != string.charAt(indexTemp))
            indexTemp++;

        cantidad = Integer.parseInt(string.substring(index, indexTemp));


        index = indexTemp = 0;
        // Procesamiento de datos
        string = string.substring(string.indexOf('['));
        String stringM[] = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            stringM[i] = string.substring(string.indexOf('{'), string.indexOf('}'));
            string = string.substring(string.indexOf('}') + 1);
        }

        ArrayList<Museum> array = new ArrayList<Museum>();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Museo " + (i + 1));
            String[] pMuseum = new String[properties.length];

            for (int j = 0; j < properties.length; j++) {
                // System.out.println( "Propiedad " + ( j + 1 ) ) ;

                String property = properties[j];
                index = stringM[i].indexOf(property) + property.length() + 1;

                while ('\"' != stringM[i].charAt(index)) {
                    // System.out.println( stringM[i].charAt( index ) ) ;
                    index++;
                }
                index++;

                if (properties.length - 1 != j) {
                    indexTemp = index + stringM[i].substring(index).indexOf("\"");
                    pMuseum[j] = stringM[i].substring(index, indexTemp);
                } else {
                    pMuseum[j] = stringM[i].substring(index, stringM[i].lastIndexOf('\"'));
                }

                stringM[i] = stringM[i].substring(indexTemp + 1);
            }

		    /*
		    for ( int j = 0 ; j < pMuseum.length ; j++ )
		    	System.out.println( pMuseum[j] ) ;
		    */

            Museum museum = new Museum(pMuseum[1], pMuseum[2], pMuseum[3], pMuseum[4],
                    pMuseum[5], pMuseum[6], pMuseum[7], pMuseum[8]);

            museum.setId(pMuseum[0]);
            array.add(museum);
        }
        museumList = array;
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

    public void checkMuseum(String text) {
        for(int i =0; i<passportList.size();i++){
            if(text==passportList.get(i).getMuseum().getName()){
                if(!passportList.get(i).getCheck()){
                    passportList.get(i).setCheck(true);
                    break;
                }
            }
        }

    }
}
