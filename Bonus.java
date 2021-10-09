public class Bonus {
    public static void main(String[] args) {

        // Задаем исходный баланс телефонного счета
        // и сумму пополнения
        float balance = 546F;
        float income = 1600.56F;

        // Бонусы зачисляются при пополнении свыше 100 рублей
        int bonus = (income > 1000) ? ((int) income / 100) : 0;

        // Итоговый баланс после пополнения
        balance += income + bonus;

        // Вывод итогового баланса и сумму бонуса
        System.out.println("Balance: " + balance);
        System.out.print("Bonus: " + bonus);
    }
}
