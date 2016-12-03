package com.ulfric.verify;

public final class BooleanSubject extends Subject<Boolean> {

	BooleanSubject(Boolean subject)
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

	public BooleanSubject or(boolean or)
	{
		this.isNotNull();

		boolean thiz = this.subject;

		if (thiz == or)
		{
			return this;
		}

		return new BooleanSubject(thiz || or);
	}

	public BooleanSubject and(boolean and)
	{
		this.isNotNull();

		boolean thiz = this.subject;

		if (thiz == and)
		{
			return this;
		}

		return new BooleanSubject(thiz && and);
	}

}