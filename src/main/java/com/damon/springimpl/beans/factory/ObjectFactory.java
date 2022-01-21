package com.damon.springimpl.beans.factory;

import com.damon.springimpl.beans.BeansException;

public interface ObjectFactory<T> {

    T getObject() throws BeansException;

}