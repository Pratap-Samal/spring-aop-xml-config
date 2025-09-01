package com.pratap.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class TransactionConcern {

	// advice method - around advice
	public Object transactionAround(ProceedingJoinPoint pjp) {
		Object ret = null;

		try {

			// before advice logic
			System.out.println("Transaction - Before advice");
			ret = pjp.proceed();
			
			// after returning advice logic
			System.out.println("Transaction - After returning advice");

		} catch (Throwable e) {
			// after throwing advice logic
			System.out.println("Transaction - After throwing advice");
			
		} finally {
			// after advice logic
			System.out.println("Transction - After advice");
		}

		return ret;
	}
}
