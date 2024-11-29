package Enum.NelioAlves.EX1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) throws ParseException 
    {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String depName = sc.nextLine();


        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, baseSalary, WorkerLevel.valueOf(workerLevel), new Department(depName));

        System.out.print("How many contracts will the worker have? ");
        int contractsNum = sc.nextInt();

        for (int i = 1; i <= contractsNum; i++) 
        {
            System.out.println("Enter contract #" + i + " data:");
            
            System.out.print("Date (dd/MM/yyyy): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Hourly Wage: ");
            double hourlyWage = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, hourlyWage, hours);
            worker.addContract(contract);

            System.out.println();
        }

        System.out.println();
        
        System.out.print("Enter month and year to calculate the worker's income (MM/yyyy): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income regarding " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}