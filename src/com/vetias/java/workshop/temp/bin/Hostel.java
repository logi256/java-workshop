import java.time.LocalDateTime;

public class Hostel extends Building {
    public Hostel(String name, double area, int floors, LocalDateTime openHours, LocalDateTime closeHours) {
            super(name, area, floors, openHours, closeHours);
        }
    private boolean isMessavailable;
    private int Roomsavailable;

    public void setMessavailable(boolean aisMessavailable) {
        isMessavailable = aisMessavailable;
    }
    public boolean getMessavailable(){
        return isMessavailable;
    }
    public int getIsRoomsavailable() {
        return Roomsavailable;
    }
    public void setIsRoomsavailable(int isRoomsavailable) {
        this.Roomsavailable = isRoomsavailable;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Hostel Building Details:");
        System.out.println("Mess Available: " + isMessavailable);
        System.out.println("Rooms Available: " + Roomsavailable);
    }



}
    

    

