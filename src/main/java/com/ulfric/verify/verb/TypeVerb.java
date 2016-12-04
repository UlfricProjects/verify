package com.ulfric.verify.verb;

import java.lang.reflect.Type;

public interface TypeVerb<T extends Type> extends ObjectVerb<T> {

	void isClass();

	void isNotClass();

	void isParameterizedType();

	void isNotParameterizedType();

	void isGenericArrayType();

	void isNotGenericArrayType();

	void isWildcardType();

	void isNotWildcardType();

	void isTypeVariable();

	void isNotTypeVariable();

}