/*Author: Julia Garrett
 *Assignment: EECS 448 Lab2
 *Date: 2/6/2017
 *Summary: This is a number guessing game that will generate a random number with no repeating characters
 *			and will give the player hints guess the number. 
 */
package eecs448_lab2;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
//Introduces the user and explains the game
//Calls the number generator and guessing tracker
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int difficulty=0;
		String theNumber="";
		int round=1;
		System.out.println("Welcome to number guessing game");
		System.out.print("Rules of the Game:\n A three character number with no repeating characters will be generated\n");
		System.out.println("You will have 10 guesses guess the number");
		System.out.println("Maxium points earned is 1200 decreasing by 100 pts each guess you use.");
		System.out.println("Hints: * means right number but wrong spot, and ! means right number right spot");
		difficulty=1;
		theNumber=Number(difficulty);				//calling the number generator
		Guessing(difficulty, theNumber, round);		//call the guessing tracker
		
	}
//creates a random number then calls StringNum3
public static String Number(int dif){
	int rnum=0;
	String editnum="";
	if(dif==1){
		rnum=ThreadLocalRandom.current().nextInt(100, 1000);//generates a random number between 100 (inclusive) and 1000(exclusive)
		editnum=StringNum3(rnum);					//Calls function to check that there is no repeating numbers
		System.out.println("Your number has been generated.");
	}
	else {
		rnum=ThreadLocalRandom.current().nextInt(1000, 10000);
	}
	return editnum;
}
//Checks to see if there is a repeating character in the number and if so changes one of the characters
public static String StringNum3(int num){
	String n;
	String n1;
	int newnum;
	n=Integer.toString(num); //converts passed in number to string to allow for comparison of each character
	while(n.charAt(0)==n.charAt(1)|| n.charAt(1)== n.charAt(2)||n.charAt(0)==n.charAt(2)){ //continues to check until no repeating chars
		
		if(n.charAt(0)==n.charAt(1)){	//Compares 1st and 2nd characters
			newnum=Character.getNumericValue(n.charAt(1));
			if(newnum != 9){			//if repeating number is less than 9 then it is increased by 1
				newnum++;
				n1=Integer.toString(newnum);
				n=n.charAt(0)+""+n1+n.charAt(2);
			}
			else {						//if repeating number is 9 then it is set equal to 0
				newnum=0;
				n1=Integer.toString(newnum);
				n=n.charAt(0)+""+n1+n.charAt(2);
			}
		}
		else if(n.charAt(1)== n.charAt(2)){	//Compares 2nd and 3rd characters
			newnum=Character.getNumericValue(n.charAt(2));
			if(newnum != 9){		//if repeating number is less than 9 then it is increased by 1
				newnum++;
				n1=Integer.toString(newnum);
				n=n.charAt(0)+""+n.charAt(1)+n1;
			}
			else {					//if repeating number is 9 then it is set equal to 0
				newnum=0;
				n1=Integer.toString(newnum);
				n=n.charAt(0)+""+n.charAt(1)+n1;
			}
		}
		else if(n.charAt(0)==n.charAt(2)){	//Compares 1st and 3rd characters
			newnum=Character.getNumericValue(n.charAt(2));
			if(newnum != 9){		//if repeating number is less than 9 then it is increased by 1
				newnum++;
				n1=Integer.toString(newnum);
				n=n.charAt(0)+""+n.charAt(1)+n1;
			}
			else {					//if repeating number is 9 then it is set equal to 0
				newnum=0;
				n1=Integer.toString(newnum);
				n=n.charAt(0)+""+n.charAt(1)+n1;
			}
		}
	}
	return  n; //returns new random number with no repeating characters
}
//Tracks how many guesses the user has made
public static void Guessing(int diff, String num, int round){
	Scanner in=new Scanner(System.in);
	String guess="";
	if (diff==1){
		for(int i=0; i<11 && round<11; i++){
			System.out.println("\nEnter your guess:");
			guess=in.next();
			round=Contains(num, guess, round);
			round++;
			
		}
	}
}
//Tells if the user's guess is right and gives hints if not.
public static int Contains(String number, String guess, int round){
	int n1=0;
	int n2=0;
	int score=0;
	n1=Integer.parseInt(number);
	n2=Integer.parseInt(guess);
	if(n1==n2){							//If user guesses the number correctly then a victory message is printed and the score of the user
		System.out.println("You Win!");
		score=1100-(round*100);
		System.out.println("You Scored: " + score+" points");
		return 11;
	}
	//The various combinations of hints that the program will give the user
	if(number.charAt(0)==guess.charAt(0)){
		System.out.print("!");
	}
	else if(number.charAt(0)==guess.charAt(1)){
		System.out.print("*");
	}
	else if(number.charAt(0)==guess.charAt(2)){
		System.out.print("*");
	}
	if(number.charAt(1)==guess.charAt(1)){
		System.out.print("!");
	}
	else if(number.charAt(1)==guess.charAt(0)){
		System.out.print("*");
	}
	else if(number.charAt(1)==guess.charAt(2)){
		System.out.print("*");
	}
	if(number.charAt(2)==guess.charAt(2)){
		System.out.print("!");
	}
	else if(number.charAt(2)==guess.charAt(0)){
		System.out.print("*");
	}
	else if(number.charAt(2)==guess.charAt(1)){
		System.out.print("*");
	}
	return round;
}
}
