package com.ulfric.verify;

public class Subject<T> {

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