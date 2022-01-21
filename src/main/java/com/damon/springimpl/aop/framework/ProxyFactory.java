package com.damon.springimpl.aop.framework;

import com.damon.springimpl.aop.AdvisedSupport;

public class ProxyFactory {
    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport){
        this.advisedSupport = advisedSupport;
    }
    public Object getProxy(){
        return createAopProxy().getProxy();
    }
    private AopProxy createAopProxy(){
        if(advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }
        return new JdkDynamicAopProxy(advisedSupport);
    }
}
