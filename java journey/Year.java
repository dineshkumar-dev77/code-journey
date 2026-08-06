import java.util.Scanner;
public class Year{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();
        
        int yearsIndays = days / 365;
        int remainingDays = days % 365;
        int weeks = remainingDays / 7;
        int remainingDaysAfterWeeks = remainingDays % 7;              
        
        System.out.println(days + " days is equivalent to:");
        System.out.println(yearsIndays + " years");
        System.out.println(weeks + " weeks");
        System.out.println(remainingDaysAfterWeeks + " days");

        scanner.close();
    }
}
