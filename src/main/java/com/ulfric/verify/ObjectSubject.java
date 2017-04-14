package com.ulfric.verify;

import java.util.Objects;

import org.junit.jupiter.api.Assertions;

import com.ulfric.verify.verb.ObjectVerb;

class ObjectSubject<T> extends Subject<T> implements ObjectVerb {

	ObjectSubject(T subject)
	{
		super(subject);
	}

	@Override
	public final void isNotNull()
	{
		if (this.subject != null)
		{
			return;
		}

		Assertions.fail("expected not null, was " + this.subject);
	}

	@Override
	public final void isNull()
	{
		if (this.subject == null)
		{
			return;
		}

		Assertions.fail("expected null, was not null");
	}

	@Override
	public final void isSameAs(Object other)
	{
		if (this.subject == other)
		{
			return;
		}

		Assertions.fail("expected the same as " + other + ", was " + this.subject);
	}

	@Override
	public final void isNotSameAs(Object other)
	{
		if (this.subject != other)
		{
			return;
		}

		Assertions.fail("expected anything except for " + this.subject + ", was the same");
	}

	@Override
	public final void isEqualTo(Object other)
	{
		if (Objects.deepEquals(this.subject, other))
		{
			return;
		}

		Assertions.fail("expected equal to " + other + ", was " + this.subject);
	}

	@Override
	public final void isNotEqualTo(Object other)
	{
		if (!Objects.deepEquals(this.subject, other))
		{
			return;
		}

		Assertions.fail("expected not equal to " + other + ", was " + this.subject);
	}

	@Override
	public final void isInstanceOf(Class<?> clazz)
	{
		if (clazz.isInstance(this.subject))
		{
			return;
		}

		Assertions.fail("expected an instance of " + clazz + ", was " + this.subject.getClass());
	}

	@Override
	public final void isNotInstanceOf(Class<?> clazz)
	{
		if (!clazz.isInstance(this.subject))
		{
			return;
		}

		Assertions.fail("expected not an instance of " + clazz + ", was an instance of the same type");
	}

	@Override
	public final void isExactType(Class<?> clazz)
	{
		if (clazz == this.subject.getClass())
		{
			return;
		}

		Assertions.fail("expected an instance of exactly " + clazz + ", was an instance of " + this.subject.getClass());
	}

	@Override
	public final void isNotExactType(Class<?> clazz)
	{
		if (clazz != this.subject.getClass())
		{
			return;
		}

		Assertions.fail("expected not an instance of exactly " + clazz + ", was an instance of the same type");
	}

}