package com.manorrock.cheetah;

import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.enterprise.util.TypeLiteral;
import java.lang.System.Logger;
import static java.lang.System.Logger.Level.DEBUG;
import java.lang.annotation.Annotation;
import java.util.Iterator;

/**
 * The Cheetah extension for the CDI class.
 *
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class CheetahCDI extends CDI {

    /**
     * Stores the logger.
     */
    private static final Logger LOGGER
            = System.getLogger(CheetahCDI.class.getName());

    @Override
    public BeanManager getBeanManager() {
        LOGGER.log(DEBUG, "Getting BeanManager: null");
        return null;
    }

    public Instance select(Annotation... qualifiers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Instance select(Class subtype, Annotation... qualifiers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Instance select(TypeLiteral subtype, Annotation... qualifiers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isUnsatisfied() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isAmbiguous() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void destroy(Object instance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Handle getHandle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Iterable handles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object get() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
