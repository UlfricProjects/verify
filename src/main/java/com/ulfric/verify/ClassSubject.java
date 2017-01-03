package com.ulfric.verify;

import com.ulfric.verify.verb.ClassVerb;

class ClassSubject extends TypeSubject<Class<?>> implements ClassVerb {

	ClassSubject(Class<?> subject)
	{
		super(subject);
	}

	@Override
	public final void isAssignableTo(Class<?> clazz)
	{
		this.isNotNull();

		if (clazz.isAssignableFrom(this.subject)) return;

		this.error("expected something assignable from " + clazz + ", got " + this.subject);
	}

}