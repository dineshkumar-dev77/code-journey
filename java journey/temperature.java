import java.util.Scanner;
public class temperature {
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        System.out.print("Enter temperature : ");
        int temp = f.nextInt();
        if(temp<0){
            System.out.println("Freezing weather");
        }else if(temp>=0 && temp<10){
            System.out.println("Very Cold weather");
        }else if(temp>=10 && temp<20){
            System.out.println("Cold weather");
        }else if(temp>=20 && temp<30){
            System.out.println("Normal in Temp");
        }else if(temp>=30 && temp<40){
            System.out.println("Its Hot");
        }else if(temp>=40){
            System.out.println("its very hot");
        }

    }
}        