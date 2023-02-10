package practice2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вывод потока: ");
        HumanStream humanStream = new HumanStream();
        Stream<Human> listHuman =  humanStream.HumansToStream();
        humanStream.printHuman(listHuman);

        System.out.println("Обратная сортировка по возрасту: ");
        HumanStream humanStream1 = new HumanStream();
        Stream<Human> listHuman1 =  humanStream1.HumansToStream();
        humanStream1.ageSort(listHuman1);

        System.out.println("Фильтр с буквой А");
        HumanStream humanStream2 = new HumanStream();
        Stream<Human> listHuman2 =  humanStream2.HumansToStream();
        humanStream2.filterByName(listHuman2);

        System.out.println("Сортировка по дате рождения");
        HumanStream humanStream3 = new HumanStream();
        Stream<Human> listHuman3 =  humanStream3.HumansToStream();
        humanStream3.dataAgeSort(listHuman3);

        System.out.println("Средний вес: ");
        HumanStream humanStream4 = new HumanStream();
        Stream<Human> listHuman4 =  humanStream4.HumansToStream();
        System.out.println(humanStream4.averageWeight(listHuman4));
    }
}
