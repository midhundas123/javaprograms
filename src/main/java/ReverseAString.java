public class ReverseAString {

    public static void main(String[] args) {
        String x = "hello world";
        char [] y = x.toCharArray();
        for (int i = y.length-1; i >= 0; i--){
            System.out.println(y[i]);
        }
    }

}
