package com.hcd.testcategories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.hcd.testcategories.config.IntegrationTests;
import com.hcd.testcategories.config.UnitTests;

public class MixedTest {

	@Test
	@Category(UnitTests.class)
	public void localChampions() {
		final Local local = new Local();		
		List<String> result = local.champions();
		
		assertEquals(2, result.size());
		assertTrue(result.contains("Simona Halep"));
	}
	
	@Test
	@Category(IntegrationTests.class)
	public void remoteChampions() {
		final Remote remote = new Remote();		
		List<String> result = remote.champions();
		
		assertEquals(2, result.size());
		assertTrue(result.contains("Roger Federer"));
	}
}
