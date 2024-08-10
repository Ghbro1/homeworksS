package august10.task_3;

public class Main {
    public static void main(String[] args) {


        System.out.println("Простые числа от " + 2 + " до " + 100 );
        for (int num = 2; num <= 100; num++) {
            if (isSimple(num)) {
                System.out.println(num);
            }
        }
    }


    public static boolean isSimple(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }
        return true;

    }
}
