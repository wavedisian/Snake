package ControlStructures;

public class Position 
{
	private int x;
	private int y;
	private boolean f;
	public Position(int x, int y, boolean f) 
	{
		this.x=x;
		this.y=y;
		this.f=f;
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
