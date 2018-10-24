package Transport.AirTransport;

public class Plane extends AirTransport {
    public Plane(String name, int numberPassengers, double weight,int speed, int price) {
        super(name, numberPassengers, weight,speed, price);
    }

    public Plane() {
    }

    @Override
    public void show() {
        System.out.println("Plane: name = "+getName() +" , NumberPassengers = "+ getNumberPassengers()+" , Weight = "+ getWeight()
                +" ,Speed = "+ getSpeed()+ " , Price = " + getPrice());
    }
}
