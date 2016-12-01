package com.ulfric.verify;

@SuppressWarnings("serial")
public final class VerificationException extends RuntimeException {

	public VerificationException() { }

	public VerificationException(String message)
	{
		super(message);
	}

}