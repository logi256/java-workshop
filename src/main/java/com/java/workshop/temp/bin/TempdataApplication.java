package main.java.com.java.workshop.temp.bin;
import java.time.LocalDate;



public class TempdataApplication {
    public static void main(String[] args) {

        Orgranaization vet =  new Orgranaization("Velalar Educational Trust", "Dindigul, Erode", 1234567890,
                "vetias@dindulgmail.com", "www.vetias.com", 123456, LocalDate.of(2025, 07, 14));


        System.out.println(vet.name());
        System.out.println(vet.address());
        System.out.println(vet.contactNumber());
        System.out.println(vet.email());
        System.out.println(vet.website());
        System.out.println(vet.registrationNumber());
        System.out.println(vet.registrationNumber());
;
         
    }
}
