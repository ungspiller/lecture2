import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        System.out.println("Which number do you want in roman?");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("%d in roman is %s", number, toRoman(number));


    }

    public static String toRoman(int number){
        String romanLiteral = "";
        for (int i = 0; i < number; i++){
            romanLiteral += "I";
        }
        return romanLiteral;
    }
}
