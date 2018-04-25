package com.company.Profesores;

public class ProfesorTitular extends Profesor {

    //atributo
    private String especialidad;

    //constructor
    public ProfesorTitular ( String nombreProfesor, String apellidoProfesor, Integer codigoProfesor, String especialidad ) {
        super( nombreProfesor, apellidoProfesor, codigoProfesor );
        this.especialidad = especialidad;
    }
    public ProfesorTitular(Integer codigoProfesor){
        this.codigoProfesor = codigoProfesor;
    }

    //getters setters
    public String getEspecialidad ( ) {
        return especialidad;
    }

    public void setEspecialidad ( String especialidad ) {
        this.especialidad = especialidad;
    }



    @Override
    public boolean equals ( Object obj ) {
        if (!(obj instanceof ProfesorTitular)) {
            return false;
        }
        ProfesorTitular profesorTitularAComparar = (ProfesorTitular) obj;
        return (this.codigoProfesor.equals( profesorTitularAComparar.codigoProfesor ));
    }

    @Override
    public String toString ( ) {
        return "Profesor titular: "+ nombreProfesor + " "+ apellidoProfesor;
    }






}
