package com.hcd.testcategories;

import java.util.List;

public class Remote {

	public List<String> champions() {
		try {
			System.out.println("Retrieving remote champions...");
			Thread.sleep(5000);
			
			return List.of("Roger Federer", "Dan Carter");
		} catch (InterruptedException e) {
			throw new RuntimeException("Champions unavailable.");
		}
	}
}
