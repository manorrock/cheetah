package com.manorrock.cheetah;

import jakarta.enterprise.inject.spi.CDI;
import jakarta.enterprise.inject.spi.CDIProvider;
import java.lang.System.Logger;
import static java.lang.System.Logger.Level.DEBUG;

/**
 * The Cheetah CDIProvider.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class CheetahCDIProvider implements CDIProvider {

    /**
     * Stores the logger.
     */
    private static final Logger LOGGER = 
            System.getLogger(CheetahCDIProvider.class.getName());
    
    /**
     * Stores the CDI.
     */
    private CDI<Object> cdi = new CheetahCDI();
    
    @Override
    public CDI<Object> getCDI() {
        LOGGER.log(DEBUG, "Getting CDI: {0}", cdi);
        return cdi;
    }

    @Override
    public int getPriority() {
        LOGGER.log(DEBUG, "Getting priority: 100");
        return 100;
    }
}
