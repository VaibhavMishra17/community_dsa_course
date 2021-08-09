package FirstJavaProgram;
import java.util.*;

public class ques10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int largest = 0;
		int max = 0;
		while (true) {
		    System.out.println("Enter number: ");
		    int a = sc.nextInt();
	        if (a > 0){
	            largest = Math.max(a, max);
	        } else {
	            break;
	        }
		   
		}
		System.out.print(largest);
		sc.close();
    }
}

// Take integer inputs till the user enters 0 and print the largest number from all