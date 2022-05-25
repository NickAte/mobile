public class Main {
    public static void main(String[] args) {

        int balans = 300;
        int refill = 1300;
        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Баланс: " + (balans + refill));
        System.out.println("Начислено бонусов: " + bonus);
    }
}