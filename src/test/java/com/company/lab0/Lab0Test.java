package com.company.lab0;

import com.company.lab0.lab0.Lab0;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

public class Lab0Test {

    @org.testng.annotations.Test(dataProvider = "inputProvider")
    public void testInputOutputYear(int x1, int x2, int expected) {
        assertEquals(new Lab0().inputOutputYear(x1, x2), expected);
    }

    @DataProvider
    Object[][] inputProvider() {
        return new Object[][] {{2,3,1}, {-1, 3, 4}, {5, 2, 3}};
    }

    @org.testng.annotations.Test(dataProvider = "switchProvider")
    public void testSwitchTack(int year, String excepted) {
        assertEquals(new Lab0().switchTack(year), excepted);
    }

    @DataProvider
    Object[][] switchProvider() {
        return new Object[][] {{21, "двадцять один рік"}, {69, "шістдесят дев'ять років"}};
    }

    @org.testng.annotations.Test(expectedExceptions = AssertionError.class)
    public void testSwitchError() {
        new Lab0().switchTack(70);
    }


    @org.testng.annotations.Test(dataProvider = "booleanProvider")
    public void testBooleanTask(int num, boolean expected) {
        assertEquals(new Lab0().booleanTask(num), expected);
    }

    @DataProvider
    Object[][] booleanProvider() {
        return new Object[][] {{22, true}, {33, false}};
    }

    @org.testng.annotations.Test(expectedExceptions = AssertionError.class)
    public void testBooleanError() {
        new Lab0().booleanTask(9);
    }

    @org.testng.annotations.Test(dataProvider = "forProvider")
    public void testForTask(double num, int exp, double[] expected) {
        assertEquals(new Lab0().forTask(num,exp), expected);
    }

    @DataProvider
    Object[][] forProvider() {
        return new Object[][] {{2d,2, new double[] {2, 4}}};
    }

    @org.testng.annotations.Test(dataProvider = "whileProvider")
    public void testWhileTask(double p, Lab0.Pair expected) {
        assertEquals(new Lab0().whileTask(p), expected);
    }

    @DataProvider
    Object[][] whileProvider() {
        Lab0.Pair input20 = new Lab0.Pair(9, 207.9890176);
        return new Object[][] {{20,input20}};
    }
}