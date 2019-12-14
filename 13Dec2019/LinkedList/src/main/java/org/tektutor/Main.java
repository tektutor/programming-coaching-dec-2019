package org.tektutor;

public class Main {

	public static void main ( String[] args ) {

	   try {
		OOPLinkedList list = new OOPLinkedList();
	
		for( int count=1; count<6; ++count ) 
			list.add ( count*10 );

		System.out.println ("\nList elements are ...");
		list.print();

		list.insertElementAtPosition(100, 0);
		System.out.println ("\nList elements after adding 100 at head node ...");
		list.print();

		//list.insertElementAtPosition(200, 20);
		//System.out.println ("\nList elements after adding 200 at 3rd position...");
		//list.print();

		System.out.println ("\nPrinting via toString ...");
		System.out.println ( list );
	   }
	   catch(Exception e ) {
		e.printStackTrace();
	   }

	}

}
