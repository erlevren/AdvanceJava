package _17_Set;

import java.util.HashSet;

public class Q07 {
    /*  TASK :
     * 1-main method altinda bir double hashSet olusturunuz.
     ve bu seti, adi setOlustur ve return tipi hashSet double olan
     ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini
     kullanarak doldurun.

       2-Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul
       edecek ayri bir method olusturarak

     * hashSetin degerlerinin toplamini alacaksiniz.
     */
    public static void main(String[] args) {
        HashSet<Double> hashSetList = new HashSet<>();
        setOlustur(hashSetList);
        System.out.println(hashSetList);
        toplaminiAl(hashSetList);

    }
    private static HashSet setOlustur(HashSet<Double> hashSetList) {
        hashSetList.add(3.23);
        hashSetList.add(3.10);
        hashSetList.add(5.12);
        hashSetList.add(10.12);
        hashSetList.add(23.12);
        return hashSetList;
    }
    private static void toplaminiAl(HashSet<Double> hashSetList) {
        Double toplam = 0.0;
        for (Double each:hashSetList) {
            toplam+=each;
        }
        System.out.println("HashSet elemanlari toplami = "+toplam);

    }
}
