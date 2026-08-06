import java.util.Scanner;
public class deletionAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        System.out.print("Enter the position to delete (0-based index): ");
        int position = sc.nextInt();
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        for (int i = position; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        System.out.print("Array after deletion: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
