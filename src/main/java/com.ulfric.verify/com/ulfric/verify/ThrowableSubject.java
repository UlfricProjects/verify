package com.ulfric.verify;

import com.ulfric.verify.exception.ExceptionMatcher;
import com.ulfric.verify.verb.ThrowableVerb;

class ThrowableSubject extends ObjectSubject<Throwable> implements ThrowableVerb {

	ThrowableSubject(Throwable subject)
	{
		super(subject);
	}

	@Override
	public final void wasCausedBy(Class<? extends Throwable> cause)
	{
		ExceptionMatcher.verifyWasCause(this.subject, cause);
	}

	@Override
	public final void wasCausedBy(Class<? extends Throwable> cause, String message)
	{
		ExceptionMatcher.verifyWasCause(this.subject, cause, message);
	}

}