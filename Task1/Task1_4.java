
// package String.Task1;
import java.util.Scanner;

class InvalidRepalcementExceptions extends Exception {
    public String toString() {
        return "Enter a valid format input.";
    }

    public String getMessage() {
        return "Plz check the values of each element.";
    }

}

public class Task1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter s string = ");
        String s = scan.nextLine();

        System.out.println("Enter replacements string = ");
        String replacements = scan.nextLine();

        String regex = "^[0-9]+$";
        String regex1 = "^[0-9][a-zA-Z]*$";

        boolean check1 = s.matches(regex);
        boolean check2 = replacements.matches(regex1);

        char[] charArr1 = s.toCharArray();
        char[] charArr2 = replacements.toCharArray();
        boolean check3 = true;
        for (int i = 0; i < replacements.length(); i = i + 2) {
            for (int j = 0; j < s.length(); j++) {
                if (charArr2[i] == charArr1[j]) {
                    check3 = true;

                }
                check3 = false;
            }
        }

        if (!check1 || !check2 || !check3) {
            try {
                throw new InvalidRepalcementExceptions();
            } catch (Exception e) {
                System.out.print(e.toString());
                System.out.print("\n" + e.getMessage());
            }
        } else {
            String str = modify(s, replacements);
            System.out.println("\nOutout String = " + str);
        }

    }

    public static String modify(String s, String replacements) {

        char[] charArr1 = s.toCharArray();
        char[] charArr2 = replacements.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < replacements.length(); j = j + 2) {
                if (charArr1[i] == charArr2[j])
                    charArr1[i] = charArr2[j + 1];
            }
        }

        s = String.valueOf(charArr1);
        return s;
    }
}
