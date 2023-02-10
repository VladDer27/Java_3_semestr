package practice2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class HumanStream {
    private int humanCount = 0;
    public Stream<Human> HumansToStream(){
        Human mark = new Human(15, "Mark", "Smith", LocalDate.of(2008, 9, 5),45);
        Human john = new Human(21, "John", "Newman", LocalDate.of(2002, 12, 25),70);
        Human mary = new Human(14, "Mary", "Robbie", LocalDate.of(2009, 3, 18),40);
        Human kira = new Human(18, "Kira", "Cole", LocalDate.of(2005, 6, 3),52);
        Human anya = new Human(20, "Anya", "Chasovskih", LocalDate.of(2003, 4, 14), 50);
        List humanList = new ArrayList<>();
        humanList.add(mark);
        humanCount ++;
        humanList.add(mary);
        humanCount ++;
        humanList.add(kira);
        humanCount ++;
        humanList.add(john);
        humanCount ++;
        humanList.add(anya);
        humanCount ++;
        Stream<Human> stream = humanList.stream();
        return stream;
    }
    public void ageSort(Stream<Human> stream){
        stream.sorted((human1,human2)-> (Integer.compare((Integer) human2.getAge(), (Integer) human1.getAge()))).forEach(System.out::println);
    }

    public void dataAgeSort(Stream<Human> stream){
        stream.sorted(Comparator.comparing(Human::getBirthDate)).forEach(System.out::println);
    }
    public void printHuman(Stream<Human> stream) {
        stream.forEach(System.out::println);
    }

    public void filterByName(Stream<Human> stream){
        stream.filter(human -> human.getFirstName().startsWith("A"))
                .forEach(System.out::println);
    }

    public double averageWeight(Stream<Human> stream){
        double weight = (double)stream.mapToInt(Human::getWeight).sum() / humanCount;
        return weight;
    }
}
