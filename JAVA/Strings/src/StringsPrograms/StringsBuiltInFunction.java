package StringsPrograms;

import java.util.Scanner;
public class StringsBuiltInFunction {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = sc.next();
            System.out.println("You entered: " + word);

            // Using i am nextLine()
            sc.nextLine(); // Consume the leftover newline
            Scanner sc2=new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            String sentence = sc2.nextLine();
            System.out.println("You entered: " + sentence);

            System.out.println("hii");
            String name="A r b a a z @ $ & 7 8 6";

//            Built-In functions in java
//            1 . Returns the character at the specified index.
            System.out.println(name.charAt(0));



        }

    }



