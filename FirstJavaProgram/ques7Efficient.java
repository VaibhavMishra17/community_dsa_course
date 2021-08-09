package FirstJavaProgram;

import java.util.Scanner;

public class ques7Efficient {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {                                   // If divisors are equal, print only one
                    System.out.println(" " + i);
                } else {                                            //  Otherwise print both
                    System.out.println(i + " " + n / i + " ");
                }
            }
        }
        sc.close();

    }
}

//input a number and print all the factors of that number

/* 
    if n = 100, then the various pairs of divisors are: (1,100), (2,50), (4,25), (5,20), (10,10)
    Time Complexity: O(sqrt(n)) 
    Auxiliary Space : O(1)
*/