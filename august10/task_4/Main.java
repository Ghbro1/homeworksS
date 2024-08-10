package august10.task_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[10001];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        System.out.print("Введите число для поиска: ");
        int target = scanner.nextInt();
        boolean result = isNumHere(arr, target);
        System.out.println("Число " + target + " " + (result ? "присутствует" : "отсутствует") + " в массиве.");
    }

    static boolean isNumHere(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
        }
    }

