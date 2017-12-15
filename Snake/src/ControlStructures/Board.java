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
				System.out.print(p.printPosition());
			}
			System.out.println();
		}
	}

}
