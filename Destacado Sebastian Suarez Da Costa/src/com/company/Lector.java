package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lector {

    //atributos
    private List<Alumno> alumnosListados = new ArrayList <>();

    //getter setter
    public List <Alumno> getAlumnosListados ( ) {
        return alumnosListados;
    }

    public void setAlumnosListados ( List <Alumno> alumnosListados ) {
        this.alumnosListados = alumnosListados;
    }

    //metodos
    public void leerYGuardar ( ) {
        BufferedReader br = null;

        try {

            br = new BufferedReader( new FileReader( "listadoDeAlumnos.csv" ) );
            String line = br.readLine();
            line= br.readLine();
            while (null != line) {
                String[] fields = line.split( "," );
               //System.out.println( Arrays.toString( fields ) );


                Integer codigo= Integer.parseInt( fields[0] );
                String nombre = fields [1];
                String apellido = fields [2];

                Alumno alumnoAlistar = new Alumno( codigo, nombre, apellido );

                alumnosListados.add( alumnoAlistar );

                line = br.readLine();
            }
            //System.out.println(alumnosListados);

        } catch (IOException e) {
         e.printStackTrace();
        } finally {
            if (br!=null) {
                try {
                    br.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
