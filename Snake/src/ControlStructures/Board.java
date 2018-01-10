package ControlStructures;

public class Board {
	private Position[][] space;
	public Board(Position[][] space) 
	{
		this.space=space;
	}
	
	public void printBoard()
	{
		for(Position[] g : this.space)
		{
			for(Position p : g)
			{
				System.out.print(p.printLocation());
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
	public void fillBoard(Board  b)
	{
		
	}
	public Position[][] getBoard()
	{
		return this.space;
	}
}
