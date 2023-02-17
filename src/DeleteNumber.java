import java.util.Random;

public class DeleteNumber {
    public static void main(String[] args) {
        System.out.println("Enter massive size:");

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        int[] mas = new int[num];
        Random rd = new Random();
        for(int i = 0;i < num;i++){
            mas[i]= rd.nextInt(25);
            System.out.printf("%d \t",mas[i]);
        }
        System.out.println("\nEnter number. It will be deleted");
        int del = sc.nextInt();
        int sizeRez = num;
        for(int j=0;j<sizeRez;j++){
            if(del==mas[j]){
                for(int k=j;k<sizeRez-1;k++)
                {
                    mas[k]=mas[k+1];
                }
                mas[sizeRez-1]=0;
                sizeRez--;
                j--;
            }
        }
        for(int k : mas){
            System.out.printf("%d \t",k);
        }

    }
}