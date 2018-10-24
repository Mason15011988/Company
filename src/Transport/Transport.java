package Transport;

import java.util.Objects;

public  class Transport {
    private String name;
    private int numberPassengers;
    private double weight;
    private int speed;
    private int price;

    public Transport(String name, int numberPassengers, double weight,int speed, int price) {
        this.name = name;
        this.numberPassengers = numberPassengers;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public Transport() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void show(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return numberPassengers == transport.numberPassengers &&
                Double.compare(transport.weight, weight) == 0 &&
                speed == transport.speed &&
                price == transport.price &&
                Objects.equals(name, transport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberPassengers, weight, speed, price);
    }
}

