package com.ulfric.verify;

import org.junit.jupiter.api.Assertions;

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

		Assertions.fail("expected something assignable from " + clazz + ", got " + this.subject);
	}

	@Override
	public final void isNotAssignableTo(Class<?> clazz)
	{
		if (!clazz.isAssignableFrom(this.subject))
		{
			return;
		}

		Assertions.fail("expected something not assignable from " + clazz + ", got " + this.subject);
	}

	@Override
	public final void isEnum()
	{
		if (this.subject.isEnum())
		{
			return;
		}

		Assertions.fail("expected an enum, got " + this.subject);
	}

	@Override
	public final void isNotEnum()
	{
		if (!this.subject.isEnum())
		{
			return;
		}

		Assertions.fail("expected not an enum, got " + this.subject);
	}

}