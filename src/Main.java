import java.util.Scanner;

public class Main {
    // Reads user input
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompts user for array length
        System.out.print("Array length: ");

        /*
        Feed the array length from the user into the readIntegers method
        Which in turn is called by the findMin method and stored within an integer
         */

        int minimum = findMin(readIntegers(scan.nextInt()));

        // Print out the minimum element
        System.out.println("The minimum element in the array is " + minimum);

        // Exit the program
        System.exit(0);

    } // End of method
   // readIntegers

    // Reads the array elements from the user
    public static int[] readIntegers(int count) {

        // Create a new array with user specification
        int[] array = new int[count];

        // Prompt user to enter elements of the array
        for (int i = 0; i < count; i++) {

            System.out.print("Element " + i + " : ");
            array[i] = scan.nextInt();
        }

        return array;

    } // End of method
   // method findMin

    public static int findMin(int[] array) {

        int smallest = array[0]; // Stores the smallest integer

        // Loop through array looking for smallest integer
        for (int i = 0; i < array.length; i++) {

            // Checking for smallest integer in array
            if (smallest > array[i]) {
                smallest = array[i];
            }
        } // End of loop

        return smallest;

    } // End of method
} // End of class

