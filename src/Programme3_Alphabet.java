import java.util.Scanner;

public class Programme3_Alphabet {
    /*
    Write a Java program that takes the user to provide a single character from the
    alphabet. Print Vowel of Consonant, depending on the user input. If the user input
    Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
    error message.
    For eg:
    Input an alphabet: p
    Expected Output:
    Input letter is Consonant*/
    public static void main(String[] args) {
        vowel();
    }
    public static void vowel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char char1 = scanner.next().toLowerCase().charAt(0);
        if (char1 != 'a' && char1 != 'z') {
            System.out.println("Invalid entry ");
        }else if (char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u') {
                System.out.println(char1 + "  Input letter is a vowel ");
            } else {
                System.out.println(char1 + " Input letter is a consonant ");
            }
        scanner.close();

        }
    }






