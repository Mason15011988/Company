package Transport.EarthTransport;

public class Bus extends EarthTranspotr {
    public Bus(String name, int numberPassengers, double weight,int speed, int price) {
        super(name, numberPassengers , weight,speed, price);
    }

    public Bus() {
    }
    public void show(){
        System.out.println("Bus: name = "+getName() +" , NumberPassengers = "+ getNumberPassengers()+" , Weight = "+ getWeight()
                +" ,Speed = "+ getSpeed()+ " , Price = " + getPrice());
    }
}
