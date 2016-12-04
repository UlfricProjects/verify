package com.ulfric.verify;

import com.ulfric.verify.verb.BooleanVerb;

class BooleanSubject extends ObjectSubject<Boolean> implements BooleanVerb {

	BooleanSubject(Boolean subject)
	{
		super(subject);
	}

	@Override
	public final void isTrue()
	{
		this.isNotNull();

		if (this.subject) return;

		this.error("expected true, was false");
	}

	@Override
	public final void isFalse()
	{
		this.isNotNull();

		if (!this.subject) return;

		this.error("expected false, was true");
	}

}