package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Sum;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, x;
		
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		scan.close();
		
		Sum sum = new Sum(n1,n2);
		
		x = sum.Result();
		
		System.out.printf("The result of sum %d with %d is: %d",n1,n2,x);
		

	}

}
