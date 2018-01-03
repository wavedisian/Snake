package ControlStructures;

public class Body {
	private Position[] p;
	public Body(Position[] p)
	{
		this.p=p;
	}
	
	public void moveBody(String move, Board g)
	{
		if(validMove(move, g))
		{
			Position[] newpos = new Position[this.p.length];
			if(move.equals("s"))
			{
				newpos[0] = new Position(this.p[0].getLocation()[0], this.p[0].getLocation()[1] - 1);
				for(int i=0; i<newpos.length-1; i++)
				{
					newpos[i+1]=this.p[i];
				}
				this.p=newpos;
			}
			if(move.equals("w"))
			{
				newpos[0] = new Position(this.p[0].getLocation()[0], this.p[0].getLocation()[1] + 1);
				for(int i=0; i<newpos.length-1; i++)
				{
					newpos[i+1]=this.p[i];
				}
				this.p=newpos;
			}
			if(move.equals("a"))
			{
				newpos[0] = new Position(this.p[0].getLocation()[0] - 1, this.p[0].getLocation()[1]);
				for(int i=0; i<newpos.length-1; i++)
				{
					newpos[i+1]=this.p[i];
				}
				this.p=newpos;
			}
			if(move.equals("d"))
			{
				newpos[0] = new Position(this.p[0].getLocation()[0] + 1, this.p[0].getLocation()[1] );
				for(int i=0; i<newpos.length-1; i++)
				{
					newpos[i+1]=this.p[i];
				}
				this.p=newpos;
			}
		}
	}
	public boolean validMove(String move, Board g)
	{
		if(move.equals("w")&&(this.p[0].getLocation()[1]==0))
		{
			return false;
		}
		if(move.equals("s")&&(this.p[0].getLocation()[1]==g.length))
		{
			return false;
		}
		if(move.equals("a")&&(this.p[0].getLocation()[0]==0))
		{
			return false;
		}
		if(move.equals("d")&&(this.p[0].getLocation()[0]==g.length))
		{
			return false;
		}
		if(move.equals("w")
	}
}
