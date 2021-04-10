import java.util.Scanner;

public class Task3_3{
    public static void main(String[] args) {
        startGame("SHAMBHO");
      
    }

    public static void startGame(String S) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder(S);
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != 'A' && S.charAt(i) != 'E' && S.charAt(i) != 'I' && S.charAt(i) != 'O' && S.charAt(i) != 'U') {
                count++;
                stringBuilder.append("_");
            }
            else
                stringBuilder.append(S.charAt(i));
        }
        System.out.print(stringBuilder1);

    int chances = count + 3;
    int j = 0;
    String alphabet;
    boolean condition = false;

    while(chances--!=0) {

        System.out.print("\nWord : " +stringBuilder );
        
        System.out.print("\nGuess :");
        alphabet = scanner.next().toUpperCase();

        for(int i = 0; i<S.length(); i++) {
            if(alphabet.charAt(0) == S.charAt(i)) {
                j++;
                stringBuilder.setCharAt(i, alphabet.charAt(0));
            }
        }
        if(j>0) {
            System.out.println("Guess Alphabet  found" );
        }
        else
         System.out.println("Guess Alphabet not found !!");

        j = 0;
        if(stringBuilder.toString().equals(stringBuilder1.toString())) {
            condition  = true;
            break;
        }
    }
    if(condition )
      System.out.println("YOU WIN");
    else 
      System.out.println("YOU LOOSE");
   
    }


}
    

