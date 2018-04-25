package com.company;

import com.company.Profesores.Profesor;
import com.company.Profesores.ProfesorAdjunto;
import com.company.Profesores.ProfesorTitular;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main ( String[] args ) {

        //creo profesores, creo lista de profesores y le pongo profesores tiutulare y adjuntos" );

        //ProfesorTitular profesorTitularCarlos = new ProfesorTitular( "Carlos", "Rivas", 2020, "Programacion" );
        //ProfesorTitular profesorTitularDavid = new ProfesorTitular( "Daviv", "Estebes", 2021, "Programacion" );

        //ProfesorAdjunto profesorAdjuntoVictor = new ProfesorAdjunto( "Victor", "Sanchez", 2010, 10 );
        //ProfesorAdjunto profesorAdjuntoDaniel = new ProfesorAdjunto( "Daniel", "Miguens", 2011, 8 );
        System.out.println( " " );
        List <Profesor> listaProfes = new ArrayList <>();

        DHManager unDH = new DHManager();

        unDH.setListaProfesores( listaProfes );


        unDH.altaProfesorTitular( "Carlos", "Rivas", 2020, "Programacion" );
        unDH.altaProfesorTitular( "David", "Estebes", 2021, "Programacion" );
        unDH.altaProfesorAdjunto( "Victor", "Sanchez", 2010, 10 );
        unDH.altaProfesorAdjunto( "Daniel", "Miguens", 2011, 8 );

        System.out.println( " " );
        System.out.println( listaProfes );
        System.out.println( " " );
        System.out.println( "================================ ++ Profesores en lista ++ ==================================" );
        System.out.println( " " );


        //Curso cursoFullStack = new Curso( "FullStack", 20, 3 );
        //Curso cursoAndroid = new Curso( "Android", 21, 2 );
        //Curso cursoUX = new Curso( "UX Design", 22, 5 );

        List <Curso> listaCursos = new ArrayList <>();
        unDH.setListaCursos( listaCursos );
        System.out.println( " " );

        unDH.altaCurso( "FullStack", 20, 3 );
        unDH.altaCurso( "Android", 21, 2 );

        System.out.println( " " );
        System.out.println( listaCursos );
        System.out.println( " " );
        System.out.println( "================================ ++ Cursos en lista ++ ==================================" );
        System.out.println( " " );

        unDH.asignarProfesores( 20, 2020, 2010 );
        unDH.asignarProfesores( 21, 2021, 2011 );

        System.out.println( " " );
        System.out.println( "================================ ++ Profesores Asignados ++ ==================================" );
        System.out.println( " " );
        //Alumno unAlumno = new Alumno( "Martin", "Canteras", 1010 );
        //Alumno otroAlumno = new Alumno( "Sergio", "Martinez", 1011 );
        //Alumno unomasAlumno = new Alumno( "Eduardo", "Filgueras", 1012 );


        List <Alumno> listaAlumnos = new ArrayList <>();
        unDH.setListaAlumnos( listaAlumnos );
        System.out.println( " " );

        unDH.altaAlumno( 1010, "Martín", "Canteras" );
        unDH.altaAlumno( 1011, "Sergio", "Martínez" );
        unDH.altaAlumno( 1012, "Eduardo", "Filgueras" );

        System.out.println( " " );
        System.out.println( listaAlumnos );
        System.out.println( " " );
        System.out.println( "================================ ++ Alumnos de Alta ++ ==================================" );
        System.out.println( " " );

        List <Inscripcion> listaInscripciones = new ArrayList <>();
        unDH.setListaInscripciones( listaInscripciones );


        unDH.inscribirAlumno( 1010, 20 );
        unDH.inscribirAlumno( 1012, 20 );
        unDH.inscribirAlumno( 1010, 21 );
        unDH.inscribirAlumno( 1011, 21 );

        System.out.println( " " );
        System.out.println( "================================ ++ Alumnos Inscriptos 2 FullStack 2 Android ++ ==================================" );
        System.out.println( " " );

        unDH.inscribirAlumno( 1012, 21 );

        System.out.println( " " );
        System.out.println( "================================ ++ Alumno Inscripto?  Android / supera el cupo ++ ==================================" );
        System.out.println( " " );
        System.out.println( listaInscripciones );
        System.out.println( " " );
        System.out.println( "================================ ++ Total Alumnos Inscriptos  Android y FullStack ++ ==================================" );
        System.out.println( " " );


    }
}

