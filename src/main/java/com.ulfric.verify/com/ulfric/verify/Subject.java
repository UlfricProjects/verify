package com.ulfric.verify;

import com.ulfric.verify.exception.Verification;

public class Subject<T> extends Verification {

	protected Subject(T subject)
	{
		this.subject = subject;
	}

	final T subject;

	public final T getSubject()
	{
		return this.subject;
	}

}