package Enum.NelioAlves.EX1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker 
{
    private String name;
    private Double baseSalary;

    private WorkerLevel level;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();
    
    public Worker() {}

    
    public Worker(String name, Double baseSalary, WorkerLevel level, Department department) 
    {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.department = department;
    }


    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month)
    {
        Calendar calendar = Calendar.getInstance();
        double sum = baseSalary;

        for (HourContract contract : contracts) 
        {
            calendar.setTime(contract.getDate());
            int contr_year = calendar.get(Calendar.YEAR);
            int contr_month = 1 + calendar.get(Calendar.MONTH);

            if(year == contr_year && month == contr_month){
                sum += contract.total_TO_bePaid();
            }
        }
        return sum;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
}