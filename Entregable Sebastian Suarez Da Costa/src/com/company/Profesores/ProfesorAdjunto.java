package com.company.Profesores;

public class ProfesorAdjunto extends Profesor {

    //atributos
    protected Integer cantidadHorasConsulta;


    //constructor
    public ProfesorAdjunto (String nombreProfesor, String apellidoProfesor, Integer codigoProfesor, Integer cantidadHorasConsulta ) {
        super( nombreProfesor, apellidoProfesor, codigoProfesor );
        this.cantidadHorasConsulta = cantidadHorasConsulta;
    }

    public ProfesorAdjunto(Integer codigoProfesorAdjunto){
        this.codigoProfesor = codigoProfesorAdjunto;
    }

    public Integer getCantidadHorasConsulta ( ) {
        return cantidadHorasConsulta;
    }

    public void setCantidadHorasConsulta ( Integer cantidadHorasConsulta ) {
        this.cantidadHorasConsulta = cantidadHorasConsulta;
    }

    @Override
    public boolean equals ( Object obj ) {
        if (!(obj instanceof ProfesorAdjunto)) {
            return false;
        }
        ProfesorAdjunto profesorAdjuntoAComparar = (ProfesorAdjunto) obj;
        return (this.codigoProfesor.equals( profesorAdjuntoAComparar.codigoProfesor ));
    }

    @Override
    public String toString ( ) {
       return "Profesor adjunto: "+ nombreProfesor + " "+ apellidoProfesor + " codigo: " + codigoProfesor ;
    }
}
