package com.ulfric.verify;

import com.ulfric.verify.exception.Verification;
import com.ulfric.verify.verb.Verb;

public class Subject<T> extends Verification implements Verb<T> {

	protected Subject(T subject)
	{
		this.subject = subject;
	}

	final T subject;

	@Override
	public final T getSubject()
	{
		return this.subject;
	}

}