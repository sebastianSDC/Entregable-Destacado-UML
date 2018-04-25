package com.company;

public class Inscripcion {

    //atributos
    private Alumno alumnno;
    private Curso curso;
    private String fecha;

    public Inscripcion ( Alumno alumnno, Curso curso, String fecha ) {
        this.alumnno = alumnno;
        this.curso = curso;
        this.fecha = fecha;
    }

    //metodo to string


    @Override
    public String toString ( ) {
        return "Ha sido inscripto el Alumno "+ alumnno.getNombre() + " " + alumnno.getApellido() + " al curso de: " + curso.getNombre() + " el dia: " + fecha ;
    }
}
