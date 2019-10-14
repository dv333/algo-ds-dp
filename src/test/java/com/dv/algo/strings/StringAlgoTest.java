package com.dv.algo.strings;

import org.junit.*;

import java.util.Map;

/**
 * Created by dvijayan on 10/14/19.
 */
public class StringAlgoTest {

    @BeforeClass
    public static void beforeClassSetup() {
        // System.out.println("StringAlgoTest class beforeClassSetup is called");
    }

    @Before
    public void before() {
        // System.out.println("Before class setup is called");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintDuplicateCharactersInAString() {

        Map<Character, Integer> returnMap = null;

        // Valid String
        returnMap = StringAlgoImpl.printDuplicateCharactersInAString("Java");
        Assert.assertTrue(returnMap != null);
        Assert.assertTrue(returnMap.get(new Character('a')) == 2);

        // Only one char
        returnMap = StringAlgoImpl.printDuplicateCharactersInAString("J");
        Assert.assertTrue(returnMap == null);

        // Two spaces
        returnMap = StringAlgoImpl.printDuplicateCharactersInAString("  ");
        Assert.assertTrue(returnMap != null);
        Assert.assertTrue(returnMap.get(new Character(' ')) == 2);


        returnMap = StringAlgoImpl.printDuplicateCharactersInAString("The Java Programming");
        Assert.assertTrue(returnMap != null);
        Assert.assertTrue(returnMap.get(new Character(' ')) == 2);

        returnMap = StringAlgoImpl.printDuplicateCharactersInAString(null);
        Assert.assertTrue(returnMap == null);
    }

    @After
    public void tearThis() {
        //System.out.println("StringAlgoTest after tearThis called");
    }

    @AfterClass
    public static void tearClass() {
        // System.out.println("StringAlgoTest AfterClass tearClass called");
    }

}
