package com.ulfric.verify;

public final class ProducerSubject extends ExecutableSubject<Producer> {

	ProducerSubject(Producer producer)
	{
		super(producer);
	}

	public final void producesNonUniqueValues()
	{
		this.isNotNull();

		try
		{
			if (this.subject.produce() == this.subject.produce()) return;
		}
		catch (Exception exception)
		{
			throw new RuntimeException(exception);
		}

		this.fail("non-unique");
	}

	public final void producesUniqueValues()
	{
		this.isNotNull();

		try
		{
			if (this.subject.produce() != this.subject.produce()) return;
		}
		catch (Exception exception)
		{
			throw new RuntimeException(exception);
		}

		this.fail("unique");
	}

}