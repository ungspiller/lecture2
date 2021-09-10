import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        System.out.println("Which number do you want in roman?");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("%d in roman is %s", number, toRoman(number));


    }

    public static String toRoman(int number){
        int [] romanValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] romanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String returnValue = "";
        for (int i = 0; i <= romanValues.length - 1; i++){
            while (number >= romanValues[i]){
                number -= romanValues[i];
                returnValue += romanNumerals[i];
            }
        }
        return returnValue;
    }
}
