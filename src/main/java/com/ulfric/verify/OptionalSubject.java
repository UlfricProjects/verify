package com.ulfric.verify;

import java.util.Optional;

public final class OptionalSubject extends Subject<Optional<?>> {

	OptionalSubject(Optional<?> subject)
	{
		super(subject);
	}

	public final void isPresent()
	{
		this.isNotNull();

		if (this.subject.isPresent()) return;

		this.fail("present");
	}

	public final void isEmpty()
	{
		this.isNotNull();

		if (!this.subject.isPresent()) return;

		this.fail("empty");
	}

}