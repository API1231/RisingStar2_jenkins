import java.util.Scanner;

public class Addition {

	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two Numbers:");
		int op1=sc.nextInt();
		int op2=sc.nextInt();
		System.out.println("Addition:"+(op1+op2));

	}

}
