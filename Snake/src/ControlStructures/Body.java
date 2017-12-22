package ControlStructures;

public class Body {
	private Position[] p;
	public Body(Position[] p)
	{
		this.p=p;
	}
	
	public void moveBody(String move)
	{
		if(validMove(move))
		{
			
		}
	}
	public boolean validMove(String move)
	{
		if(((p.getLocation()[0]==0)&&(move.equals("a")))||((p.getLocation()[0]==B.length)&&(move.equals("d")))
		{
			System.out.println();
		}
				
	}
}
