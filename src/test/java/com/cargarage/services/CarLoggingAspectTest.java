package com.cargarage.services;
import static org.junit.Assert.assertEquals;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import com.cargarage.services.aspects.CarLoggingAspect;

@RunWith(MockitoJUnitRunner.class)
public class CarLoggingAspectTest {

  @InjectMocks
  private CarLoggingAspect carLoggingAspect;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Mock
  private ProceedingJoinPoint proceedingJoinPoint;

  @Test
  public void loggingAround_Ok() throws Throwable {
    Signature mockSignature = Mockito.mock(Signature.class);
    Object expectedResult = new Object();
    Mockito.when(proceedingJoinPoint.proceed()).thenReturn(expectedResult);
    Mockito.when(proceedingJoinPoint.getSignature()).thenReturn(mockSignature);
    Mockito.when(mockSignature.getName()).thenReturn("Method name");
    Mockito.when(proceedingJoinPoint.proceed()).thenReturn(expectedResult);

    Object result = carLoggingAspect.around(proceedingJoinPoint);

    assertEquals(expectedResult, result);
    Mockito.verify(proceedingJoinPoint, Mockito.times(1)).proceed();
  }

}
