package com.ulfric.verify;

import java.util.Optional;

import com.ulfric.verify.verb.OptionalVerb;

class OptionalSubject<T> extends ObjectSubject<Optional<T>> implements OptionalVerb<T> {

	OptionalSubject(Optional<T> subject)
	{
		super(subject);
	}

	@Override
	public final void isPresent()
	{
		this.isNotNull();

		if (this.subject.isPresent()) return;

		this.error("expected subject to be present, was not present");
	}

	@Override
	public final void isNotPresent()
	{
		this.isNotNull();

		if (!this.subject.isPresent()) return;

		this.error("expected subject to not be present, was present");
	}

}