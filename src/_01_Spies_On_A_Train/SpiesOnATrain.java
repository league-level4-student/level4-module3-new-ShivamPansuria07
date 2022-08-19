package _01_Spies_On_A_Train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

	/*
	 * A spy has made off with important intel from your intelligence agency! You
	 * know the spy is somewhere on this train(LinkedList). Your job is to find the
	 * suspect that matches the description given to you by the list of clues(the
	 * array).
	 * 
	 * Walk through the train, questioning each of the passengers about what they
	 * have seen and return the name of the most likely suspect.
	 * 
	 * The results are randomly generated each time so you should have a general
	 * case solution that carefully compares the clues to each passenger's
	 * testimony. Remember to use String methods to break up the passengers'
	 * statements.
	 */
	boolean findcur(String[] clues, String passengerStr) {
		for (int i = 0; i < clues.length; i++) {
			if (passengerStr.contains(clues[i])) {
				return true;
			}

		}
		return false;
	}

	String findIntel(LinkedList<TrainCar> train, String[] clues) {
		String PersonWithMostOccurences = "";
		Node<TrainCar> current = train.getHead();
		String suspect = current.getValue().questionPassenger();
		List<String> arr = new ArrayList<>();
		//String ws = "";
		String[] names = { "Ali", "Francis", "Kelly", "Cate", "Jason", "Phillip", "Norman", "Sam", "Desmond", "Vesper",
				"Froy", "Lemmy", "Quiller", "Xander" };
		while (current.getNext() != null) {

			String cur = current.getValue().questionPassenger();

			if (findcur(clues, cur)) {
				for (int j = 0; j < names.length; j++) {
					if (cur.split("Hmm")[1].contains(names[j])) {

						System.out.println(names[j]);
						arr.add(names[j]);
					}}
			}
			current = current.getNext();
		}
						HashMap<String, Integer> HashSuspect = new HashMap<String, Integer>();
						for (String name : arr) {
							if(HashSuspect.containsValue(name)) {
								HashSuspect.put(name, HashSuspect.get(name)+1);
								
							}else {
								HashSuspect.put(name,1);
							}
						}
						int maxint = 0;
			             int maxCount = -maxint;
			             
			             for(String eachkey : HashSuspect.keySet()) {
			            	 if(HashSuspect.get(eachkey) > maxCount) {
			            		 PersonWithMostOccurences = eachkey;
			            		 maxCount = HashSuspect.get(eachkey);
			            	 }
			             }
			             return PersonWithMostOccurences;
}
}

// Go through each node and coun the passager from the clue
// call the question passanger go through all the clues and check out many times
// the persons name is called store this inside of a arraylist
