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
		if (clazz.isAssignableFrom(this.subject))
		{
			return;
		}

		this.error("expected something assignable from " + clazz + ", got " + this.subject);
	}

	@Override
	public final void isEnum()
	{
		if (this.subject.isEnum())
		{
			return;
		}

		this.error("expected an enum, got " + this.subject);
	}

	@Override
	public final void isNotEnum()
	{
		if (!this.subject.isEnum())
		{
			return;
		}

		this.error("expected not an enum, got " + this.subject);
	}

}