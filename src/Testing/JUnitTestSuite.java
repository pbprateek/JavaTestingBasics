package Testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*If you have several test classes, you can combine them into a test suite. 
 * Running a test suite executes all test classes in that suite in the specified order */

@RunWith(Suite.class)

@Suite.SuiteClasses({
   ArthematicTest.class,
   NormalMethodsTest.class
})

public class JUnitTestSuite {

}
