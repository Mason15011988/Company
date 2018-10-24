package Transport.AirTransport;

public class PassengerPlane extends AirTransport {
    public PassengerPlane(String name, int numberPassengers, double weight,int speed, int price) {
        super(name, numberPassengers, weight,speed, price);
    }

    public PassengerPlane() {
    }

    public void show(){
        System.out.println("PassengerPlane: name = "+getName() +" , NumberPassengers = "+ getNumberPassengers()+" , Weight = "+ getWeight()
                +" ,Speed = "+ getSpeed()+ " , Price = " + getPrice());
    }
}
