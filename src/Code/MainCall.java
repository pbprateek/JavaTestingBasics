package Code;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import Testing.JUnitTestSuite;

public class MainCall {

	public static void main(String[] args) {
		
		//If u wanna run from main or else u can always run separate tests in eclipse
		
		Result result = JUnitCore.runClasses(JUnitTestSuite.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
		

	}

}
