package com.ulfric.verify;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Optional;

import com.ulfric.verify.function.CheckedRunnable;
import com.ulfric.verify.function.CheckedSupplier;
import com.ulfric.verify.verb.BooleanVerb;
import com.ulfric.verify.verb.ClassVerb;
import com.ulfric.verify.verb.IntegerVerb;
import com.ulfric.verify.verb.MemberVerb;
import com.ulfric.verify.verb.ObjectVerb;
import com.ulfric.verify.verb.OptionalVerb;
import com.ulfric.verify.verb.RunnableVerb;
import com.ulfric.verify.verb.SupplierVerb;
import com.ulfric.verify.verb.ThrowableVerb;
import com.ulfric.verify.verb.TypeVerb;

public class Verify {

	public static ObjectVerb<Object> that(Object object)
	{
		return new ObjectSubject<>(object);
	}

	public static BooleanVerb that(Boolean bool)
	{
		return new BooleanSubject(bool);
	}

	public static IntegerVerb that(Integer integer)
	{
		return new IntegerSubject(integer);
	}

	public static TypeVerb<Type> that(Type type)
	{
		return new TypeSubject<>(type);
	}

	public static ClassVerb that(Class<?> clazz)
	{
		return new ClassSubject(clazz);
	}

	public static RunnableVerb<CheckedRunnable> that(CheckedRunnable executable)
	{
		return new RunnableSubject<>(executable);
	}

	public static <T> SupplierVerb<T> that(CheckedSupplier<T> producer)
	{
		return new SupplierSubject<>(producer);
	}

	public static ThrowableVerb that(Throwable throwable)
	{
		return new ThrowableSubject(throwable);
	}

	public static <T> OptionalVerb<T> that(Optional<T> optional)
	{
		return new OptionalSubject<>(optional);
	}

	public static MemberVerb<Member> that(Member member)
	{
		return new MemberSubject<>(member);
	}

	private Verify() { }

}