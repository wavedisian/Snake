package ControlStructures;

public class Body {
	private Position[] p;
	private Position nextMove = new Position(0, 0, false);
	private Position[] newpos;
	
	public Body(Position[] p)
	{
		this.p=p;
	}
	
	public void moveBody(String move, Board game)
	{
		if(move.equals("a"))
		{
			this.nextMove = new Position(game.getBoard()[this.p[0].getX()-1][this.p[0].getY()].getX(),  //next move is 1 left
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].getY(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].isSpawn());
		}
		if(move.equals("d"))
		{
			this.nextMove = new Position(game.getBoard()[this.p[0].getX()+1][this.p[0].getY()].getX(),  //next move is 1 right
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].getY(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].isSpawn());
		}	
		if(move.equals("w"))
		{
			this.nextMove = new Position(game.getBoard()[this.p[0].getX()][this.p[0].getY()].getX(),    //next move is up 1
				game.getBoard()[this.p[0].getX()][this.p[0].getY()+1].getY(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].isSpawn());
		}	
		if(move.equals("s"))
		{
			this.nextMove = new Position(game.getBoard()[this.p[0].getX()][this.p[0].getY()].getX(),    //next move is down 1
				game.getBoard()[this.p[0].getX()][this.p[0].getY()-1].getY(), 
				game.getBoard()[this.p[0].getX()][this.p[0].getY()].isSpawn());
		}	
		
		
		if(this.nextMove.isSpawn())
		{	
			this.newpos = new Position[this.p.length+1];
			
				for(int i = 0; i<this.p.length; i++)    //add the next move to the front of the body
				{
					this.newpos[i+1]=this.p[i];
				}
				newpos[0] = new Position(this.nextMove.getX(), this.nextMove.getY(), false);
				this.p=this.newpos;
				game.getBoard()[nextMove.getX()][nextMove.getY()].deSpawn();
			
		}
		if(!this.nextMove.isSpawn())
		{
			 this.newpos = new Position[this.p.length]; 
			
				for(int i = 1; i<this.p.length; i++)	//remove the last position in body and add the next move to the front
				{
					this.newpos[i] = this.p[i-1];
				}
				this.newpos[0] = new Position(this.nextMove.getX(), this.nextMove.getY(), false);
				this.p=this.newpos;
		}
	}
	public boolean validMove(String move, Board g)
	{
		if(move.equals("w")&&(this.p[0].getY()==0)) //if up check top
		{
			return false;
		}
		if(move.equals("s")&&(this.p[0].getY()==g.height()))  //if down check bottom
		{
			return false;
		}
		if(move.equals("a")&&(this.p[0].getX()==0)) //if left check far left
		{
			return false;
		}
		if(move.equals("d")&&(this.p[0].getX()==g.length())) //if down check bottom
		{
			return false;
		}
		if(move.equals("w")&&(this.p[1].getY()==this.p[0].getY()+1)) //if up check body above
		{
			return false;
		}
		if(move.equals("s")&&(this.p[1].getY()==this.p[0].getY()-1)) //if down check body below
		{
			return false;
		}
		if(move.equals("a")&&(this.p[1].getX()==this.p[0].getX()-1)) //if left check body left
		{
			return false;
		}
		if(move.equals("d")&&(this.p[1].getX()==this.p[0].getX()+1)) //if right check body right
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
