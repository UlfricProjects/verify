package com.ulfric.verify;

import java.util.Collection;

import org.junit.jupiter.api.Assertions;

import com.ulfric.verify.verb.CollectionVerb;

class CollectionSubject extends ObjectSubject<Collection<?>> implements CollectionVerb {

	CollectionSubject(Collection<?> subject)
	{
		super(subject);
	}

	@Override
	public final void contains(Object value)
	{
		if (this.subject.contains(value))
		{
			return;
		}

		Assertions.fail("Expected " + this.subject + " to contain " + value + ", but did not");
	}

	@Override
	public final void doesNotContain(Object value)
	{
		if (!this.subject.contains(value))
		{
			return;
		}

		Assertions.fail("Expected " + this.subject + " to not contain " + value + ", but did");
	}

	@Override
	public final void isEmpty()
	{
		if (this.subject.isEmpty())
		{
			return;
		}

		Assertions.fail("Expected " + this.subject + " to be empty");
	}

	@Override
	public final void isNotEmpty()
	{
		if (!this.subject.isEmpty())
		{
			return;
		}

		Assertions.fail("Expected " + this.subject + " to not be empty");
	}

	@Override
	public final void isSize(int size)
	{
		if (this.subject.size() == size)
		{
			return;
		}

		Assertions.fail("Expected " + this.subject + " to be size " + size);
	}

}