package CaesarCipher;
import java.util.Scanner;

public class Cipher {

    public static void main(String[] args) {
        System.out.println("Enter text to encrypt: ");
        Scanner sc = new Scanner(System.in);
        String textInput = sc.nextLine();
        System.out.println("Enter # of shifts (0-25): ");
        int shiftInput = sc.nextInt();
        sc.nextLine();
        
        System.out.println(encrypt(textInput, shiftInput));
//        System.out.println(encrypt("Abc 10 LkxZe ne!a", 10));
    }
    
    public static String encrypt (String text, int shift) {
        StringBuilder result = new StringBuilder();
        
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                int charNum = (int)character;
                int newNum = charNum + shift;
                    
                if (Character.isLowerCase(character)) {
                    if (newNum > 'z') {
                        int remainder = newNum - 'z';
                        character = (char)('`' + remainder);
                    }
                    else {
                        character = (char)newNum;
                    }
                    
                }
                
                else if (Character.isUpperCase(character) ) {
                    if (newNum - 'Z' >= 0) {
                        int remainder = newNum - 'Z';
                        character = (char) ('@' + remainder);
                    }
                    else {
                        character = (char)newNum;
                    }
                }

                result.append(character);
                
            }
            else {
                result.append(character);
            }
        }
        
        return result.toString();
    }

}
