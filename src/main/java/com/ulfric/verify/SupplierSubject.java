package com.ulfric.verify;

import com.ulfric.verify.function.CheckedSupplier;
import com.ulfric.verify.verb.SupplierVerb;

class SupplierSubject extends RunnableSubject<CheckedSupplier<?>> implements SupplierVerb {

	SupplierSubject(CheckedSupplier<?> producer)
	{
		super(producer);
	}

	@Override
	public final void suppliesNonUniqueValues()
	{
		this.isNotNull();

		try
		{
			if (this.subject.get() == this.subject.get()) return;
		}
		catch (Throwable e)
		{
			throw new RuntimeException(e);
		}

		this.error("expected non-unique values to be supplied, was unique");
	}

	@Override
	public final void suppliesUniqueValues()
	{
		this.isNotNull();

		try
		{
			if (this.subject.get() != this.subject.get()) return;
		}
		catch (Throwable e)
		{
			throw new RuntimeException(e);
		}

		this.error("expected unique values to be supplied, was non-unique");
	}

}