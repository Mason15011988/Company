import Cities.Cities;
import Transport.AirTransport.AirTransport;
import Transport.EarthTransport.EarthTranspotr;
import Transport.Transport;
import Transport.WaterTranspotr.WaterTransport;

import java.util.*;

public class CompanyTransport {
    private Set<Cities> cities = new TreeSet<Cities>();
    private Map<String,List<Transport>> transports = new HashMap<>();

    public CompanyTransport(Set<Cities> cities, Map<String,List<Transport>> transports) {
        this.cities = cities;
        this.transports = transports;
    }

    public CompanyTransport(Set<Cities> cities) {
        this.cities = cities;
    }

    public CompanyTransport() {
        transports.put("water",new ArrayList<>());
        transports.put("air",new ArrayList<>());
        transports.put("earth",new ArrayList<>());

    }

    public Set<Cities> getCities() {
        return cities;
    }

    public void setCities(Set<Cities> cities) {
        this.cities = cities;
    }

    public Map<String,List<Transport>> getTransports() {
        return transports;
    }

    public void setTransports(Map<String,List<Transport>> transports) {
        this.transports = transports;
    }

    public void addCities(Cities city){
    cities.add(city);
    }

    public void addTransport(Transport transport ){
        if (transport instanceof EarthTranspotr){
            transports.get("earth").add(transport);
        }if (transport instanceof AirTransport){
            transports.get("air").add(transport);
        }if (transport instanceof WaterTransport){
            transports.get("water").add(transport);
        }
    }

    public void raschet(Cities from,Cities to,int numberPassengers,double weight) {
        ArrayList<Transport> transportEnd = new ArrayList<>();
        searchTransport(from, to, transportEnd);

        transportEnd.sort(((Comparator<Transport>) (o1, o2) -> o2.getSpeed() - o1.getSpeed()).thenComparing((o1, o2) -> o1.getPrice() - o2.getPrice()));

        if (transportEnd.size() == 0) {
            System.out.println("Нет подходящего транспорта из "+ from.getName()+" в "+ to.getName());
        } else {
            System.out.println("Подходящий транспорт из "+ from.getName()+" в "+ to.getName());
            searchSuitableTransport(numberPassengers, weight, transportEnd);
            System.out.println("=========================================================================");
            System.out.println("Подходящий транспорт с учетом рентабильности из "+ from.getName()+" в "+ to.getName());
            if (searchRentabilityTransport(numberPassengers, weight, transportEnd)){
            }else {
                System.out.println("Нет подходящего транспорта из "+ from.getName()+" в "+ to.getName());
                System.out.println("=========================================================================");
            }
        }
    }

    private void showTransport(ArrayList<Transport> transport) {
        for (Transport item:transport){
            item.show();
        }
    }

    private void searchSuitableTransport(int numberPassengers, double weight, ArrayList<Transport> transportEnd) {

        for (Transport item:transportEnd) {
            if (numberPassengers > item.getNumberPassengers() || weight>item.getWeight()){
            }else{
                item.show();

            }
        }

    }

    private boolean searchRentabilityTransport(int numberPassengers, double weight, ArrayList<Transport> transportEnd) {
        boolean flag;
        int i =0;
        for (Transport item:transportEnd) {
            if (numberPassengers > item.getNumberPassengers() || numberPassengers < item.getNumberPassengers()/2
                    || weight < item.getWeight()/2 || weight>item.getWeight()){
            }else{
                item.show();
                i++;
            }
        }
        if (i>0){
            return true;
        }else{
            return false;
        }
    }

    private void searchTransport(Cities from, Cities to, ArrayList<Transport> transportEnd) {
        if (from.getPort()&&to.getPort()){
            transportEnd.addAll(transports.get("water"));
        }
        if (from.getAirport()&&to.getAirport()){
            transportEnd.addAll(transports.get("air"));
        }
        transportEnd.addAll(transports.get("earth"));
    }

    public void showAllTransport(){
        Set<Map.Entry<String,List<Transport>>> a = transports.entrySet();
        System.out.println("Весь транспорт");
        for (Map.Entry<String,List<Transport>> item:a) {
            System.out.println(item.getKey() + " "+ item.getValue());
        }
        System.out.println("=======================================================================");
    }

    public void showCities(){
        for (Cities i:cities) {
            i.show();
        }

    }
}


