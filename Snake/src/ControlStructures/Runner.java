package ControlStructures;
import java.util.Scanner;
public class Runner {
	Board B = newBoard(9,9);
	Scanner in = new Scanner(System.in);
	String move = in;
	public static void main(String args)
	{
		
	}
	
	public static Board newBoard(int x, int y)
	{
		Position[][] p = new Position[x][y];
		Board board = new Board(p);
		return board;
	}
}
