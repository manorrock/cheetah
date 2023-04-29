package com.manorrock.cheetah;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CheetahBeanManagerTest {

    /**
     * Test getBeans method.
     */
    @Test
    public void testGetBeans() {
        CheetahCDI cdi = new CheetahCDI();
        CheetahBeanManager manager = new CheetahBeanManager(cdi);
        assertNull(manager.getBeans("NullBean"));
    }
}
