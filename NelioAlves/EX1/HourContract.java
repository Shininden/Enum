package Enum.NelioAlves.EX1;
import java.util.Date;

public class HourContract 
{
    private Date date;
    private Double hourlyWage; 
    private Integer hours;
    
    public HourContract() {}

    public HourContract(Date date, Double hourlyWage, Integer hours) 
    {
        this.date = date;
        this.hourlyWage = hourlyWage;
        this.hours = hours;
    }

    public Double total_TO_bePaid(){
        return hourlyWage * hours;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Double getHourlyWage() {
        return hourlyWage;
    }
    public void setHourlyWage(Double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public Integer getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
}