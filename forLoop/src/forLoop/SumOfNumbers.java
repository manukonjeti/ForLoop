package forLoop;
import java.util.*;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
	int sum=0;
		for(int i=0;i<=a;i++) {
			sum += i;
			// System.out.println("Cumulative sum at step " + i + ": " + sum);
		}
		System.out.println("The total sum of numbers from 0 to " + a +sum);
    }

	
}
