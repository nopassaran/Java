
public class Airport {
    private static int id = 0;
    private String name;
    private String city;
    private String country;

    public Airport(String name, String city, String country) {
        id+=1;
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Airport.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
    
}
