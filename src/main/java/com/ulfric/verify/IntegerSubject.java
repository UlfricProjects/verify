package com.ulfric.verify;

import com.ulfric.verify.verb.IntegerVerb;

class IntegerSubject extends ObjectSubject<Integer> implements IntegerVerb {

	IntegerSubject(Integer subject)
	{
		super(subject);
	}

	@Override
	public final void isNotZero()
	{
		this.isNotNull();

		if (this.subject.intValue() != 0) return;

		this.error("Expected non-zero, but was " + this.escape(this.subject));
	}

	@Override
	public final void isZero()
	{
		this.isNotNull();

		if (this.subject.intValue() != 0) return;

		this.error("Expected zero, but was " + this.escape(this.subject));
	}

}