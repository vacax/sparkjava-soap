
package com.avathartech.sparkjavasoap.cliente.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AcademicoWebService", targetNamespace = "http://soap.sparkjavasoap.avathartech.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AcademicoWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.avathartech.sparkjavasoap.cliente.ws.Profesor
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProfesor", targetNamespace = "http://soap.sparkjavasoap.avathartech.com/", className = "com.avathartech.sparkjavasoap.cliente.ws.GetProfesor")
    @ResponseWrapper(localName = "getProfesorResponse", targetNamespace = "http://soap.sparkjavasoap.avathartech.com/", className = "com.avathartech.sparkjavasoap.cliente.ws.GetProfesorResponse")
    @Action(input = "http://soap.sparkjavasoap.avathartech.com/AcademicoWebService/getProfesorRequest", output = "http://soap.sparkjavasoap.avathartech.com/AcademicoWebService/getProfesorResponse")
    public Profesor getProfesor(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.avathartech.sparkjavasoap.cliente.ws.Estudiante
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEstudiante", targetNamespace = "http://soap.sparkjavasoap.avathartech.com/", className = "com.avathartech.sparkjavasoap.cliente.ws.GetEstudiante")
    @ResponseWrapper(localName = "getEstudianteResponse", targetNamespace = "http://soap.sparkjavasoap.avathartech.com/", className = "com.avathartech.sparkjavasoap.cliente.ws.GetEstudianteResponse")
    @Action(input = "http://soap.sparkjavasoap.avathartech.com/AcademicoWebService/getEstudianteRequest", output = "http://soap.sparkjavasoap.avathartech.com/AcademicoWebService/getEstudianteResponse")
    public Estudiante getEstudiante(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.avathartech.sparkjavasoap.cliente.ws.Asignatura
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAsignatura", targetNamespace = "http://soap.sparkjavasoap.avathartech.com/", className = "com.avathartech.sparkjavasoap.cliente.ws.GetAsignatura")
    @ResponseWrapper(localName = "getAsignaturaResponse", targetNamespace = "http://soap.sparkjavasoap.avathartech.com/", className = "com.avathartech.sparkjavasoap.cliente.ws.GetAsignaturaResponse")
    @Action(input = "http://soap.sparkjavasoap.avathartech.com/AcademicoWebService/getAsignaturaRequest", output = "http://soap.sparkjavasoap.avathartech.com/AcademicoWebService/getAsignaturaResponse")
    public Asignatura getAsignatura(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.avathartech.sparkjavasoap.cliente.ws.Estudiante>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllEstudiante", targetNamespace = "http://soap.sparkjavasoap.avathartech.com/", className = "com.avathartech.sparkjavasoap.cliente.ws.GetAllEstudiante")
    @ResponseWrapper(localName = "getAllEstudianteResponse", targetNamespace = "http://soap.sparkjavasoap.avathartech.com/", className = "com.avathartech.sparkjavasoap.cliente.ws.GetAllEstudianteResponse")
    @Action(input = "http://soap.sparkjavasoap.avathartech.com/AcademicoWebService/getAllEstudianteRequest", output = "http://soap.sparkjavasoap.avathartech.com/AcademicoWebService/getAllEstudianteResponse")
    public List<Estudiante> getAllEstudiante();

}
