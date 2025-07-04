public class Hostel extends Building {
     
    private  boolean ismessAvailable;
    private  int numbersofclasroom;
    public void setIsmessAvailable(boolean ismessAvailable) {
        this.ismessAvailable = ismessAvailable;
    }
    public void setNumbersofclasroom(int numbersofclasroom) {
        this.numbersofclasroom = numbersofclasroom;
    }
    public boolean isIsmessAvailable() {
        return ismessAvailable;
    }
    
    public int getNumbersofclasroom() {
        return numbersofclasroom;
    }
    
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println();
    }
  }
    

    

