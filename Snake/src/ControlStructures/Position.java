package ControlStructures;

public class Position 
{
	private int x;//x coord
	private int y;//y coord
	public Position(int x, int y) 
	{
		this.x=x;
		this.y=y;
	}
	public boolean callPosition(int a, int b)
	{
		if((a==this.x)&&(b==this.y))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int[] getLocation()
	{
		int[] g = new int[2];
		g[0] = this.x;
		g[1] = this.y;
		return g;
	}
	public String printLocation()
	{
		return ("x=" + this.x + " y=" + this.y);
	}
}
