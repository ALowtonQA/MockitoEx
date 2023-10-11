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
	@Mock
	private Subtractor subtractor;
	
//	Mock the Multiplier dependency	
	@Mock 
	private Multiplier multiplier;
	
//	Mock the Divider dependency	
	@Mock
	private Divider divider;
	
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
		Mockito.when(subtractor.sub(10, 5)).thenReturn(5);
		assertEquals(5, calculator.sub(10, 5));  
	}
	
	@Test
	public void mulTest() {
		Mockito.when(multiplier.mul(5, 5)).thenReturn(25);
		assertEquals(25, calculator.mul(5, 5));
	}
	
	@Test
	public void divTest() {
		Mockito.when(divider.div(11, 2)).thenReturn(5.5);
		assertEquals(5.5, calculator.div(11, 2), 0);
	}
	
}
