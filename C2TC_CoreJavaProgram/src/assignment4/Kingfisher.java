package assignment4;

public class Kingfisher implements Airfare {
    private int hours;
    private double costPerHour;

 
    public Kingfisher() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }
    
    public Kingfisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }
   
    public int getHours() {
        return hours;
    }
    public double getCostPerHour() {
        return costPerHour;
    }
   
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    @Override
    public double calculateAmount() {
        return hours * costPerHour * 4;
    }
    @Override
    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }
}
