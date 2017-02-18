package com.ulfric.verify;

import java.util.Objects;

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

		this.error("expected not null, was " + this.subject);
	}

	@Override
	public final void isNull()
	{
		if (this.subject == null)
		{
			return;
		}

		this.error("expected null, was not null");
	}

	@Override
	public final void isSameAs(Object other)
	{
		if (this.subject == other)
		{
			return;
		}

		this.error("expected the same as " + other + ", was " + this.subject);
	}

	@Override
	public final void isNotSameAs(Object other)
	{
		if (this.subject != other)
		{
			return;
		}

		this.error("expected anything except for " + ", was the same");
	}

	@Override
	public final void isEqualTo(Object other)
	{
		if (Objects.deepEquals(this.subject, other))
		{
			return;
		}

		this.error("expected equal to " + other + ", was " + this.subject);
	}

	@Override
	public final void isNotEqualTo(Object other)
	{
		if (!Objects.deepEquals(this.subject, other))
		{
			return;
		}

		this.error("expected not equal to " + other + ", was " + this.subject);
	}

	@Override
	public final void isInstanceOf(Class<?> clazz)
	{
		if (clazz.isInstance(this.subject))
		{
			return;
		}

		this.error("expected an instance of " + clazz + ", was " + this.subject.getClass());
	}

	@Override
	public final void isNotInstanceOf(Class<?> clazz)
	{
		if (!clazz.isInstance(this.subject))
		{
			return;
		}

		this.error("expected not an instance of " + clazz + ", was an instance of the same type");
	}

	@Override
	public final void isExactType(Class<?> clazz)
	{
		if (clazz == this.subject.getClass())
		{
			return;
		}

		this.error("expected an instance of exactly " + clazz + ", was an instance of " + this.subject.getClass());
	}

	@Override
	public final void isNotExactType(Class<?> clazz)
	{
		if (clazz != this.subject.getClass())
		{
			return;
		}

		this.error("expected not an instance of exactly " + clazz + ", was an instance of the same type");
	}

}