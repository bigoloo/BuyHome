package com.bigoloo.finance.home.domain.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/20/18.
 */

@Scope
@Retention(RUNTIME)
public @interface HomeScope {
}