package com.ulfric.verify.verb;

public interface NumberVerb<N extends Number> extends ObjectVerb<N> {

	void isZero();

	void isNotZero();

}