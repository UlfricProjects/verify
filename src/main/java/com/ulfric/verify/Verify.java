package com.ulfric.verify;

public class Verify<T> {

	public static ObjectSubject that(Object object)
	{
		return new ObjectSubject(object);
	}

	public static ExecutableSubject that(Executable executable)
	{
		return new ExecutableSubject(executable);
	}

	public static ThrowableSubject that(Throwable throwable)
	{
		return new ThrowableSubject(throwable);
	}

	private Verify() { }

}