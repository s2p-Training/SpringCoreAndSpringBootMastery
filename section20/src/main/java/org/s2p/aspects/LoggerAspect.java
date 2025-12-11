package org.s2p.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect
{
    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution (* org.s2p.services.* .*(..))")
    void loggerAspect(ProceedingJoinPoint joinPoint) throws Throwable
    {
        Instant start = Instant.now();
        logger.info( joinPoint.getSignature().getName() + " method started at : " + start.toEpochMilli());

        joinPoint.proceed();

        Instant finish = Instant.now();
        logger.info( joinPoint.getSignature().getName() + " method terminated at : " + finish.toEpochMilli());
        long duration  = Duration.between(start,finish).toMillis();
        logger.info(joinPoint.getSignature().getName() +  " method took : " + duration);
    }
}
