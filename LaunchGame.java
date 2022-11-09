package GuesserGame;
import java.util.*;

//Features Added
//Gave the choice of number of players who can play to the users
//Minimum number of players required = 2 
//Max number number of players who can can play = 4


class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Guesser, Please enter the guess Number");
		guessNum=sc.nextInt();
		return guessNum;
	}
}

class Player
{
int guessNum;
	
	int guessNum()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Player, Please enter the guess Number");
		guessNum=sc.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	
	
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	
	void collectNumFromPlayers()
	{
		System.out.println("Enter the number of players more than 1 and lesser than or equal to 4 players");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		switch(a)
		{
		case 2:
		{
			Player p1=new Player();
			numFromPlayer1=p1.guessNum();
			
			Player p2=new Player();
			numFromPlayer2=p2.guessNum();
			break;
		}
		
		case 3:
		{
			Player p1=new Player();
			numFromPlayer1=p1.guessNum();
			
			Player p2=new Player();
			numFromPlayer2=p2.guessNum();
			
			Player p3=new Player();
			numFromPlayer3=p3.guessNum();
			break;
		}
		
		case 4:
		{
		Player p1=new Player();
		numFromPlayer1=p1.guessNum();
		
		Player p2=new Player();
		numFromPlayer2=p2.guessNum();
		
		Player p3=new Player();
		numFromPlayer3=p3.guessNum();
		
		Player p4=new Player();
		numFromPlayer4=p4.guessNum();
		break;
		}
		default: System.out.println("Sorry! You have entered invalid number of players");
	}
	}
	
		
		void compare()
		{
			
			if(numFromGuesser==numFromPlayer1)
			{
				if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
				{
					System.out.println("All players won the game");
				}
				else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
				{
					System.out.println("Player 1, Player 2 and Player 3 won the Game");
				}
				else if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
				{
					System.out.println("Player 1, Player 3 and Player 4 won the Game");
				}
				else if(numFromGuesser==numFromPlayer2 )
				{
					System.out.println("Player 1 & Player2 won");
				}
				else if(numFromGuesser==numFromPlayer3)
				{
					System.out.println("Player 1 & Player3 won");
				}
				else if(numFromGuesser==numFromPlayer4)
				{
					System.out.println("Player 1 & Player4 won");
				}
				else
				{
				System.out.println("Player 1 won the game");
				}
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
				{
					System.out.println("Player 2, Player3 & Player4 won");
				}
				else if(numFromGuesser==numFromPlayer3)
				{
					System.out.println("Player 2 and Player 3 won the game");
				}
				else if(numFromGuesser==numFromPlayer4)
				{
					System.out.println("Player 2 and Player 4 won the game");
				}
				else
				{
				System.out.println("Player 2 won the game");
				}
			}
			
			else if(numFromGuesser==numFromPlayer3)
			{
				if(numFromGuesser==numFromPlayer4)
				{
					System.out.println("Player3 & Player4 won");
				}
				
				else
				{
				System.out.println("Player 3 won the game");
				}
			}
			
			else if(numFromGuesser==numFromPlayer4)
			{
				System.out.println("Player 4 won the game");
			}
			else
			{
				System.out.println("Game lost Try Again!");
			}
			
		}
		
	}


	public class LaunchGame {

		public static void main(String[] args) {
			
				Umpire u=new Umpire();
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				u.compare();

	}
	
	
}

