package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class AuthenticationTest {
	
	private Authentication a;
	@BeforeEach
	public void iniatilse()
	{
		a = new Authentication();
	}
	@AfterEach
	public void destroy()
	{
		a =null;
	}
	
	@TestFactory
	Collection<DynamicTest> authenticationTestDemo(){
		
		return Arrays.asList(
				dynamicTest("Test 1", ()->assertEquals(true, a.authenticate("Renny@123", "renny"))),
				dynamicTest("Test 2", ()->assertNotEquals(true, a.authenticate("renny", "Renny"))),
				dynamicTest("Test 3", ()->assertTrue(a.authenticate("Renny@123", "renny"))),
				dynamicTest("Test 4", ()->assertNotSame(false, a.authenticate("Renny@123", "renny"))),
				dynamicTest("Test 5", ()->assertEquals(false, a.authenticate("Renny@123", "Renny")))
		);
	}
}
