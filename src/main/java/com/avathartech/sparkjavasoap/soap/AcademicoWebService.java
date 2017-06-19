package com.avathartech.sparkjavasoap.soap;

import com.avathartech.sparkjavasoap.encapsulacion.Asignatura;
import com.avathartech.sparkjavasoap.encapsulacion.Estudiante;
import com.avathartech.sparkjavasoap.encapsulacion.Profesor;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vacax on 18/06/17.
 */
@WebService
public class AcademicoWebService {


    @WebMethod
    public Estudiante getEstudiante(int matricula){
        return new Estudiante(matricula, "Estudiante "+matricula);
    }

    @WebMethod
    public Profesor getProfesor(String cedula){
       return new Profesor(cedula, "Profesor "+cedula);
    }

    @WebMethod
    public Asignatura getAsignatura(int id){
        Asignatura asig = new Asignatura();
        asig.setId(id);
        asig.setGrupo(1);
        asig.setClave("ISC-415");
        asig.setNombre("Programación Web");
        asig.setProfesor(getProfesor("031-0001-01"));
        asig.setEstudiantes(getAllEstudiante());
        return asig;
    }

    @WebMethod
    public List<Estudiante> getAllEstudiante(){
        List<Estudiante> listado = new ArrayList<>();
        for(int i=0;i<100;i++){
            listado.add(new Estudiante(i, "Estudiante "+i));
        }
        return listado;
    }

    

}
