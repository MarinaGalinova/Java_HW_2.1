public class Main {

    public static void main(String[] args) {

        int cost = 100; // стоимость билета
        int amount = 20; // количество бонусных миль для 1 бонусного балла
        int bonusMiles = cost / amount; // Бонусных миль начислено

        System.out.println("Начислено " + bonusMiles + " бонусных миль");

    }
}