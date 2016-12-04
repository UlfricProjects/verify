package com.ulfric.verify.verb;

public interface ObjectVerb<T> extends Verb<T> {

	void isNotNull();

	void isNull();

	void isSameAs(Object other);

	void isNotSameAs(Object other);

	void isEqualTo(Object other);

	void isNotEqualTo(Object other);

	void isInstanceOf(Class<?> clazz);

	void isNotInstanceOf(Class<?> clazz);

	void isExactType(Class<?> clazz);

	void isNotExactType(Class<?> clazz);

}