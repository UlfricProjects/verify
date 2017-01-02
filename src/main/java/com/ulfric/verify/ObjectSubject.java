package com.ulfric.verify;

import java.util.Objects;

import org.apache.commons.lang3.builder.EqualsBuilder;

import com.ulfric.verify.verb.ObjectVerb;

class ObjectSubject<T> extends Subject<T> implements ObjectVerb<T> {

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

		this.error("expected not null, was " + this.escape(this.subject));
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

		this.error("expected the same as " + this.escape(other) +
				", was " + this.escape(this.subject));
	}

	@Override
	public final void isNotSameAs(Object other)
	{
		if (this.subject != other)
		{
			return;
		}

		this.error("expected anything except for " + this.escape(other) +
				", was the same");
	}

	@Override
	public final void isEqualTo(Object other)
	{
		if (EqualsBuilder.reflectionEquals(this.subject, other))
		{
			return;
		}

		this.error("expected equal to " + this.escape(other) +
				", was " + this.escape(this.subject));
	}

	@Override
	public final void isNotEqualTo(Object other)
	{
		if (!EqualsBuilder.reflectionEquals(this.subject, other))
		{
			return;
		}

		this.error("expected not equal to " + this.escape(other) +
				", was " + this.escape(this.subject));
	}

	@Override
	public final void isInstanceOf(Class<?> clazz)
	{
		Objects.requireNonNull(clazz);

		if (clazz.isInstance(this.subject))
		{
			return;
		}

		this.error("expected an instance of " + this.escape(clazz) +
				", was " + this.escape(this.subject.getClass()));
	}

	@Override
	public final void isNotInstanceOf(Class<?> clazz)
	{
		Objects.requireNonNull(clazz);

		if (!clazz.isInstance(this.subject))
		{
			return;
		}

		this.error("expected not an instance of " + this.escape(clazz) +
				", was an instance of the same type");
	}

	@Override
	public final void isExactType(Class<?> clazz)
	{
		this.isNotNull();

		if (clazz == this.subject.getClass())
		{
			return;
		}

		this.error("expected an instance of exactly " + this.escape(clazz) +
				", was an instance of " + this.escape(this.subject.getClass()));
	}

	@Override
	public final void isNotExactType(Class<?> clazz)
	{
		if (clazz != this.subject.getClass())
		{
			return;
		}

		this.error("expected not an instance of exactly " + this.escape(clazz) +
				", was an instance of the same type");
	}

}