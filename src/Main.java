public class Main {
    public static void main(String[] args) {
        int initial = 250;
        int paid = 1100;
        int bonus;

        if (paid >= 1000) {
            bonus = paid / 100;
        } else {
            bonus = 0;
        }
        int total = initial + paid + bonus;
        System.out.println("Итоговый счет: " + total);
        System.out.println("Бонусы: " + bonus);
    }
}