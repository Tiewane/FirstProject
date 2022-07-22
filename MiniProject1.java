import java.util.Scanner;

public class MiniProject1 {
	public static void main (String[]args) throws InterruptedException {
		try (Scanner input1 = new Scanner(System.in)) {
				String Name;
				
				System.out.println("What is your name?");
				Name = input1.nextLine();
		
				System.out.println("Hello, ".concat(Name));
				{
					Thread.sleep(3000); }
		
		try (Scanner input2 = new Scanner(System.in)) {
				int grade;
					
				System.out.println("Enter your grade.");
				grade = input2.nextInt();
				if (grade < 65) {
					System.out.println("You are failing class");
							} else if (grade >= 65 && grade < 90) {
					System.out.println("You are passing class");
							} else if (grade >= 90){
					System.out.println("You are in honors");
							} else {
					System.out.println("N/A");
					}
				}
		}
		
		
		
	}
	

}
