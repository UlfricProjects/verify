package com.ulfric.verify;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Assertions;

import com.ulfric.verify.verb.MemberVerb;

class MemberSubject extends ObjectSubject<Member> implements MemberVerb {

	MemberSubject(Member subject)
	{
		super(subject);
	}

	@Override
	public final void isFinal()
	{
		if (Modifier.isFinal(this.subject.getModifiers()))
		{
			return;
		}

		Assertions.fail("expected a final member, was not final");
	}

	@Override
	public final void isPublic()
	{
		if (Modifier.isPublic(this.subject.getModifiers()))
		{
			return;
		}

		Assertions.fail("expected a public member, was not public");
	}

	@Override
	public final void isPrivate()
	{
		if (Modifier.isPrivate(this.subject.getModifiers()))
		{
			return;
		}

		Assertions.fail("expected a private member, was not private");
	}

}