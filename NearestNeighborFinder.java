import java.util.Scanner;

public class NearestNeighborFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        NearestNeighborCalculator calculator = new NearestNeighborCalculator(array);
        int index = calculator.findNearestNeighbor();

        System.out.println("The index of the first number with the smallest distance to its neighbor is: " + index);
    }
}
