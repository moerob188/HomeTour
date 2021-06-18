package game;

import java.util.LinkedList;
import java.util.List;

import fixtures.Room;

public class RoomManager {

	Room startingRoom;
	List <Room> rooms = new LinkedList<Room>();
	
	RoomManager(){
		startingRoom = new Room("","","");
	}
	
	public void init() {
		
		
		// Creating all the rooms and adding them to rooms list
		
		Room entryWay = new Room("Entry Way",
				"A small entryway at the front of the house",
				"This entryway has hardwood floors and can pretty much only fit a coat rack \n"
				+"and a small table which has a key bowl on top of it" + "\n"
				+ "It leads into the living room");
		
		entryWay.addItem("Coat Rack");
		entryWay.addItem("table");
		entryWay.addItem("Key Bowl");
		
		rooms.add(entryWay);
		startingRoom = entryWay;
		
		Room livingRoom = new Room("Living Room",
				"A cozy living room", 
				"This living room which serves as the central room of the house"
				+" has a huge couch ");
		livingRoom.addItem("Couch");
		livingRoom.addItem("TV");
		livingRoom.addItem("Coffee Table");
		rooms.add(livingRoom);
		
		
		Room kitchen = new Room("Kitchen",
				"A recently renovated kitchen ", 
				"This kitchen is fairly large and has many duplicate items"
				+ " It's hard to find anything and all though it looks clean"
				+ " if you open any cabinet pans will fall out ");
		kitchen.addItem("Fridge");
		kitchen.addItem("Stove");
		rooms.add(livingRoom);
		
		Room dining = new Room("Dining Room",
				"A small dining room", 
				"The dining room is small yet charming with great views of the surrounding neighborhood."
				+ "This room is only used on special occasions ");
		dining.addItem("Tabel");
		dining.addItem("Chair");
		dining.addItem("Chair");
		dining.addItem("Chair");
		dining.addItem("Chair");
		rooms.add(dining);
		
		Room hall = new Room("Hallway",
				"A long hallway", 
				"This hallway has many pictures on the wall but nothing else");

		rooms.add(hall);
		
		Room bathroom = new Room("Bathroom",
				"The only bathroom in the house", 
				"While a fairly large bathroom it's a bit annoying that "
				+ "when many guest come over a line will form on the outside.");
		bathroom.addItem("Toilet");
		bathroom.addItem("Sink");
		bathroom.addItem("Shower");
		bathroom.addItem("Bath");
		rooms.add(bathroom);
		
		Room master = new Room("Master Bedroom",
				"A nice sized bedroom", 
				"Just a lovely bedroom not much to say about it");
		master.addItem("Bed");
		master.addItem("Nightstand");
		master.addItem("Dresser");

		rooms.add(master);
		
		Room kid = new Room("Kid Bedroom",
				"A cute kids room", 
				"A kids room with many toys ");
		kid.addItem("Bed");
		kid.addItem("Nightstand");
		kid.addItem("Dresser");
		kid.addItem("Toys");

		rooms.add(kid);
		

		//Adding all the exits to the rooms 
		
		entryWay.setNorthExit(livingRoom);
		
		livingRoom.setSouthExit(entryWay);
		livingRoom.setNorthExit(hall);
		livingRoom.setEastExit(kitchen);
		livingRoom.setWestExit(kid);
		
		kitchen.setWestExit(livingRoom);
		kitchen.setNorthExit(dining);
		
		dining.setSouthExit(kitchen);
		
		hall.setSouthExit(livingRoom);
		hall.setNorthExit(bathroom);
		hall.setWestExit(master);
		
		bathroom.setSouthExit(hall);
		
		master.setEastExit(hall);
		
		kid.setEastExit(livingRoom);
		
	}
	
}
