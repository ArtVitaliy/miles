public class Main {
    public static void main(String[] args) {
        int amount = 100; // стоимость билета
        int bonusMiles = 20; // количество рублей для одной бонусной мили
        int bonus = amount / bonusMiles; // бонусные мили

        System.out.println("Бонусные мили: " + bonus);
    }
}