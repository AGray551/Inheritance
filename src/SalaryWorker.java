public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String titleName, int birth, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, titleName, birth, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked)
    {
        double weeklyPay = annualSalary / 52;
        return "The weekly pay is only a fraction of the yearly pay, the weekly pay is " + String.format("%.2f", + weeklyPay);
    }

}
