package Transport.EarthTransport;

public class Car extends EarthTranspotr {
    public Car(String name, int numberPassengers, double weight,int speed, int price) {
        super(name, numberPassengers, weight, speed, price);
    }

    public Car(String eath, String bmw, int i, double v, int i1, int i2) {
    }
    public void show(){
        System.out.println("Car: name = "+getName() +" , NumberPassengers = "+ getNumberPassengers()+" , Weight = "+ getWeight()
                +" ,Speed = "+ getSpeed()+ " , Price = " + getPrice());
    }
}
