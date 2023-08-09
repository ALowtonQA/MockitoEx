package com.qa.calc;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorUnitTestMockito {
	
	@Mock
	private Adder adder;
	
//	Mock the Subtractor dependency	
//	@Mock

//	Mock the Multiplier dependency	
//	@Mock 

//	Mock the Divider dependency	
//	@Mock

	@InjectMocks
	private Calculator calculator;
	
	@Test
	public void addTest() {
		Mockito.when(adder.add(5, 5)).thenReturn(10);
		
		assertEquals(10, calculator.add(5, 5));
		
		// verifying that the add method of adder was called EXACTLY ONCE.
		verify(adder, times(1)).add(5, 5);
	}
	
	@Test
	public void subTest() {

	}
	
	@Test
	public void mulTest() {

	}
	
	@Test
	public void divTest() {

	}
	
}
