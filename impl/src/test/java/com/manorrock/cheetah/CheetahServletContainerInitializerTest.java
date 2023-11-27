package com.manorrock.cheetah;

import java.util.logging.ConsoleHandler;
import static java.util.logging.Level.FINEST;
import java.util.logging.Logger;
import org.junit.Test;

/**
 * The JUnit tests for the CheetahServletContainerInitializer.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class CheetahServletContainerInitializerTest {
    
    /**
     * Test onStartup method.
     * 
     * @throws Exception when a serious error occurs.
     */
    @Test
    public void testOnStartup() throws Exception {
        CheetahServletContainerInitializer initializer = new CheetahServletContainerInitializer();
        initializer.onStartup(null, null);
    }
}
