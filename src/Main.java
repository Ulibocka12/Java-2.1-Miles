public class Main {
    public static void main(String[] args) {

        // Входные данные
        int ticketPrice = 1341; // Стоимость билета в рублях
        int costOfOneMile = 20; // Количество рублей для расчёта одной бонусной мили

        // Вывод сообщения о начислении бонусных миль
        int bonusMiles = ticketPrice / costOfOneMile;

        System.out.println((bonusMiles) + " бонусных миль");
    }
}