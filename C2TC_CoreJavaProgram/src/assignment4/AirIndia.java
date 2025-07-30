package assignment4;

class AirIndia implements Airfare {
    private int hours;
    private double costPerHour;

   
    public AirIndia() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }

    public AirIndia(int hours, double costPerHour) {
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
        return hours * costPerHour;
    }


    @Override
    public void display() {
        System.out.println("Air India: Hours = " + hours + ", Cost per Hour = " + costPerHour + ", Total Amount = " + calculateAmount());
    }
}
