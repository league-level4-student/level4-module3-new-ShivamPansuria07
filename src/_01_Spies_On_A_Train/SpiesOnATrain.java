package _01_Spies_On_A_Train;

import java.util.HashMap;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     * 
     * The results are randomly generated each time so you should have a general
     * case solution that carefully compares the clues to each passenger's
     * testimony. Remember to use String methods to break up the passengers'
     * statements.
     */
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
    	Node current = train.getHead();
    	String suspect;
    	for (int i = 0; i < train.size(); i++) {
    		for (int k = 0; k < clues.length; k++) {
    			if(current.getValue()==clues[i]) {
        			System.out.println(current.getValue());
        		}
    		          System.out.println(current.getValue()); 
    		          current = current.getNext();
			}
    		
		          
		            
		}
       System.out.println();
        return "";

    }

}
