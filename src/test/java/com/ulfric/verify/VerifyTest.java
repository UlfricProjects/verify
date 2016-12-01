package com.ulfric.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Verify")
@RunWith(JUnitPlatform.class)
class VerifyTest extends VerificationTest {

	@Test
	void testVerifyStaticFactoryOnObjectReturnsNonNull()
	{
		this.nonNull(Verify.that(new Object()));
	}

	@Test
	void testVerifyStaticFactoryOnNullReturnsNonNull()
	{
		this.nonNull(Verify.that(new Object()));
	}

	@Test
	void testVerifyStaticFactoryOnObjectReturnsUnique()
	{
		this.notSame(() -> Verify.that(new Object()));
	}

	@Test
	void testVerifyStaticFactoryOnNullReturnsUnique()
	{
		this.notSame(() -> Verify.that(VerificationTest.NULL));
	}

}