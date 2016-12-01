package com.ulfric.verify;

import java.util.Objects;

public final class ThrowableSubject extends Subject<Throwable> {

	ThrowableSubject(Throwable subject)
	{
		super(subject);
	}

	public void matches(Class<? extends Throwable> throwable)
	{
		this.isNotNull();

		if (throwable.isAssignableFrom(this.subject.getClass()))
		{
			return;
		}

		this.fail("an instance of " + throwable);
	}

	public void matches(Class<? extends Throwable> throwable, String message)
	{
		this.isNotNull();

		if (throwable.isAssignableFrom(this.subject.getClass()))
		{
			return;
		}

		if (Objects.equals(this.subject.getMessage(), message))
		{
			return;
		}

		this.fail(throwable + " caused by: " + message);
	}

	public void wasCausedBy(Class<? extends Throwable> cause)
	{
		if (this.isValidException(this.subject, cause))
		{
			return;
		}

		this.fail(cause);
	}

	public void wasCausedBy(Class<? extends Throwable> cause, String message)
	{
		if (this.isValidException(this.subject, cause, message))
		{
			return;
		}

		this.fail(cause + " caused by: " + message);
	}

}