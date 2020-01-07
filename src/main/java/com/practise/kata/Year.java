package com.practise.kata;

public class Year {
    public boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        return year % 4 == 0;
    }
}
