package com.ulfric.verify;

import org.junit.jupiter.api.Assertions;

import com.ulfric.verify.verb.BooleanVerb;

class BooleanSubject extends ObjectSubject<Boolean> implements BooleanVerb {

	BooleanSubject(Boolean subject)
	{
		super(subject);
	}

	@Override
	public final void isTrue()
	{
		if (this.subject)
		{
			return;
		}

		Assertions.fail("expected true, was false");
	}

	@Override
	public final void isFalse()
	{
		if (!this.subject)
		{
			return;
		}

		Assertions.fail("expected false, was true");
	}

}