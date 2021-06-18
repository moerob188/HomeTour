package game;

import fixtures.Room;

public class Player {

	private Room currentRoom;
	
	Player(){
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

	Room getCurrentRoom(){
		return currentRoom;
	}
}
