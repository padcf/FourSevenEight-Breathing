import java.applet.*;
import java.net.*;

public class BreathingSet
{
	//create instance variables to hold information for duration between gongs
	private int breathIn = 0, breathHold = 0, breathOut = 0, numOfSets = 0;

	//create a default constructor with default time on breaths
	public BreathingSet()
	{
		this. breathIn = 4;
		this.breathHold = 7;
		this.breathOut = 8;
		this.numOfSets = 10;
	}

	//create a custom constructor which can be used to specify breath times

	public BreathingSet(int breathIn, int breathHold, int breathOut, int numOfSets)
	{
		this.breathIn = breathIn;
		this.breathHold = breathHold;
		this.breathOut = breathOut;
		this.numOfSets = numOfSets;
	}


	//create a method that plays a gong noise from a local .wav file
	public void playSet()
	{

		//write a for loop to complete n number of sets given

		for(int i=0;i<numOfSets;i++)
		{
			//play starting gong for breathIn and wait n seconds
			try
			{
				AudioClip clip = Applet.newAudioClip(new URL("file:./sound.wav"));
				clip.play();
			}
			catch	(MalformedURLException murle)
			{
				murle.printStackTrace();
			}


			try
			{
				Thread.sleep(this.breathIn * 1000);
			}
			catch(InterruptedException e)
			{

				System.out.println(e);
			}

			//play gong for breathHold and wait n seconds
			try
			{
				AudioClip clip = Applet.newAudioClip(new URL("file:./sound.wav"));
				clip.play();
			}
			catch	(MalformedURLException murle)
			{
				murle.printStackTrace();
			}


			try
			{
				Thread.sleep(this.breathHold * 1000);
			}
			catch(InterruptedException e)
			{

				System.out.println(e);
			}


			//play gong for breathOut and wait n seconds
			try
			{
				AudioClip clip = Applet.newAudioClip(new URL("file:./sound.wav"));
				clip.play();
			}
			catch	(MalformedURLException murle)
			{
				murle.printStackTrace();
			}


			try
			{
				Thread.sleep(this.breathOut * 1000);
			}
			catch(InterruptedException e)
			{

				System.out.println(e);
			}

			//play ending gong
			try
			{
				AudioClip clip = Applet.newAudioClip(new URL("file:./sound.wav"));
				clip.play();
			}
			catch	(MalformedURLException murle)
			{
				murle.printStackTrace();
			}				
		}//end of for loop
	}//end of playSet method

			
}//end of class