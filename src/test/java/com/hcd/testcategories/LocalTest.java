package com.hcd.testcategories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.hcd.testcategories.config.UnitTests;

@Category(UnitTests.class)
public class LocalTest {

	@Test	
	public void champions() {
		final Local local = new Local();		
		List<String> result = local.champions();
		
		assertEquals(2, result.size());
		assertTrue(result.contains("Simona Halep"));
	}
}
