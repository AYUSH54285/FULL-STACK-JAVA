package com.nt.suite;

//import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

//import com.nt.test.AppTest1;
//import com.nt.test.ArithmeticOperationsTest;
//import com.nt.test.StringUtilTest;

import org.junit.platform.suite.api.SelectPackages;

@Suite
@SelectPackages("com.nt.test")
//@SelectClasses({AppTest1.class,StringUtilTest.class,ArithmeticOperationsTest.class})
public class AllTestsSuite {

}
