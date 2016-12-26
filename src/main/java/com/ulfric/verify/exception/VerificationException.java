package com.ulfric.verify.exception;

@SuppressWarnings("serial")
public final class VerificationException extends RuntimeException {

	public VerificationException(String message)
	{
		super(message);
	}

	public VerificationException(String message, Throwable cause)
	{
		super(message, cause);
	}

}