package com.personalLoan.listeners;

import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import com.personalLoan.base.BaseClass;

public class TestFilterListener extends BaseClass implements IMethodInterceptor {
	public static int testCount = 0;

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		ArrayList<String> tests = new ArrayList<String>();
		printString("Running " + methods.size() + " Tests");

		for (IMethodInstance method : methods) {
			methodNamelist.put(method.getMethod().getMethodName(), 0);
			printString(method.getMethod().getMethodName());
		}
		testCount = methods.size();
		return methods;
	}
}