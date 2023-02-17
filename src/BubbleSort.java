import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter massive size:");
        int[] mas = new int[s.nextInt()];
        int buf;
        //filling the array
        System.out.println("unsorted array:");
        for (int i = 0; i < mas.length;i++){
            mas[i]= rand.nextInt(25)+1;
            System.out.printf("%d \t",mas[i]);
        }
        //bubble sorting
        for(int i = 1;i < mas.length;i++){
            for(int j=0; j < mas.length-i;j++){
                if(mas[j] > mas[j+1]){
                    buf = mas[j];
                    mas[j]= mas[j+1];
                    mas[j+1] = buf;
                }
            }
        }
        //array output
        System.out.println("\nsorted array:");
        for (int k : mas)
            System.out.printf("%d \t",k);
    }
}
