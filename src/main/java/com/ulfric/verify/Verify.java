package com.ulfric.verify;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Type;
import java.util.Optional;
import java.util.function.Supplier;

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

	public static OptionalSubject that(Optional<?> optional)
	{
		return new OptionalSubject(optional);
	}

	public static SupplierSubject that(Supplier<?> supplier)
	{
		return new SupplierSubject(supplier);
	}

	private Verify() { }

}