package com.ulfric.verify.function;

public interface CheckedSupplier<T> extends CheckedRunnable {

	@Override
	default void run() throws Throwable
	{
		this.get();
	}

	T get() throws Throwable;

}