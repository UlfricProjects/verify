package com.ulfric.verify;

import java.util.function.Supplier;

public final class SupplierSubject extends Subject<Supplier<?>> {

	SupplierSubject(Supplier<?> supplier)
	{
		super(supplier);
	}

	public final void producesNonUniqueValues()
	{
		this.isNotNull();

		if (this.subject.get() == this.subject.get()) return;

		this.fail("non-unique");
	}

	public final void producesUniqueValues()
	{
		this.isNotNull();

		if (this.subject.get() != this.subject.get()) return;

		this.fail("unique");
	}

}