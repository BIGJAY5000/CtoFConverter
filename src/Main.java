import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double tempC = 0;
        double tempF = 0;
        boolean done = false;


        do {
            //prompt
            System.out.println("Please enter a temperature in Celcius: ");
            //input
            if (scan.hasNextDouble()) {
                tempC = scan.nextDouble();
                scan.nextLine();
                done = true;
            }
            else {
                System.out.println("You have entered an invalid Temp. Try again");
                scan.nextLine();
            }
        } while (!done);
        tempF = (tempC * 9/5) + 32;
        System.out.printf("\n%-10s %5.2f", "Celcius:", tempC);
        System.out.printf("\n%-10s %5.2f", "Fahrenheit:", tempF);





    }
}