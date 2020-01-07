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
        Assert.assertFalse(year.isLeapYear(2019));
    }
}
