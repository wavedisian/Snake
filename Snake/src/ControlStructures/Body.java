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
			Position[] newpos = new Position[this.p.length + 1];
			if(move.equals("a"))
			{
				newpos[0] = new Position(this.p[0].getLocation()[0], this.p[0].getLocation()[1] - 1);
				for(int i=0; i<newpos.length; i++)
				{
					newpos[i+1]=this.p[i];
				}
				this.p=newpos;
				
			}
		}
	}
	public boolean validMove(String move)
	{
		if(move.equals("w")&&(this.p[0].getLocation()[1]))
		{
			System.out.println();
		}
				
	}
}
