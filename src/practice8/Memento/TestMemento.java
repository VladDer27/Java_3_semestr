package practice8.Memento;

public class TestMemento {
    public static void main(String[] args) {
        Exchange exchange = new Exchange(10, 10);
        Memory memory = new Memory(exchange);

        exchange.getDollars();
        exchange.getEuros();
        System.out.println("Продажа доллара, покупка евро");

        exchange.sell();
        exchange.buy();

        exchange.getDollars();
        exchange.getEuros();

        System.out.println("Сохранение состояния");
        memory.backup();

        System.out.println("Продажа доллара, покупка евро");
        exchange.sell();
        exchange.buy();

        exchange.getDollars();
        exchange.getEuros();

        System.out.println("Восстановление состояния");
        memory.undo();

        exchange.getDollars();
        exchange.getEuros();
    }
}
