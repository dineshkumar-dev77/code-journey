import java.util.Scanner;
public class electricityBill {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        double unitsConsumed =f.nextDouble();
        double billAmount = calculateBill(unitsConsumed);
        System.out.println("Electricity Bill for " + billAmount);
    }

    public static double calculateBill(double units) {
        double bill = 0;

        if (units <200) {
            bill = units * 1.2; 
        } else if (units >= 200 && units<400) {
            bill = (200 * 1.2) + ((units - 200) * 1.5); 
        } else if (units >=400 && units<600) {
            bill = (200 * 1.2) + (200 * 1.5) + ((units - 400) * 1.8); 
        } else {
            bill = (200 * 1.2) + (200 * 1.5) + (200 * 1.8) + ((units - 600) * 2.0); 
        }
        if (bill > 400) {
            bill = bill + (bill * 0.15);
        }
        return bill;

       
        }
            
    }

