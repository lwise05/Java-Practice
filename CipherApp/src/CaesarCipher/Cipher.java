package CaesarCipher;
import java.util.Scanner;

public class Cipher {

	 private static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	    private static String upperCase;

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        upperCase = lowerCase.toUpperCase();

	        System.out.println("Enter text to encrypt: ");
	        String textInput = sc.nextLine();

	        System.out.println("Enter # of shifts (0-25): ");
	        int shiftInput = sc.nextInt();
	        sc.nextLine();

	        System.out.println(encrypt(textInput, shiftInput));
	        sc.close();
	    }

	    public static String encrypt(String text, int shift) {
	        StringBuilder result = new StringBuilder();

	        for (char character : text.toCharArray()) {
	            String charSet = Character.isLowerCase(character) ? lowerCase : upperCase;
	            if (Character.isLetter(character)) {
	                int shiftedIndex = (charSet.indexOf(character) + shift) % 26;

	                if (shift < 0) {
	    
	                    if (shift + charSet.indexOf(character) < 0) {
	                        shiftedIndex = 26 + shiftedIndex;
	                    }

	                }
	                result.append(charSet.charAt(shiftedIndex));

	            } else {
	                result.append(character);

	            }
	        }

	        return result.toString();
	    }

}
