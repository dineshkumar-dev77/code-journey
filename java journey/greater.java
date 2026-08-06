import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int p = 0, q = 0, r = 0, s = 0;
        
        
            
            
            p = scanner.nextInt();
            q = scanner.nextInt();
            r = scanner.nextInt();
            s = scanner.nextInt();

            
            boolean pIsEven = (p % 2 == 0);
            boolean othersArePositive = (q > 0 && r > 0 && s > 0);

            if (pIsEven && othersArePositive) {
                

                int sum1= p+q;
                int sum2=r+s;
                if(q>r && s>p && sum2>sum1) {
                
                        System.out.println("correct values");
                    }else{
                        System.out.println("wrong values");
                    }

                }
             scanner.close();
        }
       
}

       
    
    

