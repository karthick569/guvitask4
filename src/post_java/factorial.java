package post_java;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int i, fact=1;
		
		int num= sc.numint();
		for(i=1, i<=num; i++)
		{
			fact = fact*i;
		}

	}

}
