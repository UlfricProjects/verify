package com.ulfric.verify.verb;

public interface ClassVerb extends TypeVerb {

	void isAssignableTo(Class<?> clazz);

	void isEnum();

	void isNotEnum();

}