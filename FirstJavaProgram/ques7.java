package FirstJavaProgram;

import java.util.Scanner;

public class ques7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
        sc.close();

    }
}

//input a number and print all the factors of the number

/*
    Time Complexity : O(n) 
    Auxiliary Space : O(1)
*/