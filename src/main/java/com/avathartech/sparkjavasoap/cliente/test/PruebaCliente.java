package com.avathartech.sparkjavasoap.cliente.test;

import com.avathartech.sparkjavasoap.cliente.ws.AcademicoWebService;
import com.avathartech.sparkjavasoap.cliente.ws.AcademicoWebServiceService;
import com.avathartech.sparkjavasoap.cliente.ws.Asignatura;
import com.avathartech.sparkjavasoap.cliente.ws.Estudiante;

import java.util.List;

/**
 * Created by vacax on 19/06/17.
 */
public class PruebaCliente {

    public static void main(String[] args) {
        //Debes de iniciar el servidor primero.
        AcademicoWebServiceService academicoWebService = new AcademicoWebServiceService();
        AcademicoWebService port = academicoWebService.getAcademicoWebServicePort();

        List<Estudiante> allEstudiante = port.getAllEstudiante();
        System.out.println("La cantidad de estudiantes: "+allEstudiante.size());

        Estudiante estudiante = port.getEstudiante(20011136);
        System.out.println("Nombre del estudiante: "+estudiante.getNombre());

        Asignatura asignatura = port.getAsignatura(1);
        System.out.println("Asignatura: "+asignatura.getNombre()+", Profesor: "+asignatura.getProfesor().getNombre());



    }
}
