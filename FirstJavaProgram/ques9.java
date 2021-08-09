package FirstJavaProgram;
import java.util.*;
public class ques9 {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
		while (true) {
		    System.out.println("Enter number: ");
		    int a = sc.nextInt();
	        if (a > 0){
	            sum += a;
	        } else {
	            break;
	        }
		   
		}
		System.out.print(sum);
		sc.close();
    }

}

// Take integer inputs till the user enters 0 and print the sum of all the numbers
