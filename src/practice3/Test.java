package practice3;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    private  static Set<Integer> set = new SetSemaphore<>();
    private  static List<Integer> list = new ListSync<>()   ;
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 21; i++) {
                set.add(i);
                list.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 15; i < 30; i++) {
                set.add(i);
                list.add(i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Set:");
        set.forEach(System.out::println);

        System.out.println("Sync list:");
        list.forEach((value)-> System.out.println(value));
    }
}

