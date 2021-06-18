package fixtures;

import java.util.Arrays;

public class Room extends Fixture {

	private Room exits[];
	
	public Room(String name, String sd, String ld)
	{
		super(name, sd, ld);
		this.exits = new Room[4];
		exits[0] = this;
		exits[1] = this;
		exits[2] = this;
		exits[3] = this;
	}
	
	public Room[] getExits() {
		
		return exits;
		
	}
	
	public Room getExits(String direction) {
		
		if(direction == "go north") {
			if(this.exits[0] == null)
			{
				
			}
			
			return this.exits[0];
		}
		else if(direction == "go east")
		{
			return this.exits[1];
		}
		else if(direction == "go south")
		{
			return this.exits[2];
		}
		else if(direction == "go west")
		{
			return this.exits[3];
		}
		
		return this;
	}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	public Room getNorthExit(){
		return this.exits[0];
	}
	
	public Room getEastExit(){
		return this.exits[1];
	}
	
	public Room getSouthExit(){
		return this.exits[2];
	}
	
	public Room getWestExit(){
		return this.exits[3];
	}
	
	public void setNorthExit(Room e){
		 this.exits[0] = e;
	}
	
	public void setEastExit(Room e){
		 this.exits[1] = e;
	}
	
	public void setSouthExit(Room e){
		 this.exits[2] = e;
	}
	
	public void setWestExit(Room e){
		 this.exits[3] = e;
	}
	
	@Override
	public String toString() {
		return  "north exit: " + exits[0].getName() +" - "+ exits[0].getShortDescription() + "\n"
				+ "east exit: " + exits[1].getName()+" - "+ exits[1].getShortDescription() + "\n"
				+ "south exit: " + exits[2].getName()+" - "+ exits[2].getShortDescription() + "\n"
				+"west exit: " + exits[3].getName()+"- "+ exits[3].getShortDescription() + "\n";
	}
	


}
