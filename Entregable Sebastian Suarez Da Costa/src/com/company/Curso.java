package com.company;

import com.company.Profesores.ProfesorAdjunto;
import com.company.Profesores.ProfesorTitular;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    //atributos
    private String nombre;
    private Integer codigoCurso;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private Integer cupoMaxAlumnos;
    private List <Alumno> listAlumnosInscriptos;

    //constructor
    public Curso ( String nombre, Integer codigoCurso, Integer cupoMaxAlumnos ) {
        this.nombre = nombre;
        this.codigoCurso = codigoCurso;
        this.cupoMaxAlumnos = cupoMaxAlumnos;
        this.profesorTitular = profesorTitular;
        this.profesorAdjunto = profesorAdjunto;

        listAlumnosInscriptos = new ArrayList <Alumno>();
    }

    public Curso ( Integer codigoCurso, ProfesorTitular unTitular, ProfesorAdjunto unAdjunto ) {
        this.codigoCurso = codigoCurso;
        this.profesorTitular = unTitular;
        profesorTitular.setCodigoProfesor( unTitular.getCodigoProfesor() );
        this.profesorAdjunto = unAdjunto;
        profesorAdjunto.setCodigoProfesor( unAdjunto.getCodigoProfesor() );
    }

    public Curso ( Integer codigoCurso ) {
        this.codigoCurso = codigoCurso;
    }


    //getters setters
    public String getNombre ( ) {
        return nombre;
    }

    public Integer getCodigoCurso ( ) {
        return codigoCurso;
    }

    public Integer getCupoMaxAlumnos ( ) {
        return cupoMaxAlumnos;
    }

    public ProfesorTitular getProfesorTitular ( ) {
        return profesorTitular;
    }

    public ProfesorAdjunto getProfesorAdjunto ( ) {
        return profesorAdjunto;
    }

    public List <Alumno> getListAlumnosInscriptos ( ) {
        return listAlumnosInscriptos;
    }

    public void setListAlumnosInscriptos ( List <Alumno> listAlumnosInscriptos ) {
        this.listAlumnosInscriptos = listAlumnosInscriptos;
    }

    public void setProfesorAdjunto ( ProfesorAdjunto profesorAdjunto ) {
        this.profesorAdjunto = profesorAdjunto;
    }

    public void setProfesorTitular ( ProfesorTitular profesorTitular ) {
        this.profesorTitular = profesorTitular;
    }

    public void setCodigoCurso ( Integer codigoCurso ) {
        this.codigoCurso = codigoCurso;
    }

    //metodos
    public boolean agregarUnAlumno ( Alumno unAlumno ) {
        if (cupoMaxAlumnos > listAlumnosInscriptos.size()) {
            return listAlumnosInscriptos.add( unAlumno );
        } else {
            System.out.println("no hay cupo. Lo siento.");
            System.out.println( "================================================================================" );
            return false;
        }
    }

    public void eliminarAlumno ( Alumno unAlumno ) {
        listAlumnosInscriptos.remove( unAlumno );
        System.out.println("Se Ha Eliminado el Alumno "+ unAlumno.getNombre()+" "+ unAlumno.getApellido()+" del Curso "+nombre);

    }

    @Override
    public boolean equals ( Object obj ) {
        if (!(obj instanceof Curso)) {
            return false;
        }
        Curso cursoAComparar = (Curso) obj;
        return (this.codigoCurso.equals( cursoAComparar.codigoCurso ));
    }

    @Override
    public String toString ( ) {
        return "Curso: " + nombre + " codigo: " + codigoCurso + " Cupo maximo: " + cupoMaxAlumnos;
    }
}
