//Java program to print the characters at the odd position of a given string

package b1.Exercise;

import java.util.Scanner;

public class OddChar {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        sc.close();
        char[] s = str.toCharArray();

        for(int i=0;i<s.length;i++){
            if(i%2!=0){
                System.out.print(" "+s[i]);
            }
        }

        //Another Way
        for(int i=1;i<s.length;i+=2){
            System.out.print(" "+s[i]);
        }
    }
}
