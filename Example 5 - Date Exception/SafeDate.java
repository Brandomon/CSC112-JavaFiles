public class SafeDate
{
    int month;
    int day;
    int year;
    final int MINYEAR = 1900;

    public SafeDate(int newMonth, int newDay, int newYear) throws DateOutOfBoundsException
    {
        if ((newMonth <=  0) || (newMonth > 12))
        {
            throw new DateOutOfBoundsException("Month " + newMonth + " illegal.");
        }
        else
        {
            month = newMonth;
        }

        day = newDay;

        if (newYear < MINYEAR)
        {
            throw new DateOutOfBoundsException("Year " + newYear + " is too early.");
        }
        else
        {
            year = newYear;
        }
    }//end constructor
}//end Safe Date