package com.pratap.aspect;

// modularization of the logging concern
public class LoggingConcern {

	// advice method
	public void logBefore() {
		System.out.println("logging before advice");
	}
	
	// advice method
	public void logAfterReturning() {
		System.out.println("logging after returning advice");
	}
	
	// advice method
	public void logAfterThrowing() {
		System.out.println("logging after throwing advice");
	}
	
	// advice method
	public void logAfter() {
		System.out.println("logging after advice");
	}
	
}
