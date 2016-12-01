package com.ulfric.verify;

public final class ExecutableSubject extends Subject<Executable> {

	ExecutableSubject(Executable subject)
	{
		super(subject);
	}

	public ThrowableSubject rescue()
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

	public void doesThrow(Class<? extends Throwable> throwable)
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

	public void doesThrow(Class<? extends Throwable> throwable, String message)
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