package com.avathartech.sparkjavasoap;

import com.avathartech.sparkjavasoap.soap.SoapArranque;
import spark.Spark;


/**
 * Created by vacax on 18/06/17.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        //Arranque del servidor 
        SoapArranque.init();

        //
        Spark.get("/", (request, response) -> {
            return "Proyecto Ejemplo SparkJava - Jetty - SOAP";
        });
    }



}
