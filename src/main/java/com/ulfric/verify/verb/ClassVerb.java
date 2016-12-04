package com.ulfric.verify.verb;

public interface ClassVerb extends TypeVerb<Class<?>> {

	void isAssignableTo(Class<?> clazz);

}