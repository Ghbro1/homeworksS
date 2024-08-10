package august10.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 101);
        }
        Arrays.sort(arr);
        System.out.println("Наибольшее число:  " + arr[arr.length-1]);
        System.out.printf("Наименьшее число:  %d\n", arr[0]);
        System.out.println("Сред ариф:  " + averArifNum(arr));
        System.out.println("Массив в порядке убывания " + Arrays.toString(decendingOrder(arr)));
    }
    static int averArifNum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum/arr.length;
    }
    static int[] decendingOrder(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
