package OOP;

import java.util.Scanner;

public class RunAmountDue {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		AmountDue due = new AmountDue();
		
		System.out.println("Press any of the following then enter values separated by spaces:");
		System.out.println("1 - Price only \n2 - Price and quantity \n3 - Price, quantity, and discount amount");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			due.computeAmountDue(sc.nextDouble());
		}else if(choice == 2) {
			due.computeAmountDue(sc.nextDouble(), sc.nextDouble());
		}else if(choice == 3) {
			due.computeAmountDue(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}else {
			System.err.println("Please input from the choices only. Thank you.");
		}
	}
}