package com.ulfric.verify.verb;

import com.ulfric.verify.function.CheckedRunnable;

public interface RunnableVerb<T extends CheckedRunnable> extends ObjectVerb<T> {

	void doesThrow(Class<? extends Throwable> expected);

	void doesThrow(Class<? extends Throwable> expected, String message);

	void runsWithoutExceptions();

}