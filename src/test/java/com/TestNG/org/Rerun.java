package com.TestNG.org;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {

	int start = 1;
	int end = 5;

	@Override
	public boolean retry(ITestResult result) {
		if (start < end) {

			start++;
			return true;

		}
		return false;
	}

}
