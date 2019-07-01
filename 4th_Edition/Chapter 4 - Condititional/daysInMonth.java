//  Write a method named daysInMonth that accepts a month (an integer between 1 and 12) as a parameter and returns the number of days in that month in this year. 

public int daysInMonth(int month) {
    if (month < 8 && month % 2 == 1) {
        return 31;
    } else if (month > 7 && month %2 == 0) {
        return 31;
    } else if (month == 2) {
        return 28;
    } else {
        return 30;
    }
}
