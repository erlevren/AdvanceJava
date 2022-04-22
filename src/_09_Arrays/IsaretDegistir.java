package _09_Arrays;

public class IsaretDegistir {
    public static void isaretDegistir(int[] arr) {
        for (int each:arr) {
            each*=-1;
            System.out.print(each+" ");
        }
    }
}
