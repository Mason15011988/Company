import Cities.Cities;
import Transport.AirTransport.PassengerPlane;
import Transport.AirTransport.Plane;
import Transport.EarthTransport.Bus;
import Transport.EarthTransport.Car;
import Transport.EarthTransport.Truck;
import Transport.WaterTranspotr.Boat;
import Transport.WaterTranspotr.Tranker;

public class Main {
    public static void main(String[] args) {
        CompanyTransport companyTransport = new CompanyTransport();
        Cities minsk = new Cities("Minsk", true, false);
        Cities mogilev = new Cities("Mogilev", true, false);
        Cities la = new Cities("LA", true, true);
        Cities alaska = new Cities("Alaska", true, true);

        companyTransport.addCities(minsk);
        companyTransport.addCities(mogilev);
        companyTransport.addCities(la);
        companyTransport.addCities(alaska);

        companyTransport.addTransport(new Car("BMW", 5, 0.2, 150, 500));
        companyTransport.addTransport(new Bus("BMW", 50, 2, 120, 1000));
        companyTransport.addTransport(new Bus("Audi", 40, 3, 140, 1050));
        companyTransport.addTransport(new Bus("Audi2", 40, 3, 140, 1060));
        companyTransport.addTransport(new Bus("Audi3", 40, 3, 130, 1050));
        companyTransport.addTransport(new Truck("BMW", 3, 5, 110, 700));
        companyTransport.addTransport(new Plane("BMW", 3, 3, 1010, 1700));
        companyTransport.addTransport(new PassengerPlane("BMW", 200, 5, 110, 700));
        companyTransport.addTransport(new Boat("BMW", 30, 3, 200, 1200));
        companyTransport.addTransport(new Tranker("BMW", 10, 40, 150, 2000));


       companyTransport.showCities();

        companyTransport.raschet(la, alaska, 2, 2);

    }
}

