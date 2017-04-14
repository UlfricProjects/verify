package com.ulfric.verify;

import org.junit.jupiter.api.Assertions;

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

		Assertions.fail("Expected non-zero, but was " + this.subject);
	}

	@Override
	public final void isZero()
	{
		if (this.subject.intValue() == 0)
		{
			return;
		}

		Assertions.fail("Expected zero, but was " + this.subject);
	}

}