import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		System.out.print("Enter your's score: " );
		int num= scan.nextInt();
		if (num <50) {
			System.out.println("You are fail");
					}
		else if (num>=50 && num<=70){
			String C = "3.0";
			System.out.println("You got C which is " + C);
		}
		else if (num>70 && num<=80){
			System.out.println("You got 2.0");
		}
	}
}
