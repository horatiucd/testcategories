package com.hcd.testcategories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.hcd.testcategories.config.IntegrationTests;

@Category(IntegrationTests.class)
public class RemoteTest {

	@Test
	public void champions() {
		final Remote remote = new Remote();		
		List<String> result = remote.champions();
		
		assertEquals(2, result.size());
		assertTrue(result.contains("Roger Federer"));
	}
}
