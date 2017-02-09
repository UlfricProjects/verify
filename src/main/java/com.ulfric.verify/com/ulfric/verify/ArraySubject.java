package com.ulfric.verify;

import org.apache.commons.lang3.ArrayUtils;

import com.ulfric.verify.verb.CollectionVerb;

class ArraySubject extends ObjectSubject<Object[]> implements CollectionVerb {

	ArraySubject(Object[] subject)
	{
		super(subject);
	}

	@Override
	public final void contains(Object value)
	{
		if (ArrayUtils.contains(this.subject, value))
		{
			return;
		}

		this.error("Expected " + this.subject + " to contain " + value + ", but did not");
	}

	@Override
	public final void doesNotContain(Object value)
	{
		if (!ArrayUtils.contains(this.subject, value))
		{
			return;
		}

		this.error("Expected " + this.subject + " to not contain " + value + ", but did");
	}

	@Override
	public final void isEmpty()
	{
		if (ArrayUtils.isEmpty(this.subject))
		{
			return;
		}

		this.error("Expected " + this.subject + " to be empty");
	}

	@Override
	public final void isNotEmpty()
	{
		if (ArrayUtils.isNotEmpty(this.subject))
		{
			return;
		}

		this.error("Expected " + this.subject + " to not be empty");
	}

}