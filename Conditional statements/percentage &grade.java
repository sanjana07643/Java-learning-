// Check student marks percentage and grade

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		int marks = sc.nextInt();
		int percentage = (marks*100)/1000;
		
		System.out.println(percentage);
		
		if(percentage>90){
			System.out.println("A Grade");
		}else if(percentage>=70 && percentage<=90){
			System.out.println("B Grade");
		}else if(percentage>=60 && percentage<70){
			System.out.println("C Grade");
		}else{
			System.out.println("D Grade");
		}
		
	}
}