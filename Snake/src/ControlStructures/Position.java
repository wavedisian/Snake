package ControlStructures;

public class Position 
{
	private boolean spawn;
	private int x;//x coord
	private int y;//y coord
	public Position(int x, int y, boolean spawn) 
	{
		this.x=x;
		this.y=y;
		this.spawn=spawn;
	}
	public int[] getLocation()
	{
		int[] g = new int[2];
		g[0] = this.x;
		g[1] = this.y;
		return g;
	}
	public void printPosition(Body b)
	{
		if((isSpawn())||(indexPosition(b.getPositions())>-1))
		{
			System.out.print("[O]");
		}
		else
		{
			System.out.print("[ ]");
		}
	}
	public boolean isSpawn()
	{
		return this.spawn;
	}
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	public int indexPosition(Position[] k)
	{
		for(int i = 0; i<k.length; i++)
		{
			if((this.x==k[i].getX())&&(this.y==k[i].getY()))
					{
						return i;
					}
		}
		return -1;
	}
}
