package tests.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import tests.negativeTests.LogInNegativeTest;
import tests.negativeTests.NegativeCreateAdTest;


@Suite
@SelectClasses({
        LogInNegativeTest.class,
        NegativeCreateAdTest.class

})
public class NegativeNadjiDomTestSuite {
}