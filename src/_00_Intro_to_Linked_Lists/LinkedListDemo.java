package _00_Intro_to_Linked_Lists;

public class LinkedListDemo {

    public static void main(String[] args) {

        /*
         * A LinkedList is a linear data structure, but unlike an ArrayList or
         * Array the data is not stored in contiguous memory locations.
         * 
         * Instead, each data node contains a reference that says where the next
         * node can be found.
         * 
         * Note: In the Node example provided there is also reference that
         * points back to the previous node. This is a referred to as a
         * doubly-linked list.
         * 
         * 1. Read through the LinkedList and Node classes
         * DONE
         * 2. Create a LinkedList of any type you like.
         * 
         * 3. Try using some LinkedList methods to add, remove and print a few
         * elements.
         * 
         * 4. Save the head or tail reference into a Node Object and use
         * references to traverse through the list and perform an operation on
         * every element then print the list to see if it worked.
         * 
         * e.g. Multiply every element by something in a LinkedList containing
         * Integer nodes or make word upper case in a LinkedList containing
         * String nodes.
         * 
         */
    	// This is how to print a linkedlist
    	LinkedList<String> ll = new LinkedList<String>();
    	ll.add("this");
    	ll.add("is");
    	ll.add("not");
    	ll.add("cool");
    	ll.remove(2);
    	Node current = ll.getHead();
    	Node tail = ll.getTail();
    	//while(current.getNext()!=null) {
    	for (int i = 0; i < ll.size(); i++) {
			
		
    		System.out.println(i);
    		}
		          System.out.println(current.getValue()); 
		          current = current.getNext();
		          
		            
		}
       //System.out.println();
    	
    }


