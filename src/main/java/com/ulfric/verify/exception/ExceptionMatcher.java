package com.ulfric.verify.exception;

import java.util.Objects;

public class ExceptionMatcher {

	public static void verifyWasCause(Throwable thrown, Class<? extends Throwable> expected)
	{
		if (thrown == null)
		{
			throw new VerificationException("Failed to find exception " + expected.getSimpleName());
		}

		if (expected.isInstance(thrown))
		{
			return;
		}

		ExceptionMatcher.verifyWasCause(thrown.getCause(), expected);
	}

	public static void verifyWasCause(Throwable thrown, Class<? extends Throwable> expected, String message)
	{
		if (thrown == null)
		{
			throw new VerificationException("Failed to find exception " + expected.getSimpleName());
		}

		if (expected.isInstance(thrown) && Objects.equals(thrown.getMessage(), message))
		{
			return;
		}

		ExceptionMatcher.verifyWasCause(thrown.getCause(), expected);
	}

	private ExceptionMatcher() { }

}