package com.ulfric.verify.exception;

public class Verification {

	protected final String escape(Object message)
	{
		return '\"' + String.valueOf(message) + '\"';
	}

	protected final void error(String message)
	{
		throw new VerificationException(message);
	}

}