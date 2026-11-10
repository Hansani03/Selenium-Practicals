package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example10 {

    @Test
    public void testSum() {
        System.out.println("\nRunning Test -> testSum");
        SomeClassToTest obj = new SomeClassToTest();
        int result
                = obj.sumNumbers(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testStrings() {
        System.out.println("\nRunning Test -> testStrings");
        String expectedString = "Hello World";
        SomeClassToTest obj
                = new SomeClassToTest();
        String result =
                obj.addStrings("Hello", "World");
        Assert.assertEquals(result, expectedString);
    }

    @Test
    public void testArrays() {
        System.out.println("\nRunning Test -> testArrays");
        int[] expectedArray = {1, 2, 3};
        SomeClassToTest obj = new SomeClassToTest();
        int[]
                result = obj.getArray();
        Assert.assertEquals(result, expectedArray);
        System.out.println("\nEnd Test -> testArrays");
    }

    public class SomeClassToTest {
        public int sumNumbers(int a, int b) {
            return a + b;
        }

        public String addStrings(String a, String b) {
            return a + " " + b;
        }

        public int[] getArray() {
            int[] arrayExample = {1, 2, 3};
            return arrayExample;
        }
    }
}