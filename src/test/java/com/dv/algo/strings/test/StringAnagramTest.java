package com.dv.algo.strings.test;

import org.junit.*;

public class StringAnagramTest {

    @BeforeClass
    public static void beforeClassSetup() {
        // System.out.println("BeforeClassSetup is called");
    }

    @Before
    public void before() {
        // System.out.println("Before class setup is called");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnagramInStrings() {

        boolean isAnagram =false;

        isAnagram = StringAlgoImpl.checkForAnagram("Mary", "Ramy");
        Assert.assertTrue(isAnagram == true);

        isAnagram = StringAlgoImpl.checkForAnagram("Army", "Mary");
        Assert.assertTrue(isAnagram == true);

        isAnagram = StringAlgoImpl.checkForAnagram("Army -", "Mary ?");
        Assert.assertTrue(isAnagram == true);

        isAnagram = StringAlgoImpl.checkForAnagram("Java", "Python");
        Assert.assertTrue(isAnagram == false);

        isAnagram = StringAlgoImpl.checkForAnagram(null, null);
        Assert.assertTrue(isAnagram == false);

        isAnagram = StringAlgoImpl.checkForAnagram("", "");
        Assert.assertTrue(isAnagram == false);

    }

    @After
    public void tearThis() {
        //System.out.println("After tearThis called");
    }

    @AfterClass
    public static void tearClass() {
        // System.out.println("AfterClass tearClass called");
    }
}
