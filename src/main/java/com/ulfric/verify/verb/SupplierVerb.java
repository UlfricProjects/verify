package com.ulfric.verify.verb;

import com.ulfric.verify.function.CheckedSupplier;

public interface SupplierVerb<T> extends RunnableVerb<CheckedSupplier<T>> {

	void suppliesNonUniqueValues();

	void suppliesUniqueValues();

}