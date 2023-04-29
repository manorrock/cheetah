package com.manorrock.cheetah;

import jakarta.enterprise.inject.spi.CDI;
import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import java.lang.System.Logger;
import static java.lang.System.Logger.Level.DEBUG;
import java.util.Set;

/**
 * The ServletContainerInitializer to enable Manorrock Cheetah.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class CheetahServletContainerInitializer implements ServletContainerInitializer {

    /**
     * Stores the logger.
     */
    private static final Logger LOGGER = 
            System.getLogger(CheetahServletContainerInitializer.class.getName());
    
    /**
     * On startup.
     * 
     * @param classes the classes.
     * @param servletContext the Servlet context.
     * @throws ServletException when a serious error occurs.
     */
    @Override
    public void onStartup(Set<Class<?>> classes, ServletContext servletContext)
            throws ServletException {
        CheetahCDIProvider provider = new CheetahCDIProvider();
        LOGGER.log(DEBUG, "Setting CDI provider: {0}", provider);
        CDI.setCDIProvider(provider);
    }
}
