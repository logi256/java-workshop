package main.java.com.java.workshop.temp.bin;

import java.util.Arrays;

    public class Employee {
        public static void main(String[] args) {
            String[][] emp = new String[5][3];

    emp[0][0]="LOKI";
    emp[0][1]="100000";
    emp[0][2]="HR";

    emp[1][0]="THOR";
    emp[1][1]="120000";
    emp[1][2]="Finance";

    emp[2][0]="HULK";
    emp[2][1]="150000";
    emp[2][2]="IT";

    emp[3][0]="SPIDERMAN";
    emp[3][1]="130000";
    emp[3][2]="Marketing";

    emp[4][0]="CAPTAIN AMERICA";
    emp[4][1]="140000";
    emp[4][2]="Sales";

    for (String[] employee : emp) {
        System.out.println(Arrays.toString(employee));
    }
}

}
