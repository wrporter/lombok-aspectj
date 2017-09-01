package com.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class YourAspect
{
    @Around("@annotation(com.test.YourAnnotation) && execution(* *(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable
    {
        Object returnObject = null;
        System.out.println("Aspect Before");
        try
        {
            returnObject = joinPoint.proceed();
        }
        catch (Exception ex)
        {
            System.out.println("Aspect Catch: " + ex.getMessage());
        }
        finally
        {
            System.out.println("Aspect After");
        }
        return returnObject;
    }
}