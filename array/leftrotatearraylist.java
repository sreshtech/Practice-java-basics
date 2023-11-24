import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k %= n;

        reverseSubArray(arr, 0, k - 1);
        reverseSubArray(arr, k, n - 1);
        reverseSubArray(arr, 0, n - 1);

        return arr;
    }

    public static void reverseSubArray(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int numElements = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
       
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            list.add(element);
        }

        System.out.print("Enter the number of rotations to the left: ");
        int rotations = scanner.nextInt();

        list = rotateArray(list, rotations);

        System.out.println("Rotated Array:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
