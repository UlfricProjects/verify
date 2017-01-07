package com.ulfric.verify.verb;

public interface SupplierVerb extends RunnableVerb {

	void suppliesNonUniqueValues();

	void suppliesUniqueValues();

	void valueIsNotNull();

	void valueIsNull();

	void valueIsSameAs(Object other);

	void valueIsNotSameAs(Object other);

	void valueIsEqualTo(Object other);

	void valueIsNotEqualTo(Object other);

	void valueIsInstanceOf(Class<?> clazz);

	void valueIsNotInstanceOf(Class<?> clazz);

	void valueIsExactType(Class<?> clazz);

	void valueIsNotExactType(Class<?> clazz);


}