package com.ulfric.verify;

public class ExecutableSubject<T extends Executable> extends Subject<T> {

	ExecutableSubject(T subject)
	{
		super(subject);
	}

	public final ThrowableSubject rescue()
	{
		try
		{
			this.subject.execute();
		}
		catch (Throwable thrown)
		{
			return Verify.that(thrown);
		}

		throw new VerificationException();
	}

	public final void doesThrow(Class<? extends Throwable> throwable)
	{
		try
		{
			this.subject.execute();
		}
		catch (Throwable thrown)
		{
			if (this.isValidException(thrown, throwable))
			{
				return;
			}
		}

		throw new VerificationException();
	}

	public final void doesThrow(Class<? extends Throwable> throwable, String message)
	{
		try
		{
			this.subject.execute();
		}
		catch (Throwable thrown)
		{
			if (this.isValidException(thrown, throwable, message))
			{
				return;
			}
		}

		throw new VerificationException();
	}

}