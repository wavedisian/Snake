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
	public String printLocation()
	{
		return ("x=" + this.x + " y=" + this.y);
	}
	public boolean isSpawn()
	{
		return this.spawn;
	}
}
