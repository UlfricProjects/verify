package com.ulfric.verify;

import java.lang.reflect.AccessibleObject;

public final class AccessibleSubject extends Subject<AccessibleObject> {

	AccessibleSubject(AccessibleObject subject)
	{
		super(subject);
	}

	public final void isAccessible()
	{
		this.isNotNull();

		if (this.subject.isAccessible()) return;

		this.fail("accessible");
	}

	public final void isNotAccessible()
	{
		this.isNotNull();

		if (!this.subject.isAccessible()) return;

		this.fail("not accessible");
	}

}