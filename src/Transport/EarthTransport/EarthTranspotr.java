package Transport.EarthTransport;

import Transport.Transport;

public class EarthTranspotr extends Transport {
    public EarthTranspotr(String name, int numberPassengers, double weight,int speed, int price) {
        super(name, numberPassengers, weight,speed, price);
    }

    public EarthTranspotr() {
    }

    @Override
    public String toString() {
        return "EarthTranspotr{}";
    }
}
