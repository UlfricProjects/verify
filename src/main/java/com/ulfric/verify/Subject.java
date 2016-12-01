package com.ulfric.verify;

import java.util.Objects;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Subject<T> {

	protected Subject(T subject)
	{
		this.subject = subject;
	}

	final T subject;

	public final void isNotNull()
	{
		if (this.subject != null) return;

		this.fail("anything but null");
	}

	public final void isNull()
	{
		if (this.subject == null) return;

		this.fail(null);
	}

	public final void isSame(Object other)
	{
		if (this.subject == other) return;

		this.fail(other);
	}

	public final void isNotSame(Object other)
	{
		if (this.subject != other) return;

		this.fail("anything but " + other);
	}

	public final void isEqual(Object other)
	{
		if (EqualsBuilder.reflectionEquals(this.subject, other)) return;

		this.fail(other);
	}

	public final void isNotEqual(Object other)
	{
		if (!EqualsBuilder.reflectionEquals(this.subject, other)) return;

		this.fail("anything but " + other);
	}

	public final void isInstanceOf(Class<?> clazz)
	{
		Objects.requireNonNull(clazz);

		if (clazz.isInstance(this.subject)) return;

		this.fail("an instance of " + clazz);
	}

	public final void isNotInstanceOf(Class<?> clazz)
	{
		Objects.requireNonNull(clazz);

		if (!clazz.isInstance(this.subject)) return;

		this.fail("not an instance of " + clazz);
	}

	public final void isExactType(Class<?> clazz)
	{
		this.isNotNull();

		if (clazz == this.subject.getClass()) return;

		this.fail("an instance of exactly " + clazz);
	}

	public final void isNotExactType(Class<?> clazz)
	{
		if (clazz != this.subject.getClass()) return;

		this.fail("not an instance of exactly " + clazz);
	}

	final boolean isValidException(Throwable thrown, Class<?> expected)
	{
		if (thrown == null)
		{
			return false;
		}

		if (expected.isInstance(thrown))
		{
			return true;
		}

		return this.isValidException(thrown.getCause(), expected);
	}

	final boolean isValidException(Throwable thrown, Class<?> expected, String message)
	{
		if (thrown == null)
		{
			return false;
		}

		if (expected.isInstance(thrown) && Objects.equals(thrown.getMessage(), message))
		{
			return true;
		}

		return this.isValidException(thrown.getCause(), expected);
	}

	final void fail(Object not)
	{
		this.fail(String.valueOf(not));
	}

	final void fail(String not)
	{
		throw new VerificationException("Subject was " + this.subject + ", expected " + not);
	}

}