package ControlStructures;

public class Position 
{
	private int x;//x coord
	private int y;//y coord
	private boolean f;//filled or empty
	public Position(int x, int y, boolean f) 
	{
		this.x=x;
		this.y=y;
		this.f=f;
	}
	
	public int[] getLocation()
	{
		int[] g = new int[2];
		g[0] = this.x;
		g[1] = this.y;
	}
	public String printLocation()
	{
		return ("x=" + this.x + " y=" + this.y);
	}
	
	public String printPosition()
	{
		if(f) 
		{
			return "X";
		}
		else
		{
			return "O";
		}
	}

}
