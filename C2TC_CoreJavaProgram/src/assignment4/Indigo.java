package assignment4;

class Indigo implements Airfare {
    private int hours;
    private double costPerHour;

    
    public Indigo() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }

    
    public Indigo(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

   
    @Override
    public double calculateAmount() {
        return hours * costPerHour * 8;
    }

   
    @Override
    public void display() {
        System.out.println("Indigo: Hours = " + hours + ", Cost per Hour = " + costPerHour + ", Total Amount = " + calculateAmount());
    }
}
