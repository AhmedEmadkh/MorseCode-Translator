package morsecode;

import java.util.Scanner;

public class MorseCode {

    static Tree m = new Tree();

    public static void main(String[] args) {
// morse_code = {'A': '.-', 'B': '-...', 'C': '-.-.', 'D': '-..', 'E': '.', 'F': '..-.', 'G': '--.', 'H': '....', 'I': '..', 'J': '.---', 'K': '-.-', 
//'L': '.-..', 'M': '--', 'N': '-.', 'O': '---', 'P': '.--.', 'Q': '--.-', 'R': '.-.', 'S': '...', 'T': '-', 'U': '..-', 'V': '...-', 'W': '.--', 
//'X': '-..-', 'Y': '-.--', 'Z': '--..'}
        importchars();
//        m.PostOrderTrav();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your MORSE Code Separated by [/]  Between Each Letter");
        String code = input.nextLine();
//        In case of the user's input is wrong 
        for (int i = 0; i < code.length(); i++) {
            String letter = code.substring(i, i + 1);
            if (!(letter.equals(".") || letter.equals("-") || letter.equals("/"))) {
                System.out.println("Error: Please Enter The code only without space just the separating slash...!!!!!");
                return; //  return statement to exit the program after displaying the error message
            }
        }
        String s[] = code.split("/");

        for (int i = 0; i < s.length; i++) {
            m.find(s[i]);
        }
    }

    public static void importchars() {
        m.insert('A', ".-");
        m.insert('B', "-...");
        m.insert('C', "-.-.");
        m.insert('D', "-..");
        m.insert('E', ".");
        m.insert('F', "..-.");
        m.insert('G', "--.");
        m.insert('H', "....");
        m.insert('I', "..");
        m.insert('J', ".---");
        m.insert('K', "-.-");
        m.insert('L', ".-..");
        m.insert('M', "--");
        m.insert('N', "-.");
        m.insert('O', "---");
        m.insert('P', ".--.");
        m.insert('Q', "--.-");
        m.insert('R', ".-.");
        m.insert('S', "...");
        m.insert('T', "-");
        m.insert('U', "..-");
        m.insert('V', "...-");
        m.insert('W', ".--");
        m.insert('X', "-..-");
        m.insert('Y', "-.--");
        m.insert('Z', "--..");
        m.insert('0', "-----");
        m.insert('1', ".----");
        m.insert('2', "..---");
        m.insert('3', "...--");
        m.insert('4', "....-");
        m.insert('5', ".....");
        m.insert('6', "-....");
        m.insert('7', "--...");
        m.insert('8', "---..");
        m.insert('9', "----.");
        m.insert('.', ".-.-.-");
        m.insert(',', "--..--");
        m.insert('?', "..--..");
        m.insert('!', "-.-.--");
        m.insert('/', "-..-.");
        m.insert('(', "-.--.");
        m.insert(')', "-.--.-");
        m.insert('&', ".-...");
        m.insert(':', "---...");
        m.insert(';', "-.-.-.");
        m.insert('=', "-...-");
        m.insert('+', ".-.-.");
        m.insert('-', "-....-");
        m.insert('_', "..--.-");
        m.insert('"', ".-..-.");
        m.insert('$', "...-..-");
        m.insert('@', ".--.-.");

    }
}
