package _17_Set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

    /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanlari set'e convert eden bir method create ediniz
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */

    public static void main(String[] args) {

        HashSet<Integer> hset = new HashSet<>();
        int[] arr = {11, 12, 15, 21, 65, 45, 98, 45, 12, 10, 25, 32};
        elementEkle(arr, hset);
    }

    private static void elementEkle(int[] arr, Set<Integer> hset) {
        for (Integer each : arr) {
            hset.add(each);
        }
        setiyazdir(hset);
    }

    private static void setiyazdir(Set<Integer> hset) {
        System.out.println(hset);
    }

}
