package Transport.WaterTranspotr;

public class Boat extends WaterTransport {
    public Boat(String name, int numberPassengers, double weight,int speed, int price) {
        super(name, numberPassengers, weight,speed, price);
    }

    public Boat() {
    }

    public void show(){
        System.out.println("Boat: name = "+getName() +" , NumberPassengers = "+ getNumberPassengers()+" , Weight = "+ getWeight()
                +" ,Speed = "+ getSpeed()+ " , Price = " + getPrice());
    }
}
