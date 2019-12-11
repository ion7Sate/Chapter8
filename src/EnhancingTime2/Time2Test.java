package EnhancingTime2;

public class Time2Test {
    public static void main(String[] args) {
        try
        {
            Time2 t4 = new Time2(14, 59, 59);
            displayTime("Time is", t4);
            t4.incrementSecond();
            displayTime("Time after method incrementSecond is ", t4);
            t4.incrementMinute();
            displayTime("Time after method incrementMinute is ", t4);
            t4.incrementHour();
            displayTime("Time after method incrementHour is", t4);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing : %s%n",
                    e.getMessage());
        }

    }

    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n   %s%n   %s%n",
                header, t.toUniversalString(), t.toString());
    }
}
