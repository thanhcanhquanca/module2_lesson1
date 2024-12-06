import java.util.Scanner;

public class Numbertoword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number (0 - 999):");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if (number < 10) {
            System.out.println(getSingleDigitWord(number));
        } else if (number < 20) {
            System.out.println(getTeensWord(number));
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            System.out.println(getTensWord(tens) + (ones != 0 ? " " + getSingleDigitWord(ones) : ""));
        } else {

            int hundreds = number / 100;
            int remainder = number % 100;
            String result = getSingleDigitWord(hundreds) + " hundred";
            if (remainder != 0) {
                if (remainder < 10) {
                    result += " and " + getSingleDigitWord(remainder);
                } else if (remainder < 20) {
                    result += " and " + getTeensWord(remainder);
                } else {
                    int tens = remainder / 10;
                    int ones = remainder % 10;
                    result += " and " + getTensWord(tens) + (ones != 0 ? " " + getSingleDigitWord(ones) : "");
                }
            }
            System.out.println(result);
        }
    }


    public static String getSingleDigitWord(int number) {
        switch (number) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    public static String getTeensWord(int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    public static String getTensWord(int number) {
        switch (number) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
