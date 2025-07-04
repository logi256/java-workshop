public class Zone {
    private String name;
    private int zoneId;
    private String Type;
    private double area;

    public Zone(String name, int zoneId, String type, double area) {
        this.name = name;
        this.zoneId = zoneId;
        Type = type;
        this.area = area;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getZoneId() {
        return zoneId;
    }
    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    
    
}


