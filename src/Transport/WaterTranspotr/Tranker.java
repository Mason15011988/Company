package Transport.WaterTranspotr;

public class Tranker extends WaterTransport {
    public Tranker(String name, int numberPassengers, double weight,int speed, int price) {
        super(name, numberPassengers, weight,speed, price);
    }

    public Tranker() {
    }

    public void show(){
        System.out.println("Tranker: name = "+getName() +" , NumberPassengers = "+ getNumberPassengers()+" , Weight = "+ getWeight()
                +" ,Speed = "+ getSpeed()+ " , Price = " + getPrice());
    }
}
