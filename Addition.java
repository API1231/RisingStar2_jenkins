import java.util.Scanner;

public class Addition {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first operand:");
		int op1=sc.nextInt();
		
		System.out.println("Enter Second operand:");
		int op2=sc.nextInt();
		System.out.println("Addition:"+(op1+op2));

	}

}
