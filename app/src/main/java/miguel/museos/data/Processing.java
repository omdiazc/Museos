package miguel.museos.data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by miguel on 12/07/16.
 */
public class Processing {
//    static String[] properties = { "Id" , "Nombre" , "Telefono" , "Latitud" , "Longitud" ,
//            "Direccion1" , "Direccion2" , "Direccion3" , "Descripcion" } ;

    public Processing(String data ) {
        process( data ) ;
    }


    public void process(String string ){
        String[] properties = { "Id" , "Nombre" , "Telefono" , "Latitud" , "Longitud" ,
                "Direccion1" , "Direccion2" , "Direccion3" , "Descripcion" } ;

        System.out.println( "Procesando cadena" ) ;
        int cantidad ;
        // Cantidad
        System.out.println( "Calculando cantidad" ) ;
        int index = 0 ;

        while ( ':' != string.charAt( index ) )
            index++ ;

        index += 2 ;

        int indexTemp = index ;
        while ( ',' != string.charAt( indexTemp ) )
            indexTemp++ ;

        cantidad = Integer.parseInt( string.substring( index , indexTemp ) ) ;
        System.out.println( "Cantidad Calculada" ) ;

        index = indexTemp = 0 ;
        // Procesamiento de datos
        string = string.substring( string.indexOf( '[' ) ) ;
        String stringM[] = new String[cantidad] ;
        for ( int i = 0 ; i < cantidad ; i++ ) {
            stringM[i] = string.substring( string.indexOf('{') , string.indexOf('}') ) ;
            string = string.substring( string.indexOf('}') + 1 ) ;
        }

        ArrayList<Museum> array = new ArrayList<Museum>() ;

        for ( int i = 0 ; i < cantidad ; i++ ){
            System.out.println( "Museo " + ( i + 1 ) ) ;
            String[] pMuseum = new String[properties.length];

            for ( int j = 0 ; j < properties.length ; j++ ) {
                // System.out.println( "Propiedad " + ( j + 1 ) ) ;

                String property = properties[j] ;
                index = stringM[i].indexOf( property ) + property.length() + 1 ;

                while ( '\"' != stringM[i].charAt( index ) ) {
                    // System.out.println( stringM[i].charAt( index ) ) ;
                    index++ ;
                }
                index++ ;

                if ( properties.length - 1 != j ) {
                    indexTemp = index + stringM[i].substring( index ).indexOf( "\"" ) ;
                    pMuseum[j] = stringM[i].substring( index , indexTemp ) ;
                } else {
                    pMuseum[j] = stringM[i].substring( index , stringM[i].lastIndexOf( '\"' ) ) ;
                }

                stringM[i] = stringM[i].substring( indexTemp + 1 ) ;
            }

		    /*
		    for ( int j = 0 ; j < pMuseum.length ; j++ )
		    	System.out.println( pMuseum[j] ) ;
		    */

            Museum museum = new Museum( pMuseum[1] , pMuseum[2] , pMuseum[3] , pMuseum[4] ,
                    pMuseum[5] , pMuseum[6] , pMuseum[7] , pMuseum[8] ) ;

            museum.setId( pMuseum[0] );
            array.add( museum ) ;
        }


    }
}