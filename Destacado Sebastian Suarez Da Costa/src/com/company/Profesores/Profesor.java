package com.company.Profesores;

import com.company.Alumno;

public class Profesor {

    //atributos
    protected String nombreProfesor;
    protected String apellidoProfesor;
    protected Integer antiguedad;
    protected Integer codigoProfesor;

    //constructor
    public Profesor ( String nombreProfesor, String apellidoProfesor, Integer codigoProfesor ) {
        this.nombreProfesor = nombreProfesor;
        this.apellidoProfesor = apellidoProfesor;
        this.codigoProfesor = codigoProfesor;
        antiguedad = 0;
    }

    public Profesor ( ) {
    }

    //getters setters
    public String getNombreProfesor ( ) {
        return nombreProfesor;
    }

    public String getApellidoProfesor ( ) {
        return apellidoProfesor;
    }

    public Integer getCodigoProfesor ( ) {
        return codigoProfesor;
    }

    public Integer getAntiguedad ( ) {
        return antiguedad;
    }

    public void setAntiguedad ( Integer antiguedad ) {
        this.antiguedad = antiguedad;
    }

    public void setCodigoProfesor ( Integer codigoProfesor ) {
        this.codigoProfesor = codigoProfesor;
    }

    public void setNombreProfesor ( String nombreProfesor ) {
        this.nombreProfesor = nombreProfesor;
    }

    public void setApellidoProfesor ( String apellidoProfesor ) {
        this.apellidoProfesor = apellidoProfesor;
    }

    @Override
    public boolean equals ( Object obj ) {
        if (!(obj instanceof Profesor)) {
            return false;
        }
        Profesor profesorAComparar = (Profesor) obj;
        return (this.codigoProfesor.equals( profesorAComparar.codigoProfesor ));
    }

    @Override
    public String toString ( ) {
        return "Profesor: " + nombreProfesor + " " + apellidoProfesor;
    }
}
