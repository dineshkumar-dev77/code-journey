public class program {
public static void main(String[] args) {
    int[] height = {4, 4, 1,2,6, 6, 6, 6, 2};
    int max = height[0];
    int count = 1;
    for (int i = 0; i < height.length; i++) {
        if (height[i] > max) {
            max = height[i];
            count=1;
        }
        else if (height[i] == max) {
            count++;
                   
            }
        }
    System.out.println(count);
    }
     
}    
