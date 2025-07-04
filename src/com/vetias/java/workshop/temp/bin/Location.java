public class Location {
    private String name;
    private double alatitude;
    private double alongitude;
     private String description;
      private String country;
       private String city;
        private String address;
         private String Postalcode;

    public Location(String name, double alatitude, double alongitude, String description, String country, String city, String address, String postalcode) {
        this.name = name;
        this.alatitude = alatitude;
        this.alongitude = alongitude; 
        this.description = description;
        this.country = country;
        this.city = city;
        this.address = address;
        this.Postalcode = postalcode;
    
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAlatitude() {
        return alatitude;
    }
    public void setAlatitude(double alatitude) {
        this.alatitude = alatitude;
    }
    public double getAlongitude() {
        return alongitude;
    }
    public void setAlongitude(double alongitude) {
        this.alongitude = alongitude;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPostalcode() {
        return Postalcode;
    }
    public void setPostalcode(String postalcode) {
        Postalcode = postalcode;
    }
}
    
    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", alatitude=" + alatitude +
                ", alongitude=" + alongitude +
                ", description='" + description + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", Postalcode='" + Postalcode + '\'' +
                '}';
    }

