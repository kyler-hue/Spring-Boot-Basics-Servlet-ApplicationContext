package com.example.demo;

import jakarta.servlet.ServletContext;
import org.springframework.web.WebApplicationInitializer;

public class AppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {

        // Root context
//        AnnotationConfigWebApplicationContext rootContext =
//                new AnnotationConfigWebApplicationContext();
//        rootContext.register(RootConfig.class);
//
//        servletContext.addListener(
//                new ContextLoaderListener(rootContext)
//        );
//
//        // Web (DispatcherServlet) context
//        AnnotationConfigWebApplicationContext webContext =
//                new AnnotationConfigWebApplicationContext();
//        webContext.register(WebConfig.class);
//
//        ServletRegistration.Dynamic dispatcher =
//                servletContext.addServlet("dispatcher",
//                        new DispatcherServlet(webContext));
//
//        dispatcher.setLoadOnStartup(1);
//        dispatcher.addMapping("/");
    }
}
