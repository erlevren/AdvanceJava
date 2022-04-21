package _17_Set;

import java.util.*;

public class Ex06 {
    // Task 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak şekilde
    //          1 den 20 e kadar olan sayılarla doldurup yazdırın
    // Task 2 : Bu SET i bir fonksiyonda diziye çeviriniz ve yazdırınız.
    public static void main(String[] args) {
        Set<Integer> setList = new HashSet<>();
        Random rnd = new Random();
        while (setList.size() < 10) {
            setList.add(rnd.nextInt(20));
        }
        System.out.println("Random Set = " + setList);
        diziyeCevir(setList);
    }
    private static void diziyeCevir(Set<Integer> setList) {
        ArrayList<Integer> list = new ArrayList<>(setList);
        System.out.println("Cevrilen Array = "+list);
    }
}
