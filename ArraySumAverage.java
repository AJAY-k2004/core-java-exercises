import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int val : arr)
            sum += val;

        double avg = (double) sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        scanner.close();
    }
}
