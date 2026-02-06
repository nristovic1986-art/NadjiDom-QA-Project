package tests.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import tests.positiveTests.CreateAdTest;
import tests.positiveTests.LoginTest;
import tests.positiveTests.PostedAdTest;
import tests.positiveTests.SearchTest;


@Suite
@SelectClasses({
        LoginTest.class,
        CreateAdTest.class,
        PostedAdTest.class,
        SearchTest.class
})
public class NadjiDomTestSuite {
}