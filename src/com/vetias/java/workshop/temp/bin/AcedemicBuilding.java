public class AcedemicBuilding {
    private boolean islibiraryavailable;
    private boolean isauditoriumavailable;

    public AcedemicBuilding(boolean islibiraryavailable, boolean isauditoriumavailable) {
        this.islibiraryavailable = islibiraryavailable;
        this.isauditoriumavailable = isauditoriumavailable;
    }
    public boolean isLibiraryAvailable() {
        return islibiraryavailable;
    }
    public void setLibiraryAvailable(boolean islibiraryavailable) {
        this.islibiraryavailable = islibiraryavailable;
    }
    public boolean isAuditoriumAvailable() {
        return isauditoriumavailable;
    }
    public void setAuditoriumAvailable(boolean isauditoriumavailable) {
        this.isauditoriumavailable = isauditoriumavailable;
    }
    @Override
    public void printdetails() {
        super.printDetails();
        System.out.println("Academic Building Details:");
        System.out.println("Library Available: " + islibiraryavailable);
        System.out.println("Auditorium Available: " + isauditoriumavailable);
    }


    
}
