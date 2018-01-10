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
			Position[] p = new Position[1];
			p[0] = new Position(0, 0, false);
			int size = in.nextInt();
			in.nextLine(); //remove hanging new line
			Board game = newBoard(size, size);
			Body b = new Body(p);
			System.out.println("Type play when you are ready to begin. Type end game to end at any time.. Good luck!");
			while(!call.equals("end game"))
					{
				        game.printBoard(b);
						call = in.nextLine();
				        b.moveBody(call, game);
						game.printBoard(b);
					}
		
		
		}
		in.close();
	}
	
	public static Board newBoard(int x, int y)
	{
		Position[][] p = new Position[y][x];
		for(int iy = 0; iy<y; iy++)
		{
			for(int ix = 0; ix<x; ix++)
			{
				p[iy][ix] = new Position(ix, iy, false);
			}
		}
		Board board = new Board(p);
		return board;
	}
	
	public static int indexPosition(Position j, Position[] k )
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
