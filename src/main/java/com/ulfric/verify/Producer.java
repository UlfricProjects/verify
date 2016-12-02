package com.ulfric.verify;

public interface Producer extends Executable {

	@Override
	default void execute() throws Exception
	{
		this.produce();
	}

	Object produce() throws Exception;

}