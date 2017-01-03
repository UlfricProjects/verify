package com.ulfric.verify.verb;

public interface SupplierVerb extends RunnableVerb {

	void suppliesNonUniqueValues();

	void suppliesUniqueValues();

}