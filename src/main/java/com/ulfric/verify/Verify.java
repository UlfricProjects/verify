package com.ulfric.verify;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Type;

public class Verify<T> {

	public static ObjectSubject that(Object object)
	{
		return new ObjectSubject(object);
	}

	public static ClassSubject that(Class<?> clazz)
	{
		return new ClassSubject(clazz);
	}

	public static <T extends Type> TypeSubject<T> that(T type)
	{
		return new TypeSubject<>(type);
	}

	public static ExecutableSubject that(Executable executable)
	{
		return new ExecutableSubject(executable);
	}

	public static ThrowableSubject that(Throwable throwable)
	{
		return new ThrowableSubject(throwable);
	}

	public static AccessibleSubject that(AccessibleObject accessible)
	{
		return new AccessibleSubject(accessible);
	}

	private Verify() { }

}