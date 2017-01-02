package com.ulfric.verify;

import java.util.Collection;

import com.ulfric.verify.verb.CollectionVerb;

class CollectionSubject<T> extends ObjectSubject<Collection<T>> implements CollectionVerb<T> {

	CollectionSubject(Collection<T> subject)
	{
		super(subject);
	}

	@Override
	public final void contains(T value)
	{
		if (this.subject.contains(value))
		{
			return;
		}

		this.error("Expected " + this.subject + " to contain " + value + ", but did not");
	}

	@Override
	public final void doesNotContain(T value)
	{
		if (!this.subject.contains(value))
		{
			return;
		}

		this.error("Expected " + this.subject + " to not contain " + value + ", but did");
	}

	@Override
	public final void isEmpty()
	{
		if (this.subject.isEmpty())
		{
			return;
		}

		this.error("Expected " + this.subject + " to be empty");
	}

	@Override
	public final void isNotEmpty()
	{
		if (!this.subject.isEmpty())
		{
			return;
		}

		this.error("Expected " + this.subject + " to not be empty");
	}

}