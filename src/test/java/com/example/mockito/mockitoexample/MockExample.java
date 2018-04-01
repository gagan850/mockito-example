package com.example.mockito.mockitoexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
	
									
@RunWith(MockitoJUnitRunner.class)
public class MockExample {
	
	@InjectMocks
	private StudentService studentService;	

	@Test	
	public void mockExample() {
		System.out.println("-----------Example Mock-------------");
	
		Student student = Mockito.mock(Student.class);
		Mockito.when(student.getUnformattedData()).thenReturn("Gagan;+1;10;Bathinda");		
		studentService.format(student);
		System.out.println(student);

	}
	
	@Test	
	public void spyExample() {
		System.out.println("-----------Example Spy-------------");

		Student student = Mockito.spy(Student.class);		
		Mockito.when(student.getUnformattedData()).thenReturn("Gagan;+1;10;Bathinda");
		studentService.format(student);
		System.out.println(student);
	}
}
		