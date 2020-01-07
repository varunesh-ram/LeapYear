package com.practise.kata;

public class Year {
    private int year;

    public boolean isLeapYear() {
        boolean result = true;
        if (year % 400 != 0) {
            if (year % 4 != 0) {
                result = false;
            }
        }
        return result;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
