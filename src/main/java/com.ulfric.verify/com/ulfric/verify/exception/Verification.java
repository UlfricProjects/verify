package com.ulfric.verify.exception;

public class Verification {

	protected final void error(String message)
	{
		throw new VerificationException(message);
	}

}