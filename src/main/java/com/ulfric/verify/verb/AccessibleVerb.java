package com.ulfric.verify.verb;

import java.lang.reflect.AccessibleObject;

public interface AccessibleVerb extends ObjectVerb<AccessibleObject> {

	void isAccessible();

	void isNotAccessible();

}