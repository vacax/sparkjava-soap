package com.avathartech.sparkjavasoap.soap;

import com.avathartech.sparkjavasoap.Main;
import com.sun.net.httpserver.HttpContext;
import org.eclipse.jetty.http.spi.HttpSpiContextHandler;
import org.eclipse.jetty.http.spi.JettyHttpContext;
import org.eclipse.jetty.http.spi.JettyHttpServer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;

import javax.xml.ws.Endpoint;
import java.lang.reflect.Method;

/**
 * Created by vacax on 18/06/17.
 */
public class SoapArranque {

    public static void init() throws Exception {

        //inicializando el servidor
        Server server = new Server(7777);
        ContextHandlerCollection contextHandlerCollection = new ContextHandlerCollection();
        server.setHandler(contextHandlerCollection);
        server.start();

        //
        HttpContext context = build(server, "/ws");
        AcademicoWebService wsa = new AcademicoWebService();
        Endpoint endpoint = Endpoint.create(wsa);
        endpoint.publish(context);
        // access wsdl on http://localhost:7777/ws/AcademicoWebService?wsdl

    }

    private static HttpContext build(Server server, String contextString) throws Exception {
        JettyHttpServer jettyHttpServer = new JettyHttpServer(server, true);
        JettyHttpContext ctx = (JettyHttpContext) jettyHttpServer.createContext(contextString);
        Method method = JettyHttpContext.class.getDeclaredMethod("getJettyContextHandler");
        method.setAccessible(true);
        HttpSpiContextHandler contextHandler = (HttpSpiContextHandler) method.invoke(ctx);
        contextHandler.start();
        return ctx;
    }
}
