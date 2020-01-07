package com.practise.kata;

public class Year {
    private int year;

    public boolean isLeapYear() {
        if (isYearNotDivisbleBy400()) {
            return !isYearNotDivisbleBy4();
        }
        return true;
    }

    private boolean isYearNotDivisbleBy4() {
        return year % 4 != 0;
    }

    private boolean isYearNotDivisbleBy400() {
        return year % 400 != 0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws InvalidData {
        if (isYearLessThanOrEqualTo0(year))
            throw new InvalidData();
        this.year = year;
    }

    private boolean isYearLessThanOrEqualTo0(int year) {
        return year <= 0;
    }

    public class InvalidData extends RuntimeException {
    }
}
