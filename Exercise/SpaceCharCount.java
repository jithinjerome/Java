//Java program to compute the number of spaces and characters in a given string(Ignore all the digits)

package b1.Exercise;

import java.util.Scanner;

public class SpaceCharCount {
    public static void main(String[] args){

        int space_count=0,char_count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        sc.close();
        char[] result = str.toCharArray();
        for(int i=0;i<result.length;i++){
            if(Character.isWhitespace(result[i])){
                space_count++;
            } else if (!Character.isDigit(result[i])) {
                char_count++;
            }
        }
        System.out.println("Character count = "+char_count+",Space Count = "+space_count);

    }
}
