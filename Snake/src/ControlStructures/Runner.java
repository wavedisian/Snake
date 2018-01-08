package ControlStructures;
import java.util.Scanner;
public class Runner {
	public static void main(String args)
	{
		Scanner in = new Scanner(System.in);
		String call = in.nextLine();
		call = call.toLowerCase();
		while(!call.equals("end game"))
		{
			System.out.println( 
					"Welcome to Snake V 1.0.0. In this game you play as a snake whose goal is to eat as much as possible. You start small as"
					+ " just a head, but quickly you eat and grow. Be warned! This snake is posionous to himself, and will lose if he touches his body."
					+ " The snake moves by standard WASD motion. To stop at any point, simply type exit."
					+ " Please enter a board size and prepare to play."
						           );
			
			Board game = newBoard(call, call);
			
		
		
		
		}
	}
	
	public static Board newBoard(int x, int y)
	{
		Position[][] p = new Position[x][y];
		for(int iy = 0; iy<p.length; iy++)
		{
			for(int ix = 0; ix<)
		}
		Board board = new Board(p);
		return board;
	}
	
	public static int indexPosition(Position j, Position[] k )
	{
		for(int i = 0; i<k.length; i++)
		{
			if((j.getLocation()[0]==k[i].getLocation()[0])&&(j.getLocation()[1]==k[i].getLocation()[1]))
					{
						return i;
					}
		}
		return -1;
	}
	public static boolean isFull(Position j, Position)
}
