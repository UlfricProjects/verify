package com.ulfric.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Object Subject")
@RunWith(JUnitPlatform.class)
class ObjectSubjectTest extends VerificationTest {

	@Test
	void testNotNullOnNull()
	{
		this.expect("Subject was null, expected anything but null", () -> Verify.that(VerificationTest.NULL).isNotNull());
	}

	@Test
	void testNotNullOnObject()
	{
		Verify.that(Example.ONE).isNotNull();
	}

	@Test
	void testIsNullOnNull()
	{
		Verify.that(VerificationTest.NULL).isNull();
	}

	@Test
	void testIsNullOnObject()
	{
		this.expect("Subject was 1, expected null", () -> Verify.that(Example.ONE).isNull());
	}

	@Test
	void testIsSameOnDifferentObjects()
	{
		this.expect("Subject was 1, expected 2", () -> Verify.that(Example.ONE).isSameAs(Example.TWO));
	}

	@Test
	void testIsSameOnDifferentObjectsThatEquals()
	{
		this.expect("Subject was 1, expected 1", () -> Verify.that(Example.ONE).isSameAs(Example.ONE.clone()));
	}

	@Test
	void testIsSameOnSameObject()
	{
		Verify.that(Example.ONE).isSameAs(Example.ONE);
	}

	@Test
	void testIsNotSameOnSameObject()
	{
		this.expect("Subject was 1, expected anything but 1", () -> Verify.that(Example.ONE).isNotSameAs(Example.ONE));
	}

	@Test
	void testIsNotSameOnDifferentThings()
	{
		Verify.that(Example.ONE).isNotSameAs(Example.TWO);
	}

	@Test
	void testIsNotSameOnDifferentThingsThatEquals()
	{
		Verify.that(Example.ONE).isNotSameAs(Example.ONE.clone());
	}

	static final class Example implements Cloneable
	{
		static final Example ONE = new Example(1);
		static final Example TWO = new Example(2);

		private Example(int value)
		{
			this.value = value;
		}

		private final int value;

		@Override
		public boolean equals(Object other)
		{
			if (other == this) return true;

			if (!(other instanceof Example)) return false;

			Example o = (Example) other;

			return this.value == o.value;
		}

		@Override
		public int hashCode()
		{
			return super.hashCode();
		}

		@Override
		public String toString()
		{
			return String.valueOf(this.value);
		}

		@Override
		public Example clone()
		{
			try
			{
				return (Example) super.clone();
			}
			catch (CloneNotSupportedException e)
			{
				throw new RuntimeException(e);
			}
		}
	}

}