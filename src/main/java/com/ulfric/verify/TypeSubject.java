package com.ulfric.verify;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

public class TypeSubject<T extends Type> extends Subject<T> {

	protected TypeSubject(T subject)
	{
		super(subject);
	}

	public final void isClass()
	{
		if (this.subject instanceof Class) return;

		this.fail("any Class");
	}

	public final void isNotClass()
	{
		if (!(this.subject instanceof Class)) return;

		this.fail("anything other than a Class");
	}

	public final void isParameterizedType()
	{
		if (this.subject instanceof ParameterizedType) return;

		this.fail("a ParameterizedType");
	}

	public final void isNotParameterizedType()
	{
		if (!(this.subject instanceof ParameterizedType)) return;

		this.fail("anything other than a ParameterizedType");
	}

	public final void isGenericArrayType()
	{
		if (this.subject instanceof GenericArrayType) return;

		this.fail("a GenericArrayType");
	}

	public final void isNotGenericArrayType()
	{
		if (!(this.subject instanceof GenericArrayType)) return;

		this.fail("anything other than a GenericArrayType");
	}

	public final void isWildcardType()
	{
		if (this.subject instanceof WildcardType) return;

		this.fail("a WildcardType");
	}

	public final void isNotWildcardType()
	{
		if (!(this.subject instanceof WildcardType)) return;

		this.fail("anything other than a WildcardType");
	}

	public final void isTypeVariable()
	{
		if (this.subject instanceof TypeVariable) return;

		this.fail("a TypeVariable");
	}

	public final void isNotTypeVariable()
	{
		if (!(this.subject instanceof TypeVariable)) return;

		this.fail("anything other than a TypeVariable");
	}

}