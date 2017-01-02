package com.ulfric.verify.verb;

import java.util.Collection;

public interface CollectionVerb<T> extends ObjectVerb<Collection<T>> {

	void contains(T value);

	void doesNotContain(T value);

}