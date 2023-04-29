package com.manorrock.cheetah;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * The JUnit tests for the CheetahCDIProvider class.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class CheetahCDIProviderTest {
    
    /**
     * Test getCDI method.
     */
    @Test
    public void testGetCDI() {
        CheetahCDIProvider provider = new CheetahCDIProvider();
        assertNotNull(provider.getCDI());
    }

    /**
     * Test getPriority method.
     */
    @Test
    public void testGetPriority() {
        CheetahCDIProvider provider = new CheetahCDIProvider();
        assertEquals(100, provider.getPriority());
    }
}
