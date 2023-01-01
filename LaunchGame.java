package GusserGameProject;
import java.util.Scanner;
class Guesser {
	int GuessNum;   
	
	int Guessnum() 
	{
		 @SuppressWarnings("resource")
		 Scanner Scan = new Scanner(System.in);
		 System.out.println("Guesser Kindly Guess The Number:");
		 GuessNum=Scan.nextInt();
		 return GuessNum;
	}

}
class Players {
	int GuessNum;   
	
	int Guessnum() 
	{
		 @SuppressWarnings("resource")
		 Scanner Scan = new Scanner(System.in);
		 System.out.println("Players Kindly Guess The Number:");
		 GuessNum=Scan.nextInt();
		 return GuessNum;
	}

}
class Umpire {
	int NumFromGuesser;
	int NumFromPlayer1;
	int NumFromPlayer2;
    int NumFromPlayer3;
	
	void collectNumFromguesser()
	{
		Guesser G=new Guesser();
		NumFromGuesser=G.Guessnum();
	}
	void collectNumFromPlayers() 
	{
		Players P1=new Players();
		NumFromPlayer1=P1.Guessnum();
	    Players P2=new Players();
		NumFromPlayer2=P2.Guessnum();
	    Players P3=new Players();
		NumFromPlayer3=P3.Guessnum();
	}
	void compare() 
	{  
		if(NumFromPlayer1==NumFromGuesser&&NumFromPlayer2==NumFromGuesser) 
		{
			if(NumFromPlayer2==NumFromGuesser&&NumFromPlayer3==NumFromGuesser) 
			{
				System.out.println("All Three Players Won The Game");
			}
			else 
			{
				System.out.println("Both Player1 and Player2 Won The Game");
			}
		}
		else 
		{
			if(NumFromPlayer2==NumFromGuesser&&NumFromPlayer3==NumFromGuesser) 
			{
				System.out.println("Player2 and Player3 Won The Game");
			}
			else 
			{
				if(NumFromPlayer1==NumFromGuesser&&NumFromPlayer3==NumFromGuesser) 
			    {
				    System.out.println("Player1 and Player3 Won The Game");
			    }
				else 
				{ 
					if(NumFromPlayer1==NumFromGuesser) 
			        {
				       System.out.println("Player1 Won The Game");
			        }
				    else if(NumFromPlayer2==NumFromGuesser) 
			        {
				       System.out.println("Player2 Won The Game");
			        }
				    else if(NumFromPlayer3==NumFromGuesser)  
				    {
					   System.out.println("Player3 Won The Game");
				    }
				    else 
				    {
				    	System.out.println("All Players Lost The Guesser Game");
				    }
				}
			}
	  }
   }	
}
public class LaunchGame {

	public static void main(String[] args) {
		
	    Umpire U=new Umpire();
	    U.collectNumFromguesser();
	    U.collectNumFromPlayers();
	    U.compare();
	}

}

