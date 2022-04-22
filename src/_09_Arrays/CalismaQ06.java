package _09_Arrays;

import java.util.Arrays;

public class CalismaQ06 {
    /*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)

	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	*/
    public static void main(String[] args) {
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int minNum = arr[0];
        int maxNum = arr[arr.length - 1];
        int maxIkinciNum = arr[arr.length - 2];
        System.out.println(minNum);
        System.out.println(maxNum);
        System.out.println(maxIkinciNum);

    }
}
