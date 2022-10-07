public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 7. Задание 1.1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Урок 7. Задание 1.2");
        for (int h = 10; h >= 1; h--) {
            System.out.println("итерация обратный счет " + h);
        }
        System.out.println("Урок 7. Задание 1.3");
        for (int k = 2; k <= 17; k = k + 2) {
            System.out.println("число " + k + " является четным");
        }
        System.out.println("Урок 7. Задание 1.4");
        for (int t = 10; t >= -10; t--) {
            System.out.println("числа в порядке от бОльшего к меньшему " + t);
        }
        System.out.println("Урок 7. Задание 2.5");
        for (int s = 1904; s <= 2096; s = s + 4) {
            System.out.println(s + " - год является високосным");
        }
        System.out.println("Урок 7. Задание 2.6"); // вывести в консоль последовательность цифр (+7)
        for (int u = 7; u <= 98; u = u + 7) {
            System.out.println(u);
        }
        System.out.println("Урок 7. Задание 2.7"); // вывести в консоль последовательность цифр (*2)
        for (int z = 1; z <= 512; z = z * 2) {
            System.out.println(z);
        }
        System.out.println("Урок 7. Задание 3.8"); // банковский вклад ежемесячный рост
        int bankTotal = 0; // вклад в банке
        int monthSum = 29_000; // ежемесячное пополнение
        for (int v = 1; v <= 12; v++) {
            bankTotal = bankTotal + monthSum;
            System.out.println("Месяц " + v + " cумма накоплений равна " + bankTotal);
        }
        System.out.println("Урок 7. Задание 3.9 банковский вклад под 12% годовых"); // банковский вклад под 12% годовых
        int bankTotalTask = 0; // вклад в банке
        int monthSumTask = 29_000; // ежемесячное пополнение
        for (int w = 1; w <=12; w ++) {
            bankTotalTask = bankTotalTask + bankTotalTask / 100;
            bankTotalTask = bankTotalTask + monthSumTask;
            System.out.println("Месяц " + w + " cумма накоплений равна " + bankTotalTask);
        }
    }
}
