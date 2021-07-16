import java.util.Scanner;

public class LargestOfArray {

    public static void main(String[] args) {
        int large;
        int [] array;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");

        int n= sc.nextInt();
        int [] x = new int [n];
        System.out.println("enter the number of elements");

        for (int i = 0; i<n ;i++){
            x[i]=sc.nextInt();
        }
        large = x[0];
        for (int i = 0; i<n ;i++){
            if (x[i]>large){
                large=x[i];
            }
        }
        System.out.println("large" + large);

    }

}
