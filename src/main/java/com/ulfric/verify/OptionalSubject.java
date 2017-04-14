package com.ulfric.verify;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;

import com.ulfric.verify.verb.OptionalVerb;

class OptionalSubject extends ObjectSubject<Optional<?>> implements OptionalVerb {

	OptionalSubject(Optional<?> subject)
	{
		super(subject);
	}

	@Override
	public final void isPresent()
	{
		if (this.subject.isPresent())
		{
			return;
		}

		Assertions.fail("expected subject to be present, was not present");
	}

	@Override
	public final void isNotPresent()
	{
		if (!this.subject.isPresent())
		{
			return;
		}

		Assertions.fail("expected subject to not be present, was present");
	}

}