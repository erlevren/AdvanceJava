package _17_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Q03 {
    public static void main(String[] args) {
        //Task 1 : 30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            list.add(rnd.nextInt(10));
        }
        //Task 2 : 1. adımdaki arraylist print edin.
        System.out.println("Random List = " + list);
        //Task 3 : 2. adimdaki arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        tekrarEdenleriSil(list);
        System.out.println("Tekrarsiz list = "+list);
        //Task 4 : Basta hazirlanan arraylist'i Set'e cevirin
        Set<Integer> seteCevrilenList = new HashSet<>(list);
        System.out.println("Set`e cevrilen list = "+seteCevrilenList);
        //Task 5 : Hazirlanan bu Set'i de Arraylist'e cevirin
        ArrayList<Integer>listeCevrilenSet = new ArrayList<>(seteCevrilenList);
        System.out.println("ArrayList`e cevrilen Set = "+listeCevrilenSet);
    }
    private static void tekrarEdenleriSil(ArrayList<Integer> list) {
        //ArrayList<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }
}

