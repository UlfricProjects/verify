package com.ulfric.verify;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Verify")
@RunWith(JUnitPlatform.class)
class VerifyTest {

	@Test
	void testVerifyStaticFactoryOnObjectReturnsNonNull()
	{
		Object sample = new Object();
		Assert.assertNotNull(Verify.that(sample));
	}

	@Test
	void testVerifyStaticFactoryOnNullReturnsNonNull()
	{
		Object sample = null;
		Assert.assertNotNull(Verify.that(sample));
	}

}