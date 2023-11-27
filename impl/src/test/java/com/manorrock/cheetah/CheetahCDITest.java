package com.manorrock.cheetah;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * The JUnit tests for the CheetahCDI class.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class CheetahCDITest {
    
    /**
     * Test getBeanManager method.
     */
    @Test
    public void testGetBeanManager() {
        CheetahCDI cdi = new CheetahCDI();
        assertNotNull(cdi.getBeanManager());
    }
}
