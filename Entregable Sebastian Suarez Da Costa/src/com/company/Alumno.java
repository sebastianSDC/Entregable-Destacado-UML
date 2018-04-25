package com.company;

public class Alumno {

    //atributos
    private Integer codigo;
    private String nombre;
    private String apellido;


    //constructor
    public Alumno ( Integer codigo, String nombre, String apellido ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    //getters
    public Integer getCodigo ( ) {
        return codigo;
    }

    public String getApellido ( ) {
        return apellido;
    }

    public String getNombre ( ) {
        return nombre;
    }

    //metodos.

    @Override
    public boolean equals ( Object obj ) {
        if (!(obj instanceof Alumno)) {
            return false;
        }
        Alumno alumnoAComparar = (Alumno) obj;
        return (this.codigo.equals( alumnoAComparar.codigo ));
    }

    @Override
    public String toString ( ) {
        return "Alumnno: "+ nombre + " "+ apellido + " codigo: "+ codigo;
    }
}

