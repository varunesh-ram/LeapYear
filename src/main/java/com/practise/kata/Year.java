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

    public void setYear(int year) throws InvalidData {
        if (year <= 0)
            throw new InvalidData();
        this.year = year;
    }

    public class InvalidData extends RuntimeException {
    }
}
