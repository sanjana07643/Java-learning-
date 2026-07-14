// Calculator using switch statement

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		double num1 = sc.nextDouble();
		
		System.out.print("Enter Second number: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Enter operator(+,-,*,/,%) : ");
		char operator = sc.next( ).charAt(0);
		
		switch ( operator) {
		case '+':
		System.out.print("Result = " +(num1 + num2));
		break;
		case '-':
		System.out.print("Result = "+(num1-num2));
		break;
		case'*':
		System.out.print("Result = " + (num1*num2));
		break;
		case'/':
		if(num2 !=0){
		System.out.print("Result = " +(num1/num2));
		}else{
			System.out.print("Number cannot divided by 0");
		}
		break;
		case'%':
		System.out.print("Result = " + (num1%num2));
	    break;
		default:
		System.out.print("Invalid operator");
		}
		sc.close( );
		
	}
}