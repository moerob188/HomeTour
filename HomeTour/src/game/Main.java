package game;

import java.util.Scanner;

public class Main {

 static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		RoomManager house = new RoomManager();
		house.init();
		
		Player morgan = new Player();
		morgan.setCurrentRoom(house.startingRoom);

		Boolean didQuit = false;
		
		
		howToPlay();
		printRoom(morgan);
		
		do {
			String [] input = collectInput();
				if(input[0].equalsIgnoreCase("quit")){
					didQuit = true;
				}
				else
				{
					parse(input,morgan);
					printRoom(morgan);
				}
			}while(didQuit != true);
		
		
	}
	
	private static void howToPlay(){	
		System.out.println("-----------------------------------");
		System.out.println("How to Play: "+"\n");
		System.out.println( "To move: " +"\n"+ "go north" +"\n"+ "go east"+"\n"+ "go south "+"\n"+ "go west" +"\n");
		System.out.println("To add an item to a room: " +"\n"+ "add \"item name\" "+"\n");
		System.out.println("To remove an item in a room: " +"\n"+ "remove \"item name\" ");
		System.out.println("------------------------------------");

	}
		
	
	private static void printRoom(Player p){
		System.out.println( "Current Room: "+p.getCurrentRoom().getName());
		System.out.println();
		
		System.out.println(p.getCurrentRoom().getLongDescription());
		System.out.println();
		
		System.out.println("Items in this room:");
		System.out.println(p.getCurrentRoom().getItems());
		System.out.println();
		
		System.out.println("Exits:");
		System.out.println(p.getCurrentRoom().toString());
		
	}
	
	private static String [] collectInput()
	{
		System.out.println("Enter in an action:");
		String direct = scanner.nextLine();
		String [] myArray = direct.split(" ");
		
		return myArray;
	}
	
	private static void parse(String []input, Player p)
	{
		if(input[0].equalsIgnoreCase("go")){
			
			if(input[1].equalsIgnoreCase("north"))
			{
				p.setCurrentRoom(p.getCurrentRoom().getNorthExit());
			}
			else if(input[1].equalsIgnoreCase("east"))
			{
				p.setCurrentRoom(p.getCurrentRoom().getEastExit());
			}
			else if(input[1].equalsIgnoreCase("south"))
			{
				p.setCurrentRoom(p.getCurrentRoom().getSouthExit());
			}
			else if(input[1].equalsIgnoreCase("west"))
			{
				p.setCurrentRoom(p.getCurrentRoom().getWestExit());
			}
			else {
				System.out.println("Please enter a valid direction");
				howToPlay();
			}
		}
		else if(input[0].equalsIgnoreCase("add"))
		{
			p.getCurrentRoom().addItem(input[1]);
		}
		else if(input[0].equalsIgnoreCase("remove"))
		{
			p.getCurrentRoom().removeItem(input[1]);
		}
		else
		{
			System.out.println("Please type in a valid instruction ");
			howToPlay();
		}
	}
}
