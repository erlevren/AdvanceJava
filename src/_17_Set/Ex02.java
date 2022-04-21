package _17_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02 {

    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1=arrListHazirla(10,0,20);
        list2=arrListHazirla(5,0,20);

        System.out.println(list1);
        System.out.println(list2);

        //list1.retainAll(list2);
        //System.out.println("Ortak elemanli list : "+list1);
        list1.removeAll(list2);
        System.out.println(list1);
        list2.removeAll(list1);
        System.out.println(list2);

    }
    public static int getRandomInt(int min,int max){
        return (int) (Math.random()*(max-min+1));
    }

    private static List<Integer> arrListHazirla(int size, int min, int max) {
        List<Integer>bosList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            bosList.add(getRandomInt(min,max));

        }
        return bosList;

    }
}
