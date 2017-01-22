package com.ulfric.verify;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ulfric.verify.function.StreamVerb;

class StreamSubject extends ObjectSubject<Stream<?>> implements StreamVerb {

	StreamSubject(Stream<?> subject)
	{
		super(subject);
	}

	@Override
	public final void contains(Object value)
	{
		Set<?> subject = this.subject.collect(Collectors.toSet());
		if (subject.contains(value))
		{
			return;
		}

		this.error("Expected " + subject + " to contain " + value + ", but did not");
	}

	@Override
	public final void doesNotContain(Object value)
	{
		Set<?> subject = this.subject.collect(Collectors.toSet());
		if (!subject.contains(value))
		{
			return;
		}

		this.error("Expected " + subject + " to not contain " + value + ", but did");
	}

	@Override
	public final void isEmpty()
	{
		List<?> subject = this.subject.collect(Collectors.toList());
		if (subject.isEmpty())
		{
			return;
		}

		this.error("Expected " + subject + " to be empty");
	}

	@Override
	public final void isNotEmpty()
	{
		List<?> subject = this.subject.collect(Collectors.toList());
		if (!subject.isEmpty())
		{
			return;
		}

		this.error("Expected " + subject + " to not be empty");
	}

	@Override
	public final void isClosed()
	{
		try
		{
			List<?> subject = this.subject.collect(Collectors.toList());
			this.error("Expected " + subject + " to be closed");
		}
		catch (IllegalStateException exception)
		{
			
		}
	}

}