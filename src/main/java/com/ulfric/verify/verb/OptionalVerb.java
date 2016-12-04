package com.ulfric.verify.verb;

import java.util.Optional;

public interface OptionalVerb<T> extends ObjectVerb<Optional<T>> {

	void isPresent();

	void isNotPresent();

}