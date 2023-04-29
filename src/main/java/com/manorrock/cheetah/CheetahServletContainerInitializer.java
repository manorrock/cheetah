package com.manorrock.cheetah;

import jakarta.enterprise.inject.spi.CDI;
import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import java.util.Set;

/**
 * The ServletContainerInitializer to enable Manorrock Cheetah.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class CheetahServletContainerInitializer implements ServletContainerInitializer {

    /**
     * On startup.
     * 
     * @param classes the classes.
     * @param servletContext the Servlet context.
     * @throws ServletException when a serious error occurs.
     */
    public void onStartup(Set<Class<?>> classes, ServletContext servletContext)
            throws ServletException {
        CDI.setCDIProvider(new CheetahCDIProvider());
    }
}
