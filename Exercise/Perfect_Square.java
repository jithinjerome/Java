//Java program to check whether a given number is a perfect square or not

package b1.Exercise;

import java.util.Scanner;

public class Perfect_Square {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        double result = Math.sqrt(num);

        if((int) result == result)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
