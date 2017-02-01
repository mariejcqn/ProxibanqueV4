package com.proxibanque.interception;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class Logging {

	public Logging() {
		super();
	}

	//détaille les entrées sorties des méthodes utilisées
	//@Around("execution(* com.mkyong.user.bo.UserBo.*(..))")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		String name = pjp.getSignature().toLongString();
		Object[] args = pjp.getArgs();
		System.out.println("AVANT APPEL DE " + name);
		for (int i = 0; i < args.length; i++) {
			System.out.println("arg n"+i+": "+args[i]);
		}
		Object retVal = pjp.proceed();
		System.out.println("APRES, RESULTAT = " + retVal);
		return retVal;
	}

}
