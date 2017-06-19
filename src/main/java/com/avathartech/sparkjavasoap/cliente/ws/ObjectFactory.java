
package com.avathartech.sparkjavasoap.cliente.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.avathartech.sparkjavasoap.cliente.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAsignaturaResponse_QNAME = new QName("http://soap.sparkjavasoap.avathartech.com/", "getAsignaturaResponse");
    private final static QName _GetProfesorResponse_QNAME = new QName("http://soap.sparkjavasoap.avathartech.com/", "getProfesorResponse");
    private final static QName _GetEstudianteResponse_QNAME = new QName("http://soap.sparkjavasoap.avathartech.com/", "getEstudianteResponse");
    private final static QName _GetAsignatura_QNAME = new QName("http://soap.sparkjavasoap.avathartech.com/", "getAsignatura");
    private final static QName _GetEstudiante_QNAME = new QName("http://soap.sparkjavasoap.avathartech.com/", "getEstudiante");
    private final static QName _GetProfesor_QNAME = new QName("http://soap.sparkjavasoap.avathartech.com/", "getProfesor");
    private final static QName _GetAllEstudiante_QNAME = new QName("http://soap.sparkjavasoap.avathartech.com/", "getAllEstudiante");
    private final static QName _GetAllEstudianteResponse_QNAME = new QName("http://soap.sparkjavasoap.avathartech.com/", "getAllEstudianteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.avathartech.sparkjavasoap.cliente.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAsignaturaResponse }
     * 
     */
    public GetAsignaturaResponse createGetAsignaturaResponse() {
        return new GetAsignaturaResponse();
    }

    /**
     * Create an instance of {@link GetProfesorResponse }
     * 
     */
    public GetProfesorResponse createGetProfesorResponse() {
        return new GetProfesorResponse();
    }

    /**
     * Create an instance of {@link GetAllEstudianteResponse }
     * 
     */
    public GetAllEstudianteResponse createGetAllEstudianteResponse() {
        return new GetAllEstudianteResponse();
    }

    /**
     * Create an instance of {@link GetAllEstudiante }
     * 
     */
    public GetAllEstudiante createGetAllEstudiante() {
        return new GetAllEstudiante();
    }

    /**
     * Create an instance of {@link GetAsignatura }
     * 
     */
    public GetAsignatura createGetAsignatura() {
        return new GetAsignatura();
    }

    /**
     * Create an instance of {@link GetEstudiante }
     * 
     */
    public GetEstudiante createGetEstudiante() {
        return new GetEstudiante();
    }

    /**
     * Create an instance of {@link GetProfesor }
     * 
     */
    public GetProfesor createGetProfesor() {
        return new GetProfesor();
    }

    /**
     * Create an instance of {@link GetEstudianteResponse }
     * 
     */
    public GetEstudianteResponse createGetEstudianteResponse() {
        return new GetEstudianteResponse();
    }

    /**
     * Create an instance of {@link Estudiante }
     * 
     */
    public Estudiante createEstudiante() {
        return new Estudiante();
    }

    /**
     * Create an instance of {@link Asignatura }
     * 
     */
    public Asignatura createAsignatura() {
        return new Asignatura();
    }

    /**
     * Create an instance of {@link Profesor }
     * 
     */
    public Profesor createProfesor() {
        return new Profesor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sparkjavasoap.avathartech.com/", name = "getAsignaturaResponse")
    public JAXBElement<GetAsignaturaResponse> createGetAsignaturaResponse(GetAsignaturaResponse value) {
        return new JAXBElement<GetAsignaturaResponse>(_GetAsignaturaResponse_QNAME, GetAsignaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfesorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sparkjavasoap.avathartech.com/", name = "getProfesorResponse")
    public JAXBElement<GetProfesorResponse> createGetProfesorResponse(GetProfesorResponse value) {
        return new JAXBElement<GetProfesorResponse>(_GetProfesorResponse_QNAME, GetProfesorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sparkjavasoap.avathartech.com/", name = "getEstudianteResponse")
    public JAXBElement<GetEstudianteResponse> createGetEstudianteResponse(GetEstudianteResponse value) {
        return new JAXBElement<GetEstudianteResponse>(_GetEstudianteResponse_QNAME, GetEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sparkjavasoap.avathartech.com/", name = "getAsignatura")
    public JAXBElement<GetAsignatura> createGetAsignatura(GetAsignatura value) {
        return new JAXBElement<GetAsignatura>(_GetAsignatura_QNAME, GetAsignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sparkjavasoap.avathartech.com/", name = "getEstudiante")
    public JAXBElement<GetEstudiante> createGetEstudiante(GetEstudiante value) {
        return new JAXBElement<GetEstudiante>(_GetEstudiante_QNAME, GetEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfesor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sparkjavasoap.avathartech.com/", name = "getProfesor")
    public JAXBElement<GetProfesor> createGetProfesor(GetProfesor value) {
        return new JAXBElement<GetProfesor>(_GetProfesor_QNAME, GetProfesor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sparkjavasoap.avathartech.com/", name = "getAllEstudiante")
    public JAXBElement<GetAllEstudiante> createGetAllEstudiante(GetAllEstudiante value) {
        return new JAXBElement<GetAllEstudiante>(_GetAllEstudiante_QNAME, GetAllEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sparkjavasoap.avathartech.com/", name = "getAllEstudianteResponse")
    public JAXBElement<GetAllEstudianteResponse> createGetAllEstudianteResponse(GetAllEstudianteResponse value) {
        return new JAXBElement<GetAllEstudianteResponse>(_GetAllEstudianteResponse_QNAME, GetAllEstudianteResponse.class, null, value);
    }

}
