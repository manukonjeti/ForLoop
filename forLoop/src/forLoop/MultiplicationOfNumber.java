package forLoop;
import java.util.*;

public class MultiplicationOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=1;i<=10;i++) 
{
	System.out.println("table "+ a + "*" + i + "="+(a*i));
}
sc.close();
	}

}
