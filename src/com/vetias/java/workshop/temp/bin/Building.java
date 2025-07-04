import java.time.LocalDateTime;

public class Building {
    private String name;
    private double area;
    private int floors;
    private LocalDateTime openHours;
    private LocalDateTime CloseHours;  

    public Building(String name, double area, int floors, LocalDateTime openHours, LocalDateTime closeHours) {
        this.name = name;
        this.area = area;
        this.floors = floors;
        this.openHours = openHours;
        this.CloseHours = closeHours;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public LocalDateTime getOpenHours() {
        return openHours;
    }
    public void setOpenHours(LocalDateTime openHours) {
        this.openHours = openHours;
    }
    public LocalDateTime getCloseHours() {
        return CloseHours;
    }
    public void setCloseHours(LocalDateTime closeHours) {
        CloseHours = closeHours;
    }
    public void printDetails() {
        System.out.println("Building Name: " + name);
        System.out.println("Area: " + area + " sq.m");
        System.out.println("Number of Floors: " + floors);
        System.out.println("Open Hours: " + openHours);
        System.out.println("Close Hours: " + CloseHours);
    }
    
    
    
}

