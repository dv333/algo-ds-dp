package com.dv.algo.strings.test;

import org.junit.*;

public class StringFirstNonRepeatedCharacterTest {

    @BeforeClass
    public static void beforeClassSetup() {
        // System.out.println("BeforeClassSetup is called");
    }

    @Before
    public void before() {
        // System.out.println("Before class setup is called");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonRepeatedCharacter() {

        Character nonRepeatedCharacter =null;

        nonRepeatedCharacter = StringAlgoImpl.firstNonRepeatedCharacterInString(null);

        nonRepeatedCharacter = StringAlgoImpl.firstNonRepeatedCharacterInString("Java");
        Assert.assertTrue(nonRepeatedCharacter == 'J');
        nonRepeatedCharacter = StringAlgoImpl.firstNonRepeatedCharacterInString("mom");
        Assert.assertTrue(nonRepeatedCharacter == 'o');

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
