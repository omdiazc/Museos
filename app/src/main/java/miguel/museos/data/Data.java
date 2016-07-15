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
//        museumList.add(new Museum("Museo Nacional", "33333333", "longitude",
//                "latitude", "address1", "descripcion","horario", R.drawable.museo_nacional,R.drawable.logo_museo_nacional));
//        museumList.add(new Museum("Museo del Oro", "33333333", "longitude",
//                "latitude", "address1", "descripcion","horario", R.drawable.museo_del_oro,R.drawable.logo_museo_del_oro));
//        museumList.add(new Museum("Planetario de Bogota", "33333333", "longitude",
//                "latitude", "address1","descripcion","horario",R.drawable.planetario_de_bogota,R.drawable.logo_planetario_de_bogota));
//        museumList.add(new Museum("Museo de Arte moderno", "33333333", "longitude",
//                "latitude", "address1", "descripcion","horario",R.drawable.museo_mambo,R.drawable.logo_mambo));
//        museumList.add(new Museum("Casa museo Gaitan", "33333333", "longitude",
//                "latitude", "address1", "descripcion","horario",R.drawable.casa_museo_gaitan,R.drawable.logo_gaitan));
//        museumList.add(new Museum("Museo de historia natural UN", "33333333", "longitude",
//                "latitude", "address1", "descripcion","horario",R.drawable.museo_de_historia_natura,R.drawable.logo_museo_de_historia_natural));
//        museumList.add(new Museum("Casa de la Moneda de Colombia", "33333333", "longitude",
//                "latitude", "address1", "descripcion","horario",R.drawable.casa_de_la_moneda,R.drawable.logo_casa_de_la_moneda));
//        museumList.add(new Museum("Museo Historico de la Policia Nacional", "33333333", "longitude",
//                "latitude", "address1",  "descripcioR.drawablen","horario",R.drawable.museo_policia_nacional,R.drawable.logo_policia_nacional));
//
//        newsList.add(new News(museumList.get(1), "nueva exposicion sobre la vida en el atlantico", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 26, 06, 2011,R.drawable.new_1));
//        newsList.add(new News(museumList.get(5), "nueva exposicion sobre la universidad nacional", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 2, 02, 2010,R.drawable.new_2));
//        newsList.add(new News(museumList.get(3), "nueva exposicion sobre la vida en el atlantico", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 22, 06, 2015,R.drawable.new_3));
//        newsList.add(new News(museumList.get(3), "nueva exposicion sobre la vida en el atlantico", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 6, 8, 2015,R.drawable.new_4));
//        newsList.add(new News(museumList.get(3), "nueva exposicion sobre la vida en el atlantico", "Los pobladores prehispánicos del departamento fueron los descendientes de dos grandes familias: los caribes y los arawak.6 La tribu más sobresaliente fue la Mocaná, que se distribuyó por zonas y, según los lugares que ocuparon, bautizaron así las regiones, muchas de las cuales aún conservan su nombre, como son Tubará, Usiacurí, Piojó, Galapa, Malambo y Baranoa, entre otras. Los asentamientos indígenas en el departamento se ubicaron en su mitad septentrional con epicentros en los municipios ya mencionados y en Suan, en el extremo sur, asentamiento ya extinguido.", 6, 8, 2016,R.drawable.new_5));
//
        museumList.add(new Museum("Museo Nacional", "3816470", "4.615524", "-74.068308", "‎Carrera 7 #28-66", "El Museo Nacional de Colombia es el museo más antiguo de Colombia. Su acervo se divide en cuatro colecciones: arte, historia, arqueología y etnografía. Su colección de arte colombiano, latinoamericano y europeo incluye pinturas, dibujos, grabados, esculturas, instalaciones y artes decorativas desde el período colonial hasta la actualidad. Su inmueble fue originalmente la penitenciaría del panoptico, siendo su arquitecto el danés Thomas Reed. Frente al museo se encuentra la estación subterránea de TransMilenio que lleva su mismo nombre Museo Nacional.","Martes: 10:00 a.m. a 8:00 p.m.; miércoles a sábado: 10:00 a.m. a 6:00 p.m.; domingos: 10:00 a.m. a 4:00 p.m.", R.drawable.museo_nacional,R.drawable.logo_museo_nacional));
        museumList.add(new Museum("Museo del Oro", "3432222", "4.601882", "-74.072040", "Carrera 6 #15-88", "El Museo del Oro del Banco de la República de Colombia es una institución abierta al público cuya finalidad es la adquisición, conservación y exposición de piezas de orfebrería y alfarería de culturas indígenas del periodo precolombino de la actual Colombia. Está ubicado en la esquina de la calle 16 con carrera 5ª, en el costado oriental del parque Santander, en el centro histórico de Bogotá. Posee la colección de orfebrería prehispánica más grande del mundo con aproximadamente treinta y cuatro mil piezas de oro y tumbaga,1 cerca de veinticinco mil objetos en cerámica, piedra, concha, hueso y textiles. Expone piezas de diferentes culturas indígenas asentadas en la actual Colombia antes de la llegada de los europeos, entre las que destacan la Calima, los muiscas, la Nariño, la quimbaya, la sinú, la tairona, la San Agustín, la Tierradentro, la Tolima, entre otras cosas.","Martes a Sábado: 9:00 a.m. a 4:30 p.m.; domingos y festivos: 10:00 a.m. a 4:30 p.m. Lunes, incluidos festivos, no hay servicio.", R.drawable.museo_del_oro,R.drawable.logo_museo_del_oro));
        museumList.add(new Museum("Planetario de Bogota", "2814150", "4.612106", "-74.068856", "Calle 26 #5-93","El Planetario de Bogotá es un centro cultural y planetario ubicado en el Centro Internacional de Bogotá en Colombia, dentro del Parque de la Independencia.","Martes a Domingo y festivos de 10:00 a.m. a 5:00 p.m. Lunes cerrado", R.drawable.planetario_de_bogota,R.drawable.logo_planetario_de_bogota));
        museumList.add(new Museum("Museo de Arte moderno", "2860466", "4.610145", "-74.069265", "Calle 24 # 6 - 00", "El Museo de Arte Moderno de Bogotá, Colombia también conocido como MAMBO fue fundado en 1953 por la crítica de arte de origen argentino Marta Traba y refundado por ella misma en 1957. Éste ha tenido diferentes sedes. La actual, diseñada por el arquitecto Rogelio Salmona, está ubicada en el centro de la ciudad desde 1985 y cuenta con 5000 metros cuadrados de amplitud distribuidos en cuatro pisos. Desde 1969 el museo estuvo bajo la dirección de Gloria Zea, quien dejó el cargo en marzo de 2016 dejando en reemplazo a Claudia Hakim, hasta entonces directora del espacio cultural y educativo NC-arte.","Martes a sábado: 10:00 a.m. a 7:00 p.m.; domingos: 12:00 m. a 5:00 p.m.", R.drawable.museo_mambo,R.drawable.logo_mambo));
        museumList.add(new Museum("Casa museo Gaitan", "2450368", "4.631060", "-74.069101", "Cl. 42 #15-52", "La Casa Museo Jorge Eliécer Gaitán, es la casa que habitó Jorge Eliécer Gaitán Ayala desde el 22 de diciembre de 1933 hasta el día de su asesinato el 9 de abril de 1948. Está ubicada en la calle 42 número 15 - 52 del barrio Santa Teresita cerca al centro de Bogotá y hace parte del trazado que la firma “Dávila Holguín & Lievano” proyectó en 1928 para este sector. Fue consagrada como Bien de Interés Cultural de Caracter Nacional por el Decreto 1265 de 1948 y actualmente hace parte del Sistema de Patrimonio y Museos de la Universidad Nacional de Colombia.","Martes a viernes 10:00 a.m a 4:00 p.m. Sábados y domingos 10:00 a.m a 2:00 p.m", R.drawable.casa_museo_gaitan,R.drawable.logo_gaitan));
        museumList.add(new Museum("Museo de historia natural UN", "316 5000 Ext. 11535", "4.641179", "-74.081902", "Cra 30 No 45-03. Edificio 425", "El Museo de Historia Natural adscrito a la Facultad de Ciencias de la Universidad Nacional de Colombia, sede Bogotá es un escenario de aprendizaje y de interacción con el conocimiento científico, en el que se aprende acerca de la evolución de los organismos, la adaptación natural, la diversidad biológica y cultural colombiana y la conservación de las especies y los ecosistemas.","Lunes a viernes: 8:00 a.m. a 12:00 m y 2:00 p.m. a 5:00 p.m. Sábados: 9:00 a.m. a 12:00 m. ", R.drawable.museo_de_historia_natura,R.drawable.logo_museo_de_historia_natural));
        museumList.add(new Museum("Casa de la Moneda de Colombia", "3431331", "4.597060", "-74.073528", "Calle 11 # 4-93", "La Colección Numismática del Banco de la República se abrió al público en diciembre de 1996 en el claustro colonial de la Casa de Moneda de Bogotá, lugar en donde se acuñaron las primeras monedas de oro en América en 1622. A través de sus salas se hace un recorrido por la historia de Colombia, resaltando hechos relevantes de la vida nacional, la historia del inmueble y los procesos inherentes a la producción de monedas y billetes insertos en el contexto histórico en que circularon. La exposición busca despertar el interés del público, creando una exhibición moderna y didáctica, ilustrada con gráficas y objetos que muestran los procesos técnicos utilizados en la producción de monedas y billetes, y así mismo permiten visualizar los cambios arquitectónicos que tuvo la Casa hasta finalizar el siglo XX.", "Lunes a sábado: 9:00 a.m. a 7:00 p.m. Último ingreso a las 6:30 p.m. Martes cerrado Domingos y festivos: 10:00 a.m. a 5:00 p.m. Último ingreso a las 4:30 p.m.", R.drawable.casa_de_la_moneda,R.drawable.logo_casa_de_la_moneda));
        museumList.add(new Museum("Museo Historico de la Policia Nacional", "2430840", "4.597705", "-74.078402", "Calle 9 #9-27",  "El Museo Histórico de la Policía Nacional es una institución pública de la Policía Nacional de Colombia. Su sede se situada en la localidad de La Candelaria en Bogotá (Colombia). Este museo tiene como finalidad la exposición y apreciación de la historia y la evolución de la Policía Nacional en el país, encontrando información sobre leyes y estatutos, así como también registros de las formas de castigo impuestas tiempo atrás para mantener la seguridad de los ciudadanos. En él se encuentran objetos como armas y uniformes que fueron utilizados por las fuerzas de protección nacional al transcurso del tiempo. En este museo también se pueden apreciar diferentes exposiciones de sucesos y actos criminales que han marcado la historia del país.", "Horario: Lunes a viernes: 8:00 a.m. a 12:00 m. 1:00 a 5:00 p.m. sábados: 8:00 a.m. a 2:00 p.m.", R.drawable.museo_policia_nacional,R.drawable.logo_policia_nacional));


        newsList.add(new News(museumList.get(1), "Exposicion: El trabajo de los metales. Museo del Oro", "En la sala El trabajo de los metales se descubren los procesos de minería, beneficio y trabajo del metal que están detrás de todos y cada uno de los objetos de metal del Museo del Oro.\n\n" +
                "El orfebre, pero también el minero, transformaron los materiales que les brindaba la naturaleza para crear estas obras de arte intemporal que los hacen dignos de admiración. También entre sus antiguas comunidades fueron considerados sabios y, en ocasiones, chamanes.", 26, 06, 2011,R.drawable.news_metales));
        newsList.add(new News(museumList.get(4), "Flujos Deseantes en la Universidad Nacional", "Esta exposición del artista colombiano Juan Fernando Herrán es una revisión de su obra entre 1987 y 1993. \n\n Se trata de la época más temprana de su trabajo, caracterizada por la experimentación e intuición en la transformación de materiales tan disímiles como el pelo humano, el plomo, el material vegetal, la fotografía, el estiércol, la arcilla y el video.", 2, 02, 2010,R.drawable.news_flujos_deseantes));
        newsList.add(new News(museumList.get(5), "Reptiles en la Universidad Nacional", "Incluye el montaje de un esqueleto de más de 3,20 metros de longitud, correspondiente a una de las especies más grandes del mundo: Cocodrilus intermedius, en peligro de extinción. \n\nTambién se exhiben ejemplares en taxidermia de tortugas, serpientes, iguanas, cocodrilos y babillas; y el montaje de un esqueleto completo de una Anaconda (Eunectes sp.)", 22, 06, 2015,R.drawable.news_reptiles));
        newsList.add(new News(museumList.get(3), "De sangre y plomo", "Cada una de las líneas que éste oaxaqueño dibuja, denotan una amplísima cosmovisión de aquellos lugares en donde creció. Los dibujos realizados son el resultado de la absorción de culturas e imágenes de cada territorio donde residió.  \n\n" +
                                                    "Hernández, tan lleno de historias, de imágenes, de recuerdos y de una arraigada manera de mostrar lo místico, poco a poco ha logrado renombre en la cultura mexicana como uno de los artistas aztecas vivos más importantes en la actualidad logrando acaparar la atención de la más exigente crítica, como también de historiadores, narradores y poetas.", 6, 8, 2015,R.drawable.news_de_sangre_y_plomo));
        newsList.add(new News(museumList.get(2), "Proyecciones en el cine domo", "En la ronda de show de luces láser con las bandas más emblemáticas del rock, no podía faltar Pink Floyd.\n" +
                "\n" +
                "El Planetario se prepara para repetir su proyección de luces con lo mejor de la música de Pink Floyd (aunque no salgan cerdos volando).\n" +
                "\n" +
                "Si no vio a Roger Waters en Bogotá, esta es otra manera de disfrutar del lado oscuro de la luna, uno de los discos más vendidos de la historia y joyas del rock.", 6, 8, 2016,R.drawable.news_cine_domos));


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
