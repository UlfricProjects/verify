package com.ulfric.verify;

import java.util.Objects;
import java.util.function.Supplier;

abstract class VerificationTest {

	static final Object NULL = null;

	final void expect(String message, Runnable runnable)
	{
		try
		{
			runnable.run();

			throw new VerificationException("No exception was thrown");
		}
		catch (VerificationException exception)
		{
			if (Objects.equals(message, exception.getMessage()))
			{
				return;
			}

			throw new VerificationException(
					"Expected message \"" + message + "\" but was \"" + exception.getMessage() + "\"");
		}
	}

	final void nonNull(Object object)
	{
		if (object != null) return;

		throw new VerificationException();
	}

	final void notSame(Supplier<?> supplier)
	{
		this.notSame(supplier.get(), supplier.get());
	}

	final void notSame(Object primary, Object secondary)
	{
		if (primary != secondary) return;

		throw new VerificationException();
	}

}