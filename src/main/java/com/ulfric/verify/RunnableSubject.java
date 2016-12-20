package com.ulfric.verify;

import com.ulfric.verify.exception.ExceptionMatcher;
import com.ulfric.verify.exception.VerificationException;
import com.ulfric.verify.function.CheckedRunnable;
import com.ulfric.verify.verb.RunnableVerb;

class RunnableSubject<T extends CheckedRunnable> extends ObjectSubject<T> implements RunnableVerb<T> {

	RunnableSubject(T subject)
	{
		super(subject);
	}

	@Override
	public final void doesThrow(Class<? extends Throwable> expected)
	{
		try
		{
			this.subject.run();
		}
		catch (Throwable thrown)
		{
			ExceptionMatcher.verifyWasCause(thrown, expected);
			return;
		}

		throw new VerificationException("No exception was thrown");
	}

	@Override
	public final void doesThrow(Class<? extends Throwable> expected, String message)
	{
		try
		{
			this.subject.run();
		}
		catch (Throwable thrown)
		{
			ExceptionMatcher.verifyWasCause(thrown, expected, message);
			return;
		}

		throw new VerificationException("No exception was thrown");
	}

	@Override
	public final void runsWithoutExceptions()
	{
		try
		{
			this.subject.run();
		}
		catch (Throwable thrown)
		{
			throw new VerificationException("An exception was thrown", thrown);
		}
	}

}