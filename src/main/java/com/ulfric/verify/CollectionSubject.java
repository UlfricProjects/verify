package com.ulfric.verify;

import java.util.Collection;

import com.ulfric.verify.verb.CollectionVerb;

class CollectionSubject<T> extends ObjectSubject<Collection<T>> implements CollectionVerb<T> {

	CollectionSubject(Collection<T> subject)
	{
		super(subject);
	}

	@Override
	public void contains(T value)
	{
		if (this.subject.contains(value))
		{
			return;
		}

		this.error("Expected " + this.subject + " to contain " + value + ", but did not");
	}

	@Override
	public void doesNotContain(T value)
	{
		if (!this.subject.contains(value))
		{
			return;
		}

		this.error("Expected " + this.subject + " to not contain " + value + ", but did");
	}

}