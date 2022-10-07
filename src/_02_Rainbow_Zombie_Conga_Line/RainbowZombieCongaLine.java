package _02_Rainbow_Zombie_Conga_Line;

import java.util.Iterator;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class RainbowZombieCongaLine {

	/*
	 * You are hosting a rainbow zombie conga dance party! Zombies are not very
	 * smart(maybe that's why they crave brains) and need your help to direct them
	 * through the choreography.
	 * 
	 * Each method is a dance move you will need to implement.
	 * 
	 * When you think you've gotten your zombies trained well enough you can start
	 * the party by running the main method in RainbowZombieDanceParty and typing
	 * how many rounds you want in the console to see if they followed your
	 * choreography correctly.
	 * 
	 * Note: The party will always start with a rainbow brains and every 5 rounds
	 * the head and tail of the dance line will be removed.
	 */

	private LinkedList<Zombie> congaLine;
	private ZombieHatColor[] zombieHats;

	public RainbowZombieCongaLine() {

		congaLine = new LinkedList<Zombie>();
		zombieHats = ZombieHatColor.values();

	}

	// Make the passed in zombie the first Zombie in the conga line!
	public void engine(Zombie dancer) {
		LinkedList<Zombie> conga = new LinkedList<Zombie>();
		conga.add(dancer);
		conga.setTail(congaLine.getHead());
		congaLine = conga;
	}

	// Make the passed in zombie the last Zombie in the conga line!
	public void caboose(Zombie dancer) {
		congaLine.add(dancer);

	}

	// Place the zombie at the designated position in the conga line!
	public void jumpInTheLine(Zombie dancer, int position) {
		LinkedList<Zombie> conga = new LinkedList<Zombie>();
		for (int i = 0; i < congaLine.size(); i++) {
			if (i == position) {
				conga.add(dancer);
			}
			Zombie head = congaLine.getHead().getValue();
			conga.add(head);
			congaLine.remove(0);
		}

		congaLine = conga;
	}

	/*
	 * Remove all zombies with the same hat color as the passed in zombie from the
	 * conga line!
	 */
	public void everyoneOut(Zombie dancer) {
		dancer.getZombieHatColor();
		Zombie head = congaLine.getHead().getValue();
		int position = 0;
		while (congaLine.getHead().getNext() != null) {
			position++;
			if (dancer.getZombieHatColor().equals(congaLine.getHead().getValue().getZombieHatColor())) {
				congaLine.remove(position);
			}
		}
	}

	/*
	 * Remove the first zombie with the same hat color as the passed in zombie from
	 * the conga line!
	 */

	public void youAreDone(Zombie dancer) {
		int position = 0;
		boolean flag = true;
		while (congaLine.getHead().getNext() != null && flag) {
			position++;
			if (dancer.getZombieHatColor().equals(congaLine.getHead().getValue().getZombieHatColor())) {
				congaLine.remove(position);
				flag = false;
			}
		}
	}

	/*
	 * Make two more zombies with the same hat color as the passed in zombie and add
	 * one to the front, one to the end and one in the middle.
	 */

	public void brains(Zombie dancer) {
		int middle = (congaLine.size() / 2);
		boolean flag = true;
		ZombieHatColor zhc = dancer.getZombieHatColor();
		Zombie zom = new Zombie(zhc);
		Zombie zom2 = new Zombie(zhc);
		engine(zom);
		caboose(zom2);
		congaLine.add(dancer);
		jumpInTheLine(dancer, middle);
//		while (congaLine.getHead().getNext() != null && flag) {
//
//			for (int i = 0; i < congaLine.size(); i++) {
//				if (i == middle) {
//					congaLine.add(zom);
//				}
//			//	congaLine.add(dancer);
//				congaLine.remove(0);
//			}
//			
//			flag = false;
//			
//		}

	}

	/*
	 * Add the passed in zombie to the front and then add one zombie of each hat
	 * color to the end of the line.
	 */
	public void rainbowBrains(Zombie dancer) {

	}

	public LinkedList<Zombie> getCongaLine() {
		return congaLine;
	}
}
