package fixtures;

import java.util.LinkedList;
import java.util.List;

public abstract class Fixture {
	
	private String name;
	private String shortDescription;
	private String longDescription;
	List <String> items = new LinkedList<String>();
	
	Fixture(){
	}
	
	Fixture(String name, String shortDescription,String longDescription){
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	
	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public void addItem(String newItem)
	{
		items.add(newItem);
	}
	
	public void removeItem(String item)
	{
		for(String i : items){
			if(i.equalsIgnoreCase(item)) {
				items.remove(i);
				break;
			}
		}
	}
}
