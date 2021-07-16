import java.util.Scanner;

public class RemoveWhiteSpacesFromString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        char[] ch = input.toCharArray();
        StringBuilder Y = new StringBuilder();

        for (char c : ch){
            if (!Character.isWhitespace(c)){
                Y.append(c);
            }

        }
        System.out.println("PRINTING AFTER REMOVING WHITE SPACE   "+Y.toString());

    }

    }
