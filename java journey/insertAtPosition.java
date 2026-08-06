/*public class insert {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int elementToInsert = 3;
        int position = 2; // Position where the element should be inserted

        // Create a new array with one extra space
        int[] newArr = new int[arr.length + 1];

        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[position] = elementToInsert;

        // Copy the remaining elements
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print the new array
        System.out.print("Array after insertion: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}*/


import java.util.Scanner;
public class insertAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {10,20,30,40};

        

        System.out.print("Enter the element to insert: ");
        int elementToInsert = sc.nextInt();
        System.out.print("Enter the position to insert (0-based index): ");
        int position = sc.nextInt();

        // Create a new array with one extra space
        int[] newArr = new int[arr.length + 1];

        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[position] = elementToInsert;

        // Copy the remaining elements
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print the new array
        System.out.print("Array after insertion: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}

