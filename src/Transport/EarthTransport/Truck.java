package Transport.EarthTransport;

public class Truck extends EarthTranspotr {
    public Truck(String name, int numberPassengers, double weight,int speed, int price) {
        super(name, numberPassengers, weight,speed, price);
    }

    public Truck() {
    }

    @Override
    public void show() {
        System.out.println("Truck: name = "+getName() +" , NumberPassengers = "+ getNumberPassengers()+" , Weight = "+ getWeight()
                +" ,Speed = "+ getSpeed()+ " , Price = " + getPrice());
    }
}
