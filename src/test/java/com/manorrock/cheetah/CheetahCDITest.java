package com.manorrock.cheetah;

import static org.junit.Assert.assertNull;
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
        assertNull(cdi.getBeanManager());
    }
}
