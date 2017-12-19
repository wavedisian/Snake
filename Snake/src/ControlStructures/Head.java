package ControlStructures;

public class Head{
	private Position p;
	public Head(Position p)
	{
		this.p=p;
	}
	
	public void moveHead(String move)
	{
		if(((p.getLocation()[0]==0)&&(move.equals("a")))||((p.getLocation()[0]==B.length)&&(move.equals("d")))
		{
			System.out.println();
		}
				
	}
	public boolean validMove()
	{
		
	}
}
