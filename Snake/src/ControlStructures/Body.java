package ControlStructures;

public class Body {
	private Position nextMove;
	private Position[] p;
	public Body(Position[] p)
	{
		this.p=p;
	}
	
	public void moveBody(String move, Board game, Body b)
	{
		if(validMove(move, game, b)) {
		if(move.equals("a"))
		{
			Position nextmove = new Position(game.getBoard()[b.getPositions()[0].getX()-1][b.getPositions()[0].getY()].getX(), 
				game.getBoard()[b.getPositions()[0].getX()][b.getPositions()[0].getY()].getY(), 
				game.getBoard()[b.getPositions()[0].getX()][b.getPositions()[0].getY()].isSpawn());
		}
		if(move.equals("d"))
		{
			Position nextmove = new Position(game.getBoard()[b.getPositions()[0].getX()+1][b.getPositions()[0].getY()].getX(), 
				game.getBoard()[b.getPositions()[0].getX()][b.getPositions()[0].getY()].getY(), 
				game.getBoard()[b.getPositions()[0].getX()][b.getPositions()[0].getY()].isSpawn());
		}	
		if(move.equals("w"))
		{
			Position nextmove = new Position(game.getBoard()[b.getPositions()[0].getX()][b.getPositions()[0].getY()].getX(), 
				game.getBoard()[b.getPositions()[0].getX()][b.getPositions()[0].getY()+1].getY(), 
				game.getBoard()[b.getPositions()[0].getX()][b.getPositions()[0].getY()].isSpawn());
		}	
		if(move.equals("s"))
		{
			Position nextmove = new Position(game.getBoard()[b.getPositions()[0].getX()][b.getPositions()[0].getY()].getX(), 
				game.getBoard()[b.getPositions()[0].getX()][b.getPositions()[0].getY()-1].getY(), 
				game.getBoard()[b.getPositions()[0].getX()][b.getPositions()[0].getY()].isSpawn());
		}	
		if(nextMove.isSpawn())
		{	
			Position[] newpos = new Position[this.p.length+1];
			
			{
				for(int i = this.p.length; i>0; i++)
				{
					newpos[i]=this.p[i-1];
				}
				newpos[0] = nextMove;
				this.p=newpos;
			}
		}
		}
	}
	public boolean validMove(String move, Board g, Body head)
	{
		if(move.equals("w")&&(this.p[0].getY()==0))
		{
			return false;
		}
		if(move.equals("s")&&(this.p[0].getY()==g.height()))
		{
			return false;
		}
		if(move.equals("a")&&(this.p[0].getX()==0))
		{
			return false;
		}
		if(move.equals("d")&&(this.p[0].getX()==g.length()))
		{
			return false;
		}
	}
	public Position[] getPositions()
	{
		return this.p;
	}
}
