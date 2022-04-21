package _17_Set;

import java.util.*;

public class HashSet02 {
    public static void main(String[] args) {
/*
 İcinde degerleri olan bir array i arraylist e cevirecek
    return tipi arrayList olacak bir metod yaziniz.
    {"reha", "hakan", "haluk", "ipek", "ahsen"}
    main metod altinda metod ile gelen listeyi kullanarak
     HashSet, TreeSet ve linkedHashSet leri doldurun.
 */
        String[] arr = {"reha", "hakan", "haluk", "ipek", "ahsen"};
        List list = arrayListeCevir(arr);
        System.out.println(list);
        Set<String> set1 = new HashSet<>();
        set1.addAll(list);
        System.out.println(set1);
        Set<String>set2 = new TreeSet<>();
        set2.addAll(list);
        System.out.println(set2);
        Set<String>set3 = new LinkedHashSet<>();
        set3.addAll(list);
        System.out.println(set3);
    }
    private static ArrayList arrayListeCevir(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String each:arr) {
            list.add(each);
        }
        return list;
    }


}
