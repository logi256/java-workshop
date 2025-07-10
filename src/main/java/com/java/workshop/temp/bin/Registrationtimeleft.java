package main.java.com.java.workshop.temp.bin;

import java.time.LocalTime;

public class Registrationtimeleft {

    public static void main(String[] args) {
    LocalTime currentTime = LocalTime.now();
    LocalTime registrationEndTime = LocalTime.of(17, 30, 30);
    int hoursLeft = registrationEndTime.getHour() - currentTime.getHour();
    int minutesLeft = registrationEndTime.getMinute() - currentTime.getMinute();
    int secondsLeft = registrationEndTime.getSecond() - currentTime.getSecond();
    System.out.println("you have " + hoursLeft + " hours, " + minutesLeft + " minutes, and " + secondsLeft + " seconds left to register.");
    }

}
