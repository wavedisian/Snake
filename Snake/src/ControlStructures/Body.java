package ControlStructures;

public class Body {
	private Position nextMove;
	private Position[] p;
	public Body(Position[] p)
	{
		this.p=p;
	}
	
	public void moveBody(String move, Board game)
	{
		if(validMove(move, game)) {
		if(move.equals("a"))
		{
			this.nextMove = new Position(game.getBoard()[this.p[0].getX()-1][this.p[0].getY()].getX(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].getY(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].isSpawn());
		}
		if(move.equals("d"))
		{
			this.nextMove = new Position(game.getBoard()[this.p[0].getX()+1][this.p[0].getY()].getX(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].getY(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].isSpawn());
		}	
		if(move.equals("w"))
		{
			this.nextMove = new Position(game.getBoard()[this.p[0].getX()][this.p[0].getY()].getX(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()+1].getY(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].isSpawn());
		}	
		if(move.equals("s"))
		{
			this.nextMove = new Position(game.getBoard()[this.p[0].getX()][this.p[0].getY()].getX(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()-1].getY(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].isSpawn());
		}	
		if(this.nextMove.isSpawn())
		{	
			Position[] newpos = new Position[this.p.length+1];
			
				for(int i = 0; i<this.p.length; i++)
				{
					newpos[i+1]=this.p[i];
				}
				newpos[0] = this.nextMove;
				this.p=newpos;
			
		}
		if(!this.nextMove.isSpawn())
		{
			 Position[] newpos = new Position[this.p.length];
			
				for(int i = 0; i<this.p.length-1; i++)
				{
					newpos[i+1] = this.p[i];
				}
				newpos[0] = nextMove;
				this.p=newpos;
		}
		}
	}
	public boolean validMove(String move, Board g)
	{
		if
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
		if(move.equals("w")&&(this.p[1].getY()==this.p[0].getY()+1))
		{
			return false;
		}
		if(move.equals("s")&&(this.p[1].getY()==this.p[0].getY()-1))
		{
			return false;
		}
		if(move.equals("a")&&(this.p[1].getX()==this.p[0].getX()-1))
		{
			return false;
		}
		if(move.equals("d")&&(this.p[1].getX()==this.p[0].getX()+1))
		{
			return false;
		}
		else return true;
	}
	public Position[] getPositions()
	{
		return this.p; 
	}
}
