package sample.test.test1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import sample.main.test1.StringUtils;

/**
 * This is the test class of "StringUtils".
 *
 */
public class TestStringUtils {

	/**
	 * toSnakeCase() Testcase1 : param "aaa" -> "aaa"
	 */
	@Test
	public void toSnakeCaseTest_TestCase1() {
		String expected = "aaa";
		String actual = StringUtils.toSnakeCase("aaa");
		assertThat(actual, is(expected));
	}
	
	/**
	 * toSnakeCase() TestCase2 : param "HelloWorld" -> "hello_world"
	 */
	@Test
	public void toSnakeCaseTest_TestCase2(){
		String expected = "hello_world";
		String actual = StringUtils.toSnakeCase("HelloWorld");
		assertThat(actual, is(expected));
	}
	
	/**
	 * toSnakeCase() TestCase3 : param "practiceJunit" -> practice_junit
	 */
	@Test
	public void toSnakeCaseTest_TestCase3(){
		String expected = "practice_junit";
		String actual = StringUtils.toSnakeCase("practiceJunit");
		assertThat(actual, is(expected));
	}

}
