package assignment4;

public class Main {
    public static void main(String[] args) {
        AirIndia ai = new AirIndia(3, 1500.0);
        ai.display();

        Indigo indigo = new Indigo(2, 2000.0);
        indigo.display();

        KingFisher kf = new KingFisher(4, 1200.0);
        kf.display();
    }
}