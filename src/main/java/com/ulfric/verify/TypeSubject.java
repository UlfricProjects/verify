package com.ulfric.verify;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

import com.ulfric.verify.verb.TypeVerb;

class TypeSubject<T extends Type> extends ObjectSubject<T> implements TypeVerb {

	TypeSubject(T subject)
	{
		super(subject);
	}

	@Override
	public final void isClass()
	{
		if (this.subject instanceof Class)
		{
			return;
		}

		this.error("expected a Class, got a " + this.subject.getClass());
	}

	@Override
	public final void isNotClass()
	{
		if (!(this.subject instanceof Class))
		{
			return;
		}

		this.error("expected anything but a Class, got a " + this.subject.getClass());
	}

	@Override
	public final void isParameterizedType()
	{
		if (this.subject instanceof ParameterizedType)
		{
			return;
		}

		this.error("expected a ParameterizedType, got a " + this.subject.getClass());
	}

	@Override
	public final void isNotParameterizedType()
	{
		if (!(this.subject instanceof ParameterizedType))
		{
			return;
		}

		this.error("expected anything but a ParameterizedType, got a " + this.subject.getClass());
	}

	@Override
	public final void isGenericArrayType()
	{
		if (this.subject instanceof GenericArrayType)
		{
			return;
		}

		this.error("expected a GenericArrayType, got a " + this.subject.getClass());
	}

	@Override
	public final void isNotGenericArrayType()
	{
		if (!(this.subject instanceof GenericArrayType))
		{
			return;
		}

		this.error("expected anything but a GenericArrayType, got a " + this.subject.getClass());
	}

	@Override
	public final void isWildcardType()
	{
		if (this.subject instanceof WildcardType)
		{
			return;
		}

		this.error("expected a WildcardType, got a " + this.subject.getClass());
	}

	@Override
	public final void isNotWildcardType()
	{
		if (!(this.subject instanceof WildcardType))
		{
			return;
		}

		this.error("expected anything but a WildcardType, got a " + this.subject.getClass());
	}

	@Override
	public final void isTypeVariable()
	{
		if (this.subject instanceof TypeVariable)
		{
			return;
		}

		this.error("expected a TypeVariable, got a " + this.subject.getClass());
	}

	@Override
	public final void isNotTypeVariable()
	{
		if (!(this.subject instanceof TypeVariable))
		{
			return;
		}

		this.error("expected anything but a TypeVariable, got a " + this.subject.getClass());
	}

}