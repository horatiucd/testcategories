package com.hcd.testcategories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class NewLocalTest {

	@Test	
	public void champions() {
		final Local local = new Local();		
		List<String> result = local.champions();
		
		assertEquals(2, result.size());
		assertTrue(result.contains("Cristina Neagu"));
	}
}
