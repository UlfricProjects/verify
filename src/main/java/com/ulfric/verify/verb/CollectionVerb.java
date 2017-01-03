package com.ulfric.verify.verb;

public interface CollectionVerb extends ObjectVerb {

	void contains(Object value);

	void doesNotContain(Object value);

	void isEmpty();

	void isNotEmpty();

}