package com.ulfric.verify.verb;

public interface RunnableVerb extends ObjectVerb {

	void doesThrow(Class<? extends Throwable> expected);

	void doesThrow(Class<? extends Throwable> expected, String message);

	void runsWithoutExceptions();

}