import java.util.Random;
import java.util.*;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		Random rand = new Random();
		int upperbound = 3;
		int int_random = rand.nextInt(upperbound);
		Scanner sc = new Scanner(System.in);
		System.out.print("Rock, Paper, or Scissors?  ");
		String a = sc.nextLine();
		String[] rps = {"Rock", "Paper", "Scissors"};
		System.out.println(rps[int_random]);
		if (a.equals("Rock")){
			if (int_random == 0){
				System.out.print("TIE");
			}
			if (int_random == 1){
				System.out.print("LOSER");
			}
			if (int_random == 2){
				System.out.print("WINNER");
			}

		}
		if (a.equals("Paper")){
			if (int_random == 0){
				System.out.println("WINNER");
			}
			if (int_random == 1){
				System.out.println("TIE");
			}
			if (int_random == 2){
				System.out.println("LOSER");
			}
		}
		if (a.equals("Scissors")){
			if (int_random == 0){
				System.out.println("LOSER");
			}
			if (int_random == 1){
				System.out.println("WINNER");
			}
			if (int_random == 2){
				System.out.println("TIE");
		}		
		}
	}
}

