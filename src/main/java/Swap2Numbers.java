import java.util.Scanner;

public class Swap2Numbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("input 1st num");
        a=sc.nextInt();
        System.out.println("input 2st num");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }

}
