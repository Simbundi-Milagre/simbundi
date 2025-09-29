/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carspeed;

/**
 *
 * @author lab_services_student
 */
public class CarSpeed {

       public static void main(String[] args) {
        // TODO code application logic here
        String[] city = {"JHB", "DBN", "CTN", "PE"};
        int[][] speeds = {
            {128, 135, 139},
            {155, 129, 175},
            {129,130,185},
            {195, 155, 221}
            
    };
                
        System.out.println("Speeding Fines REPORT");
        System.out.println("----------------------------");
        System.out.printf("%-5s%-12s%-10s%-10s%n", "", "JAN", "FEB", "MAR");

        for (int i = 0; i < city.length; i++) {
            System.out.printf("%-5s", city[i]);
            for (int j = 0; j < speeds[i].length; j++) {
                System.out.printf("%-12s", speeds[i][j]+"km");
            }
            System.out.println();
        }
        
        System.out.println("\nSpeeding FINES STATISTICS");
        System.out.println("----------------------------");

        int lowest = speeds[0][0];
        for (int row = 0; row < speeds.length; row++) {
            for (int cols = 0; cols < speeds[row].length; cols++) {
                if (speeds[row][cols] < lowest) {
                    lowest = speeds[row][cols];
                }
            }
        }

        int highest = speeds[0][0];
        for (int row = 0; row < speeds.length; row++) {
            for (int cols = 0; cols < speeds[row].length; cols++) {
                if (speeds[row][cols] > highest) {
                    highest = speeds[row][cols];
                }
            }
        }
        System.out.println("Maximun Speed Captuted:  " + highest + "km");
        System.out.println("Minimum Speed Captured:  " + lowest + "km");

    }

}

