package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main ( String[] args ) {


        DHManager unDh = new DHManager();
        List <Inscripcion> listainscriptos = new ArrayList <>();
        unDh.setListaInscripciones( listainscriptos );

        unDh.inscribirAlumnosAndroid( 21, 25 );

        System.out.println( " " );
        System.out.println( "========================== ++  cupo 25/ no supera cupo / se inscriben todos. ++  ========================================================= " );
        System.out.println( " " );
        System.out.println( " " );
        System.out.println( " " );

        unDh.inscribirAlumnosAndroid( 21, 15 );

        System.out.println( " " );
        System.out.println( "========================== ++  cupo 15/  supera cupo /  no se inscriben todos. ++  ========================================================= " );
        System.out.println( " " );
    }
}
