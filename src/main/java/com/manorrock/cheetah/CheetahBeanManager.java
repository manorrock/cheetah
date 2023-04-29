package com.manorrock.cheetah;

import jakarta.el.ELResolver;
import jakarta.el.ExpressionFactory;
import jakarta.enterprise.context.spi.Context;
import jakarta.enterprise.context.spi.Contextual;
import jakarta.enterprise.context.spi.CreationalContext;
import jakarta.enterprise.event.Event;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.spi.AnnotatedField;
import jakarta.enterprise.inject.spi.AnnotatedMember;
import jakarta.enterprise.inject.spi.AnnotatedMethod;
import jakarta.enterprise.inject.spi.AnnotatedParameter;
import jakarta.enterprise.inject.spi.AnnotatedType;
import jakarta.enterprise.inject.spi.Bean;
import jakarta.enterprise.inject.spi.BeanAttributes;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.Decorator;
import jakarta.enterprise.inject.spi.Extension;
import jakarta.enterprise.inject.spi.InjectionPoint;
import jakarta.enterprise.inject.spi.InjectionTargetFactory;
import jakarta.enterprise.inject.spi.InterceptionFactory;
import jakarta.enterprise.inject.spi.InterceptionType;
import jakarta.enterprise.inject.spi.Interceptor;
import jakarta.enterprise.inject.spi.ObserverMethod;
import jakarta.enterprise.inject.spi.ProducerFactory;
import java.lang.System.Logger;
import static java.lang.System.Logger.Level.DEBUG;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;

/**
 * The Cheetah BeanManager.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class CheetahBeanManager implements BeanManager {

    /**
     * Stores the logger.
     */
    private static final Logger LOGGER = 
            System.getLogger(CheetahBeanManager.class.getName());
    /**
     * Stores the CDI.
     */
    private CheetahCDI cdi;
    
    /**
     * Constructor.
     * 
     * @param cdi the CDI.
     */
    public CheetahBeanManager(CheetahCDI cdi) {
        LOGGER.log(DEBUG, "Constructing CheetahBeanManager");
        this.cdi = cdi;
    }

    @Override
    public Bean<?> getPassivationCapableBean(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void validate(InjectionPoint injectionPoint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> Set<ObserverMethod<? super T>> resolveObserverMethods(T event, Annotation... qualifiers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Decorator<?>> resolveDecorators(Set<Type> types, Annotation... qualifiers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isPassivatingScope(Class<? extends Annotation> annotationType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Annotation> getInterceptorBindingDefinition(Class<? extends Annotation> bindingType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Annotation> getStereotypeDefinition(Class<? extends Annotation> stereotype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean areQualifiersEquivalent(Annotation qualifier1, Annotation qualifier2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean areInterceptorBindingsEquivalent(Annotation interceptorBinding1, Annotation interceptorBinding2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getQualifierHashCode(Annotation qualifier) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getInterceptorBindingHashCode(Annotation interceptorBinding) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ELResolver getELResolver() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ExpressionFactory wrapExpressionFactory(ExpressionFactory expressionFactory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> AnnotatedType<T> createAnnotatedType(Class<T> type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> InjectionTargetFactory<T> getInjectionTargetFactory(AnnotatedType<T> annotatedType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <X> ProducerFactory<X> getProducerFactory(AnnotatedField<? super X> field, Bean<X> declaringBean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <X> ProducerFactory<X> getProducerFactory(AnnotatedMethod<? super X> method, Bean<X> declaringBean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> BeanAttributes<T> createBeanAttributes(AnnotatedType<T> type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BeanAttributes<?> createBeanAttributes(AnnotatedMember<?> type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> Bean<T> createBean(BeanAttributes<T> attributes, Class<T> beanClass, InjectionTargetFactory<T> injectionTargetFactory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T, X> Bean<T> createBean(BeanAttributes<T> attributes, Class<X> beanClass, ProducerFactory<X> producerFactory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public InjectionPoint createInjectionPoint(AnnotatedField<?> field) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public InjectionPoint createInjectionPoint(AnnotatedParameter<?> parameter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T extends Extension> T getExtension(Class<T> extensionClass) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> InterceptionFactory<T> createInterceptionFactory(CreationalContext<T> ctx, Class<T> clazz) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getInjectableReference(InjectionPoint ij, CreationalContext<?> ctx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getReference(Bean<?> bean, Type beanType, CreationalContext<?> ctx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> CreationalContext<T> createCreationalContext(Contextual<T> contextual) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Bean<?>> getBeans(Type beanType, Annotation... qualifiers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Bean<?>> getBeans(String name) {
        LOGGER.log(DEBUG, "Getting beans for name: {0}", name);
        return null;
    }

    @Override
    public <X> Bean<? extends X> resolve(Set<Bean<? extends X>> beans) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Interceptor<?>> resolveInterceptors(InterceptionType type, Annotation... interceptorBindings) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isScope(Class<? extends Annotation> annotationType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isNormalScope(Class<? extends Annotation> annotationType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isQualifier(Class<? extends Annotation> annotationType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isStereotype(Class<? extends Annotation> annotationType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isInterceptorBinding(Class<? extends Annotation> annotationType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Context getContext(Class<? extends Annotation> scopeType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Event<Object> getEvent() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Instance<Object> createInstance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
