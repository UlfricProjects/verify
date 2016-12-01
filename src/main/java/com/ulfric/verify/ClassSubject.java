package com.ulfric.verify;

public final class ClassSubject extends TypeSubject<Class<?>> {

	ClassSubject(Class<?> subject)
	{
		super(subject);
	}

	public void isAssignableTo(Class<?> clazz)
	{
		this.isNotNull();

		if (clazz.isAssignableFrom(this.subject)) return;

		this.fail(" something assignable from " + clazz);
	}

}