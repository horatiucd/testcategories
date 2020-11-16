package com.hcd.testcategories;

import java.util.List;

public class Local {
	
	public List<String> champions() {
		System.out.println("Retrieving local champions...");
		return List.of("Simona Halep", "Cristina Neagu");
	}
}
