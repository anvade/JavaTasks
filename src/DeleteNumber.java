import java.util.Random;

public class DeleteNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter massive size:");
        int num = sc.nextInt();
        int[] mas = new int[num];
        // filling the array
        for(int i = 0;i < num;i++){
            mas[i]= rd.nextInt(25);
            System.out.printf("%d \t",mas[i]);
        }
        System.out.println("\nEnter number. It will be deleted");
        int del = sc.nextInt();
        int sizeRez = num;
        // deleting and shifting numbers
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
        //array output
        for(int k : mas){
            System.out.printf("%d \t",k);
        }

    }
}