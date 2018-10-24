package Cities;

import java.util.Objects;

public class Cities implements Comparable<Cities> {
    private String name;
    private boolean airport;
    private boolean port;

    public Cities(String name, boolean airport, boolean port) {
        this.name = name;
        this.airport = airport;
        this.port = port;
    }

    public Cities() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getAirport() {
        return airport;
    }

    public void setAirport(boolean airport) {
        this.airport = airport;
    }

    public boolean getPort() {
        return port;
    }

    public void setPort(boolean port) {
        this.port = port;
    }

    public void show(){
        System.out.println("Города:" +" name=" + name  + ", airport=" + airport + ", port=" + port);
    }

    @Override
    public int compareTo(Cities o) {
        return  getName().compareTo(o.getName());
    }
}
