package com.ulfric.verify;

import java.lang.reflect.AccessibleObject;

import com.ulfric.verify.verb.AccessibleVerb;

class AccessibleSubject extends ObjectSubject<AccessibleObject> implements AccessibleVerb {

	AccessibleSubject(AccessibleObject subject)
	{
		super(subject);
	}

	@Override
	public final void isAccessible()
	{
		this.isNotNull();

		if (this.subject.isAccessible()) return;

		this.error("expected subject to be accessible, was not accessible");
	}

	@Override
	public final void isNotAccessible()
	{
		this.isNotNull();

		if (!this.subject.isAccessible()) return;

		this.error("expected subject to not be accessible, was accessible");
	}

}