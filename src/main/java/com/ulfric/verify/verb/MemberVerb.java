package com.ulfric.verify.verb;

import java.lang.reflect.Member;

public interface MemberVerb<T extends Member> extends ObjectVerb<T> {

	void isFinal();

	void isPublic();

	void isPrivate();

}