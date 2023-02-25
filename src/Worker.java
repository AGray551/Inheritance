public class Worker extends Person
{
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String titleName, int birth, double hourlyPayRate)
    {
        super(ID, firstName, lastName, titleName, birth);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double regularPay = 0;
        double overtimePay = 0;
        if (hoursWorked > 40)
        {
            hoursWorked = 40;
            overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            regularPay = hoursWorked * hourlyPayRate;
            return overtimePay + regularPay;
        } else
        {
            regularPay = hoursWorked * hourlyPayRate;
            return regularPay;
    }

    }
    public String displayWeeklyPay(double hoursWorked)
    {
        if (hoursWorked > 40)
        {
            System.out.println("Normal Pay: " + String.format("%.2f", 40 * hourlyPayRate));
            System.out.println("Overtime: " + (hoursWorked - 40));
            System.out.println("Overtime Pay: " + String.format("%.2f", (hoursWorked - 40) * (hourlyPayRate * 1.5)));
            System.out.println("Total Pay: " + String.format("%.2f", calculateWeeklyPay(hoursWorked)));
        } else
        {
            System.out.println("Hours Worked: " + String.format("%.2f", hoursWorked));
            System.out.println("Total Pay: " + String.format("%.2f", calculateWeeklyPay(hoursWorked)));
        }
        return "";
    }

}
