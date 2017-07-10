package Controller;

import java.util.Scanner;
import Model.*;

public class battleFTW {
	private String choice = "lol"; // This variable will take everything the user will write in the console
	Scanner sc = new Scanner(System.in); // Essential if you want to make a Scanner
	player you; // Create an object for your class even if the code don't know what you'll play
	player ia; // Create an object for the class of the ia even if the code don't know what he'll play
	private boolean end = false; // Will be use to terminate the program when needed
	jarvis friday = new jarvis(); // Create the ia
	private int next = 0;
	private int testNext;
	private boolean testEnd = false;

	public void letsDance(String choice){ // Method which let you choose your action (attack, block or special)


		switch (choice) { // test your answer
		
		// If you want to attack or block, the system will just print your choice and save your answer for now
		
		case "attack": 
			System.out.println("You attack the ennemy");
			you.setSprite(choice);
			break;
		
		case "block":
			System.out.println("You block the attack of the ennemy");
			you.setSprite(choice);
			break;
			
		case "special": // If you want to execute the special attack
			you.special(); // The System will execute the Special attack of your class
			you.setSprite(choice);
			break;
		}
		
		end = friday.whatNow(choice, ia, you); // Launch the ia
	}
	
	public void choix (String i){ // Method which load the class you chosen

			switch (i){ // Test your answer
			
			case "damager": // If you want the damager
				you = new damager(); // The object will be a damager 
				break;
				
			case "healer": // Same
				you = new healer();
				break;
				
			case "tank": // Same
				you = new tank();
				break;
			}
	}
		
	public void choixIa (String i){
		switch (i){ // Test your answer
		
		case "damager": // If you want the ia to be a damager
			ia = new damager(); // The object will be a damager 
			break;
			
		case "healer": // Same
			ia = new healer();
			break;
			
		case "tank": // Same
			ia = new tank();
			break;
		}
	}	
	
	public String getSpriteYou() { // Setters and getters
		return "image/player"+you.getSprite();
	}
	public String getSpriteIa() {
		return "image/friday"+ia.getSprite();
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public player getYou() {
		return you;
	}

	public void setYou(player you) {
		this.you = you;
	}

	public player getIa() {
		return ia;
	}

	public void setIa(player ia) {
		this.ia = ia;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public boolean getEnd() {
		return end;
	}

	public int getTestNext() {
		return testNext;
	}

	public void setTestNext(int testNext) {
		this.testNext = testNext;
	}
	
	public boolean getTestEnd(){
		return testEnd;
	}
}
