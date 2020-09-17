//a simple timesheet that we had to modify to make it work

package app;

public class SecondHomework {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Hello, Justin"); //Replace my name with yours
        System.out.println("---------------------------------------------");
        float numberOfHoursWorkedThisWeek = 40.0F;
        System.out.println("You worked " + numberOfHoursWorkedThisWeek + " hours this week." );

        double hourlyRate = 130.00;
        double weeklyEarnings = numberOfHoursWorkedThisWeek * hourlyRate;
        System.out.println("Your hourly rate is $" + hourlyRate + "0");
        System.out.println("As a result, your total weekly pay is: $" + weeklyEarnings);
       
        System.out.println();
        System.out.println("---------------------------------------------");

        System.out.println("Sincerely, Mary from HR");

        System.out.println();
    }
}
