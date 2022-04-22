package _09_Arrays;

import java.util.Arrays;

public class CalismaQ05 {
    /*  TASK :
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * 1. Task :
     * (dizi elemanlarinin ortalama degerini hesaplayan
     * 2. Task :
     * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     * Output : 5 6 7
     *
     */
    public static void main(String[] args) {
        //1. Task :
        int toplam = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int each : arr) {
            toplam += each;

        }
        System.out.print(toplam + " ");
        //2. Task :
        System.out.println();
        int ort = toplam / arr.length;
        System.out.println(ort);
        //3. Task : ortalamanin ustundeki sayilar
        System.out.print("Ortalamanin ustundeki sayilar = ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ort){
                System.out.print(+arr[i]+" ");
            }
        }
    }
}

