import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Массивы-2");
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int amountOfExpenses = 0;
        for (int days = 0; days < arr.length; days++) {
            amountOfExpenses = amountOfExpenses + arr[days];
        }
        System.out.println("Сумма трат за месяц составилв " + amountOfExpenses + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] month = generateRandomArray();
        System.out.println(Arrays.toString(month));

        int minimumWaste = 0;
        int maximumWaste = 0;
        int minDay = 0;
        int maxDay = 0;
        if (month.length == 0) {
            System.out.println("Нет трат за месяц");
        }
        minimumWaste = month[0];
        maximumWaste = month[0];
        for (int day = 0; day < month.length; day++) {
            if (month[day] < minimumWaste) {
                minimumWaste = month[day];
                minDay = day;
            }
            if (month[day] > maximumWaste) {
                maximumWaste = month[day];
                maxDay = day;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumWaste + " рублей в " + minDay + " день. " +
                "Максимальная сумма трат за день составила " + maximumWaste + " рублей в " + maxDay + " день.");
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");


    }

    public static void task4() {
        System.out.println("Задача 4");

    }
}