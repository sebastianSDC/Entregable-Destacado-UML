package com.company;

import com.company.Profesores.Profesor;
import com.company.Profesores.ProfesorAdjunto;
import com.company.Profesores.ProfesorTitular;

import java.util.ArrayList;
import java.util.List;

public class DHManager {

    //atributos
    private List <Alumno> listaAlumnos;
    private List <Profesor> listaProfesores;
    private List <Curso> listaCursos;
    private List <Inscripcion> listaInscripciones;

    //constructor
    public DHManager ( ) {
        this.listaAlumnos = new ArrayList <>();
        this.listaProfesores = new ArrayList <>();
        this.listaCursos = new ArrayList <>();
        this.listaInscripciones = new ArrayList <>();
    }

    //getters setters
    public void setListaAlumnos ( List <Alumno> listaAlumnos ) {
        this.listaAlumnos = listaAlumnos;
    }

    public void setListaProfesores ( List <Profesor> listaProfesores ) {
        this.listaProfesores = listaProfesores;
    }

    public void setListaCursos ( List <Curso> listaCursos ) {
        this.listaCursos = listaCursos;
    }

    public void setListaInscripciones ( List <Inscripcion> listaInscripciones ) {
        this.listaInscripciones = listaInscripciones;
    }

    public List <Alumno> getListaAlumnos ( ) {
        return listaAlumnos;
    }

    public List <Profesor> getListaProfesores ( ) {
        return listaProfesores;
    }

    public List <Curso> getListaCursos ( ) {
        return listaCursos;
    }

    public List <Inscripcion> getListaInscripciones ( ) {
        return listaInscripciones;
    }

    //metodos

    public void altaCurso ( String nombre, Integer codigoCurso, Integer cupoMaxAlumnos ) {
        Curso cursoACrear = new Curso( nombre, codigoCurso, cupoMaxAlumnos );
        listaCursos.add( cursoACrear );
        System.out.println( "Se dio de alta el Curso: " + nombre );
    }

    public void bajaCurso ( Integer codigoCurso ) {
        List <Curso> listacursosDeAlta = new ArrayList <>();
        for (Curso unCurso : listaCursos) {
            if (unCurso.getCodigoCurso() != codigoCurso) {
                listacursosDeAlta.add( unCurso );
            }
        }
        listaCursos = listacursosDeAlta;
        System.out.println( listaCursos );
    }

    public void altaProfesorTitular ( String nombre, String apellido, Integer codigoProfesor, String especialidad ) {
        ProfesorTitular profesorTitularACrear = new ProfesorTitular( nombre, apellido, codigoProfesor, especialidad );
        listaProfesores.add( profesorTitularACrear );
        System.out.println( "Se dio el alta al ProfesorTitular: " + nombre + " " + apellido );
    }

    public void altaProfesorAdjunto ( String nombre, String apellido, Integer codigoProfesor, Integer cantHoras ) {
        ProfesorAdjunto profesorAdjuntoACrear = new ProfesorAdjunto( nombre, apellido, codigoProfesor, cantHoras );
        listaProfesores.add( profesorAdjuntoACrear );
        System.out.println( "Se dio el alta al Profesor Adjunto: " + nombre + " " + apellido );
    }

    public void bajaProfesor ( Integer codigoProfesor ) {
        List <Profesor> listaProfesoresDeAlta = new ArrayList <>();
        for (Profesor unProfesor : listaProfesores) {
            if (unProfesor.getCodigoProfesor() != codigoProfesor) {
                listaProfesoresDeAlta.add( unProfesor );
            }
        }
        listaProfesores = listaProfesoresDeAlta;
        System.out.println( "Se dio de Baja al Profesor." );
    }

    public void altaAlumno ( Integer codigo, String nombre, String apellido ) {
        Alumno alumnoACrear = new Alumno( codigo, nombre, apellido );
        listaAlumnos.add( alumnoACrear );
        System.out.println( "Se dio el alta al alumno: " + alumnoACrear.getNombre() + " " + alumnoACrear.getApellido() );
    }

    public void inscribirAlumno ( Integer codigo, Integer codigoCurso ) {

        Curso cursoAInscribir = null;
        for (Curso unCurso : listaCursos) {
            if (unCurso.getCodigoCurso().equals( codigoCurso )) {
                cursoAInscribir = unCurso;
                break;
            }
        }
        Alumno alumnoAInscribir = null;
        for (Alumno unAlumno : listaAlumnos) {
            if (unAlumno.getCodigo().equals( codigo )) {
                alumnoAInscribir = unAlumno;
                break;
            }
        }
        //tengo al curso solicitado y al alumno solicitado guardados en una variable cada uno.
        // ahora averiguo si es factible la inscripcion. la inscribo y la agrego al listado.
        //
        System.out.println( "========================= se cumple agregar? ==================" );

        if (cursoAInscribir != null && alumnoAInscribir != null && cursoAInscribir.agregarUnAlumno( alumnoAInscribir )) {
            Inscripcion unaInscripcion = new Inscripcion( alumnoAInscribir, cursoAInscribir, "15/04/2018" );
            listaInscripciones.add( unaInscripcion );

            System.out.println( unaInscripcion );
            System.out.println( "================================================================================" );
        }
    }

    public void asignarProfesores ( Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto ) {

        ProfesorTitular unProTi;
        unProTi = new ProfesorTitular( codigoProfesorTitular );

        ProfesorAdjunto unProAd;
        unProAd = new ProfesorAdjunto( codigoProfesorAdjunto );

        Curso unCursoArmar;
        unCursoArmar = new Curso( codigoCurso );

        for (Curso unCurso : listaCursos) {
            if (unCurso.getCodigoCurso().equals( codigoCurso )) {
                unCursoArmar = unCurso;
                break;
            }
        }

        for (Profesor unTitular : listaProfesores) {
            if (unTitular.getCodigoProfesor().equals( codigoProfesorTitular )) {
                unProTi.setCodigoProfesor( codigoProfesorTitular );
                break;
            }
        }

        for (Profesor unAdjunto : listaProfesores) {
            if (unAdjunto.getCodigoProfesor().equals( codigoProfesorAdjunto )) {
                unProAd.setCodigoProfesor( codigoProfesorAdjunto );
                break;
            }
        }
        unCursoArmar.setProfesorTitular( unProTi );
        unCursoArmar.setProfesorAdjunto( unProAd );

        //Curso unCurso = new Curso( codigoCurso, unProTi, unProAd );

        System.out.println( "El curso " + codigoCurso + " Acaba de asignar sus profesores. " );

    }
}
