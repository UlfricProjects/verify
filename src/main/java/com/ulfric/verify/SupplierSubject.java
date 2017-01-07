package com.ulfric.verify;

import org.apache.commons.lang3.builder.EqualsBuilder;

import com.ulfric.verify.function.CheckedSupplier;
import com.ulfric.verify.verb.SupplierVerb;

class SupplierSubject extends RunnableSubject<CheckedSupplier<?>> implements SupplierVerb {

	SupplierSubject(CheckedSupplier<?> producer)
	{
		super(producer);
	}

	@Override
	public final void suppliesNonUniqueValues()
	{
		if (this.getValue() == this.getValue())
		{
			return;
		}

		this.error("expected non-unique values to be supplied, was unique");
	}

	@Override
	public final void suppliesUniqueValues()
	{
		if (this.getValue() != this.getValue())
		{
			return;
		}

		this.error("expected unique values to be supplied, was non-unique");
	}

	@Override
	public final void valueIsNotNull()
	{
		Object subject = this.getValue();

		if (subject != null)
		{
			return;
		}

		this.error("expected not null, was " + subject);
	}

	@Override
	public final void valueIsNull()
	{
		Object subject = this.getValue();

		if (subject == null)
		{
			return;
		}

		this.error("expected null, was not null");
	}

	@Override
	public final void valueIsSameAs(Object other)
	{
		Object subject = this.getValue();

		if (subject == other)
		{
			return;
		}

		this.error("expected the same as " + other + ", was " + subject);
	}

	@Override
	public final void valueIsNotSameAs(Object other)
	{
		Object subject = this.getValue();

		if (subject != other)
		{
			return;
		}

		this.error("expected anything except for " + ", was the same");
	}

	@Override
	public final void valueIsEqualTo(Object other)
	{
		Object subject = this.getValue();

		if (EqualsBuilder.reflectionEquals(subject, other))
		{
			return;
		}

		this.error("expected equal to " + other + ", was " + subject);
	}

	@Override
	public final void valueIsNotEqualTo(Object other)
	{
		Object subject = this.getValue();

		if (!EqualsBuilder.reflectionEquals(subject, other))
		{
			return;
		}

		this.error("expected not equal to " + other + ", was " + subject);
	}

	@Override
	public final void valueIsInstanceOf(Class<?> clazz)
	{
		Object subject = this.getValue();

		if (clazz.isInstance(subject))
		{
			return;
		}

		this.error("expected an instance of " + clazz + ", was " + subject.getClass());
	}

	@Override
	public final void valueIsNotInstanceOf(Class<?> clazz)
	{
		Object subject = this.getValue();

		if (!clazz.isInstance(subject))
		{
			return;
		}

		this.error("expected not an instance of " + clazz + ", was an instance of the same type");
	}

	@Override
	public final void valueIsExactType(Class<?> clazz)
	{
		Object subject = this.getValue();

		if (clazz == subject.getClass())
		{
			return;
		}

		this.error("expected an instance of exactly " + clazz + ", was an instance of " + subject.getClass());
	}

	@Override
	public final void valueIsNotExactType(Class<?> clazz)
	{
		Object subject = this.getValue();

		if (clazz != subject.getClass())
		{
			return;
		}

		this.error("expected not an instance of exactly " + clazz + ", was an instance of the same type");
	}

	private Object getValue()
	{
		try
		{
			return this.subject.get();
		}
		catch (Throwable throwable)
		{
			throw new RuntimeException(throwable);
		}
	}

}