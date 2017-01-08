package com.ulfric.verify;

import com.ulfric.verify.verb.NumberVerb;

class NumberSubject extends ObjectSubject<Number> implements NumberVerb {

	NumberSubject(Number subject)
	{
		super(subject);
	}

	@Override
	public final void isNotZero()
	{
		if (this.subject.intValue() != 0)
		{
			return;
		}

		this.error("Expected non-zero, but was " + this.subject);
	}

	@Override
	public final void isZero()
	{
		if (this.subject.intValue() == 0)
		{
			return;
		}

		this.error("Expected zero, but was " + this.subject);
	}

}