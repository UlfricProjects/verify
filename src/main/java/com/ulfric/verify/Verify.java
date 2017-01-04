package com.ulfric.verify;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Optional;

import com.ulfric.verify.function.CheckedRunnable;
import com.ulfric.verify.function.CheckedSupplier;
import com.ulfric.verify.verb.BooleanVerb;
import com.ulfric.verify.verb.ClassVerb;
import com.ulfric.verify.verb.CollectionVerb;
import com.ulfric.verify.verb.MemberVerb;
import com.ulfric.verify.verb.NumberVerb;
import com.ulfric.verify.verb.ObjectVerb;
import com.ulfric.verify.verb.OptionalVerb;
import com.ulfric.verify.verb.RunnableVerb;
import com.ulfric.verify.verb.SupplierVerb;
import com.ulfric.verify.verb.ThrowableVerb;
import com.ulfric.verify.verb.TypeVerb;

public enum Verify {

	;

	public static ObjectVerb that(Object subject)
	{
		return new ObjectSubject<>(subject);
	}

	public static BooleanVerb that(Boolean subject)
	{
		return new BooleanSubject(subject);
	}

	public static NumberVerb that(Number subject)
	{
		return new NumberSubject(subject);
	}

	public static TypeVerb that(Type subject)
	{
		return new TypeSubject<>(subject);
	}

	public static ClassVerb that(Class<?> subject)
	{
		return new ClassSubject(subject);
	}

	public static RunnableVerb that(CheckedRunnable subject)
	{
		return new RunnableSubject<>(subject);
	}

	public static SupplierVerb that(CheckedSupplier<?> subject)
	{
		return new SupplierSubject(subject);
	}

	public static ThrowableVerb that(Throwable subject)
	{
		return new ThrowableSubject(subject);
	}

	public static OptionalVerb that(Optional<?> subject)
	{
		return new OptionalSubject(subject);
	}

	public static MemberVerb that(Member subject)
	{
		return new MemberSubject(subject);
	}

	public static CollectionVerb that(Collection<?> subject)
	{
		return new CollectionSubject(subject);
	}

	public static CollectionVerb that(Object[] subject)
	{
		return new ArraySubject(subject);
	}

}