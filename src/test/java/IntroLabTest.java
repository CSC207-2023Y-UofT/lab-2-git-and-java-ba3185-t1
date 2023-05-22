/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TODO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 10)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    /* TODO: Write a test case for the method you wrote in IntroLab.
     *       If done properly, you should be able to run IntroLabTest and see
     *       the test results.
     * As a reference, we've included testExampleStudent above.
     */

    @Test(timeout = 10)
    public void testMethod() {
        String expected = "Yo! My name is Kevin Quinn! " + "I like dogs more than cats! CSC207 is a lot of fun!";
        String actual = IntroLab.quinnKev();
        assertEquals(expected, actual);
    }
    @Test(timeout = 10)
    public void testRealUtorid() {
        String expected = "gday! My name is lach f! " +
                "I like cats more than dogs! why";
        String actual = IntroLab.realUtorid();
        assertEquals(expected, actual);
    }

    @Test(timeout = 10)
    public void testJJ() {
        String expected = "Hello! My name is JJ han! I like cats more than dogs! Hello World!";
        String actual = IntroLab.jj();
        assertEquals(expected, actual);
    }
}
