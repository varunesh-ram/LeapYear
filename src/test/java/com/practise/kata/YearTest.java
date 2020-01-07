package com.practise.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YearTest {
    private Year year;

    @Before
    public void shouldInstantiateYear() {
        year = new Year();
    }

    @Test
    public void year2019ShouldNotBeLeapYear() {
        year.setYear(2019);
        Assert.assertFalse(year.isLeapYear());
    }

    @Test
    public void year2000ShouldBeLeapYear() {
        year.setYear(2000);
        Assert.assertTrue(year.isLeapYear());
    }

    @Test
    public void year2004ShouldBeLeapYear() {
        year.setYear(2004);
        Assert.assertTrue(year.isLeapYear());
    }

    @Test(expected = Year.InvalidData.class)
    public void year0000ShouldThrowInvalidData() {
        year.setYear(0000);
    }

    @Test(expected = Year.InvalidData.class)
    public void negativeValueShouldThrowInvalidData() {
        year.setYear(-5);
    }


}
