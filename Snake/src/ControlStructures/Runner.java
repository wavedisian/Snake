package ControlStructures;
import java.util.Scanner;
public class Runner {
	public static void main(String[] args)
	{
		String call = "";
		Scanner in = new Scanner(System.in);
		while(!call.equals("end game"))
		{
			System.out.println( 
					"Welcome to Snake V 1.0.0. In this game you play as a snake whose goal is to eat as much as possible. You start small as\n"
    				+ " just a head, but quickly you eat and grow. Be warned! This snake is posionous to himself, and will lose if he touches his body.\n"
					+ " The snake moves by standard WASD motion. To stop at any point, simply type exit.\n"
					+ " Please enter a board size (ONLY ENTER AN INTEGER VALUE) and prepare to play."
						           );
			int size = in.nextInt();
			Position[] p = new Position[2];
			p[0] = new Position(size/2, size/2, false); //initializes with body size 2 to prevent index out of bound errors
			p[1] = new Position(size/2 - 1, size/2, false);
			in.nextLine(); //remove hanging new line
			Board game = newBoard(size, size);
			Body b = new Body(p);
			System.out.println("Type play when you are ready to begin. Type end game to end at any time.. Good luck!");
			
			game.printBoard(b);

			while(!call.equals("end game"))
					{
						call = in.nextLine();
				        if(b.validMove(call, game))
				        	{
				        		b.moveBody(call, game);
				        	}
				        else
				        {
				        	System.out.println("Invalid move, please choose a valid move");
				        }
						game.printBoard(b);
					}
		
		
		}
		in.close();
	}
	
	public static Board newBoard(int x, int y) //create a new playspace
	{
		Position[][] p = new Position[y][x];
		for(int iy = 0; iy<y; iy++)           //initialize all the positions with their respective coordinate values
		{
			for(int ix = 0; ix<x; ix++)
			{
				p[iy][ix] = new Position(ix, iy, false);
			}
		}
		Board board = new Board(p);
		return board;
	}
	
	public static int indexPosition(Position j, Position[] k ) //return the location of a position given a body
	{
		for(int i = 0; i<k.length; i++)
		{
			if((j.getX()==k[i].getX())&&(j.getY()==k[i].getY()))
					{
						return i;
					}
		}
		return -1;
	}
}
