//Java program to print the last character of every word in a given string(Ignore all the digits and whitespaces)

package b1.Exercise;

import java.util.Scanner;

public class LastChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        input = input.replaceAll("[0-9]",""); //To remove all digits from input
        String[] words = input.trim().split("\\s+");//To split the string into words by spaces

        StringBuilder result = new StringBuilder();

        for(String word: words){
            if(!word.isEmpty())
            {
                result.append(word.charAt(word.length()-1));
            }
        }
        System.out.println(result.toString());
    }
}
