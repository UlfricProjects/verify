package com.ulfric.verify;

@FunctionalInterface
public interface Executable {

	void execute() throws Exception;

	static Executable fromRunnable(Runnable runnable)
	{
		return runnable::run;
	}

}