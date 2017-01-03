package com.ulfric.verify.verb;

public interface TypeVerb extends ObjectVerb {

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