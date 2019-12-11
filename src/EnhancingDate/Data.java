package EnhancingDate;

public class Data {
    private int day;
    private int month;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public Data(int day, int month, int year) {

        if (month <= 0 || month > 12)
            throw new IllegalArgumentException(
                    "month (" + month + ") must be 1-12");


        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");


        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");

        this.day = day;
        this.month = month;
        this.year = year;

        System.out.printf(
                "Date object for  %s%n", this);
    }

    public void nextDay() {
        if (day == 28 && month == 2 && year % 400 == 0) {
            day++;
        } else if (day >= daysPerMonth[month]) {
            nextMonth();
        } else {
            day++;
        }
    }

    public void nextMonth() {
        if (month == 12) {
            nextYear();
        } else {
            month++;
            day = 1;
        }
    }

    public void nextYear() {
        year++;
        month = 1;
        day = 1;
    }

    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
