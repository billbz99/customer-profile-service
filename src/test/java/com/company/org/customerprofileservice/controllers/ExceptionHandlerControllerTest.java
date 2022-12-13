package com.company.org.customerprofileservice.controllers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;

class ExceptionHandlerControllerTest {
    /**
     * Method under test: {@link ExceptionHandlerController#exceptionHandler(ConstraintViolationException)}
     */
    @Test
    void testExceptionHandler() {
        ExceptionHandlerController exceptionHandlerController = new ExceptionHandlerController();
        assertTrue(
                exceptionHandlerController.exceptionHandler(new ConstraintViolationException(new HashSet<>())).isEmpty());
    }

    /**
     * Method under test: {@link ExceptionHandlerController#exceptionHandler(ConstraintViolationException)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExceptionHandler2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "javax.validation.ConstraintViolation.getPropertyPath()" because "x" is null
        //       at com.company.org.customerprofileservice.controllers.ExceptionHandlerController.lambda$exceptionHandler$1(ExceptionHandlerController.java:34)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.HashMap$KeySpliterator.forEachRemaining(HashMap.java:1707)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
        //       at com.company.org.customerprofileservice.controllers.ExceptionHandlerController.exceptionHandler(ExceptionHandlerController.java:34)
        //   See https://diff.blue/R013 to resolve this issue.

        ExceptionHandlerController exceptionHandlerController = new ExceptionHandlerController();

        HashSet<ConstraintViolation<?>> constraintViolationSet = new HashSet<>();
        constraintViolationSet.add(null);
        exceptionHandlerController.exceptionHandler(new ConstraintViolationException(constraintViolationSet));
    }

    /**
     * Method under test: {@link ExceptionHandlerController#exceptionHandler(ConstraintViolationException)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExceptionHandler3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "javax.validation.ConstraintViolationException.getConstraintViolations()" because "e" is null
        //       at com.company.org.customerprofileservice.controllers.ExceptionHandlerController.exceptionHandler(ExceptionHandlerController.java:33)
        //   See https://diff.blue/R013 to resolve this issue.

        (new ExceptionHandlerController()).exceptionHandler((ConstraintViolationException) null);
    }

    /**
     * Method under test: {@link ExceptionHandlerController#exceptionHandler(MethodArgumentNotValidException)}
     */
    @Test
    void testExceptionHandler4() {
        ExceptionHandlerController exceptionHandlerController = new ExceptionHandlerController();
        assertTrue(exceptionHandlerController
                .exceptionHandler(new MethodArgumentNotValidException(null, new BindException("Target", "Object Name")))
                .isEmpty());
    }

    /**
     * Method under test: {@link ExceptionHandlerController#exceptionHandler(MethodArgumentNotValidException)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExceptionHandler5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.web.bind.MethodArgumentNotValidException.getBindingResult()" because "e" is null
        //       at com.company.org.customerprofileservice.controllers.ExceptionHandlerController.exceptionHandler(ExceptionHandlerController.java:25)
        //   See https://diff.blue/R013 to resolve this issue.

        (new ExceptionHandlerController()).exceptionHandler((MethodArgumentNotValidException) null);
    }
}

