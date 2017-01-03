package com.ulfric.verify.verb;

public interface ThrowableVerb extends ObjectVerb {

	void wasCausedBy(Class<? extends Throwable> thrown);

	void wasCausedBy(Class<? extends Throwable> thrown, String message);

}