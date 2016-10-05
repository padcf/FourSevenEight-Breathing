/* This is an app primarily designed to help you practce the 4, 7, 8 breathing technique.
   Using this breathing technique you breath in for 4 seconds, hold the breath for 7 seconds and then release yor breath for 8 seconds.

*/

import java.util.Scanner;

public class FourSevenEight
{
	public static void main(String[] args)
	{
		//instaniate a new scanner object
		Scanner sc = new Scanner(System.in);

		//Print some information for the user and collect some information for setting up the breathing session

		System.out.println("Welcome to 478.");
		try	{Thread.sleep(1500);}catch(InterruptedException e){System.out.println(e);}

		System.out.println("");

		System.out.println("How many seconds would you like to breath in for?");
		int breathIn = sc.nextInt();
		try	{Thread.sleep(1500);}catch(InterruptedException e){System.out.println(e);}

		System.out.println("");

		System.out.println("How many seconds would you like to hold the breath for?");
		int breathHold = sc.nextInt();
		try	{Thread.sleep(1500);}catch(InterruptedException e){System.out.println(e);}

		System.out.println("");		

		System.out.println("How many seconds would you like the out breath to be?");
		int breathOut = sc.nextInt();
		try	{Thread.sleep(1500);}catch(InterruptedException e){System.out.println(e);}

		System.out.println("");

		System.out.println("Thank you :)");
		System.out.println("");
		
		try	{Thread.sleep(1500);}catch(InterruptedException e){System.out.println(e);}

		System.out.println("Lastly, how many times would you like to repeat this set?");
		int numOfSets = sc.nextInt();

		//count down 5.4.3.2.1


		for(int i = 5; i > 0; i--)
			{
				System.out.println("Begin breathing in: " + i);
				try	{Thread.sleep(1500);}catch(InterruptedException e){System.out.println(e);}
			}
				






		//instantiate a Sound object with default constructor
		BreathingSet defaultSet = new BreathingSet(breathIn, breathOut, breathHold, numOfSets);
		//play sound form both objects
		defaultSet.playSet();
		

	} //end of main


	

}// end of program

