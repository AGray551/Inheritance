import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args)
    {
        ArrayList<Worker> workers = new ArrayList<>();
        Worker Mary = new Worker("000001", "Mary", "Smith", "Dr.", 1995, 12);
        workers.add(Mary);
        Worker Kevin = new Worker("000002", "Kevin", "Rogers", "Mr.", 1983, 14);
        workers.add(Kevin);
        Worker Julian = new Worker("000003", "Julian", "Woods", "Mrs.", 1987, 16);
        workers.add(Julian);

        SalaryWorker Bart = new SalaryWorker("000004", "Bart", "Burton", "Mr.", 1990, 13, 40000);
        workers.add(Bart);
        SalaryWorker Ernie = new SalaryWorker("000005", "Ernie", "Bulsara", "Mrs.", 1993, 15, 60000);
        workers.add(Ernie);
        SalaryWorker Joe = new SalaryWorker("000006", "Joe", "Zanuff", "Dr.", 1999, 17, 50000);
        workers.add(Joe);

        for(Worker i : workers)
        {
            System.out.println("Week 1 pay for " + i.getFirstName());
            System.out.println(i.displayWeeklyPay(40));
        }
        for(Worker i : workers)
        {
            System.out.println("Week 2 pay for " + i.getFirstName());
            System.out.println(i.displayWeeklyPay(50));
        }
        for(Worker i : workers)
        {
            System.out.println("Week 3 pay for " + i.getFirstName());
            System.out.println(i.displayWeeklyPay(40));
        }
    }
}
