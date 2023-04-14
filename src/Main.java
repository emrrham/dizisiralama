import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner ek = new Scanner(System.in);
        System.out.println("Dizideki boyutu giriniz : ");
        int i = ek.nextInt();
        int[] list = new int[i];

            System.out.println("Dizideki elemanları gir : ");
            for (int k = 0; k<i;k++) {
                System.out.println((i+1)+ ". Elemanı :");
                list[k] = ek.nextInt();
            }
        Arrays.sort(list);
            System.out.println(Arrays.toString(list));
    }
}