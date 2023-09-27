/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jelly_joneske
 */
import java.util.Scanner;
public class DisplayAverage {
    public static void main(String[] args) {
       Scanner con = new Scanner(System.in);
       System.out.println("Enter prelim grade:");
      double prelimgrade = con.nextDouble();
      System.out.println("Enter midterm grade:");
      double midtermgrade = con.nextDouble();
      System.out.println("Enter prefinal grade:");
      double prefinalgrade = con.nextDouble();
       System.out.println("Enter final grade:");
      double finalgrade = con.nextDouble();
      double average = (prelimgrade + midtermgrade + prefinalgrade + finalgrade) /4;
    System.out.println( "The Total Average is:" + average);
    if(average <74){
        System.out.println("Remark: FAILED!");
    } else
        System.out.println("Remark: PASSED!");
    }
    
}
