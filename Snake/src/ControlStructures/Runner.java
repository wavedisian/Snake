package ControlStructures;

public class Runner {
	Board B = newBoard(9,9);
	
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
