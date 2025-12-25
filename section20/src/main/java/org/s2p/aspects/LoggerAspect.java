package org.s2p.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
    private static final Log log = LogFactory.getLog(LoggerAspect.class);
    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* org.s2p.services.*.*(..))")
    void loggerAspect(ProceedingJoinPoint joinPoint) throws Throwable
    {
        Instant start = Instant.now();
        logger.info(joinPoint.getSignature().getName() + " Started At : " + start.toEpochMilli());

        joinPoint.proceed();

        Instant finish = Instant.now();
        logger.info(joinPoint.getSignature().getName() + " Finished At : " + finish.toEpochMilli());
        long duration = Duration.between(start,finish).toMillis();
        logger.info(joinPoint.getSignature().getName() + " Took Time : " + duration);
    }
}
