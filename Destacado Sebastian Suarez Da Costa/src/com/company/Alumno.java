package com.company;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Alumno {

    //atributos
    private Integer codigo;
    private String nombre;
    private String apellido;


    //constructor
    public Alumno ( Integer codigoAlumno, String nombreAlumno, String apellidoAlumno ) {
        this.codigo = codigoAlumno;
        this.nombre = nombreAlumno;
        this.apellido = apellidoAlumno;

    }


    //getters setters
    public Integer getCodigo ( ) {
        return codigo;
    }

    public String getApellido ( ) {
        return apellido;
    }

    public String getNombre ( ) {
        return nombre;
    }

    public void setCodigo ( Integer codigo ) {
        this.codigo = codigo;
    }

    public void setNombre ( String nombre ) {
        this.nombre = nombre;
    }

    public void setApellido ( String apellido ) {
        this.apellido = apellido;
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
        return " codigo: " + codigo + " Alumnno: " + nombre + " " + apellido;
    }
}

