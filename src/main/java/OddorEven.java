import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("input num");
        a=sc.nextInt();
        if (a%2 == 0){
            System.out.println("even");
        }
        else
            System.out.println("odd");

    }

}
