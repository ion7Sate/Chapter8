package ModifingInternalDataRepresentation;

public class Time2Test {
    public static void main(String[] args)
    {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(8);
        Time2 t3 = new Time2(16, 23);


        Time2 t4 = new Time2(6, 45, 52);
        Time2 t5 = new Time2(t4);
        displayTime(" All default arguments", t1);
        displayTime("Hour specified; default minute and second", t2);
        displayTime("Hour and minute specified; default second", t3);
        displayTime("Hour, minute and second specified", t4);
        displayTime("Time2 object t4 specified", t5);


        try
        {
            Time2 t6 = new Time2(27, 74, 99); // invalid values
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing t6: %s%n",
                    e.getMessage());
        }
    }


    private static void displayTime(String header, Time2 t)
    {
        System.out.printf("%s%n   %s%n   %s%n",
                header, t.toUniversalString(), t.toString());
    }
}
