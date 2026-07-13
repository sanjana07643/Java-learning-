//check if the person is eligible to vote

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		int age = sc.nextInt( );
		if(age>18){
			System.out.println( "You can vote");
		}else{
			System.out.println("You are not eligible for vote");
		}
	}
}