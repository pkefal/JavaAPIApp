package com.microsoft.trysamples.javaapiapp;

import com.wordnik.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * JaxRS application
 */
@ApplicationPath("/api")
public class App extends Application {

    public App(){
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("/JavaAPIApp/api");
        beanConfig.setResourcePackage("com.microsoft.trysamples.javaapiapp");
        beanConfig.setScan(true);
    }


}
