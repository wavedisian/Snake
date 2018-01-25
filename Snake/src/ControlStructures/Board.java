package ControlStructures;

public class Board {
	private Position[][] space;
	public Board(Position[][] space) 
	{
		this.space=space;
	}
	
	public void printBoard(Body b)
	{
		for(Position[] g : this.space)
		{
			for(Position p : g)
			{
				p.printPosition(b);
			}
			System.out.println();
		}
	}
	public int length()
	{
		return (this.space[0]).length;
	}
	public int height()
	{
		return (this.space).length;
	}
	public Position[][] getBoard()
	{
		return this.space;
	}
}
