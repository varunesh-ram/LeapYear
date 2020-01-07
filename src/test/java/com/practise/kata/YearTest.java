package com.practise.kata;

import org.junit.Assert;
import org.junit.Test;

public class YearTest {
    @Test
    public void shouldInstantiateYear() {
        Year year = new Year();
        Assert.assertNotNull(year);
    }

    @Test
    public void year2019ShouldNotBeLeapYear() {
        Year year = new Year();
        Assert.assertFalse(year.isLeapYear(2019));
    }
}
