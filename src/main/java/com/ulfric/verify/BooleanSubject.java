package com.ulfric.verify;

public final class BooleanSubject extends Subject<Boolean> {

	BooleanSubject(boolean subject)
	{
		super(subject);
	}

	public final void isTrue()
	{
		this.isNotNull();

		if (this.subject) return;

		this.fail("true");
	}

	public final void isFalse()
	{
		this.isNotNull();

		if (!this.subject) return;

		this.fail("false");
	}

}