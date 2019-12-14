package org.tektutor;

public class OOPLinkedList {

	private OOPLinkedListElement head;
	private OOPLinkedListElement tail;
	private int length;

	public OOPLinkedList() {
		head = tail = null;
		length = 0;
	}

	public void add ( int value ) {

		OOPLinkedListElement newNode = new OOPLinkedListElement ( value );

		//This is the first node that gets added into the list
		if ( head == null ) {
			head = newNode;
			tail = newNode;			
		}
		else {
			tail.setNextElement ( newNode );
			tail = newNode;
		}

		++length;
	}

	public int getLength() {
		return this.length;
	}

	public void insertElementAtPosition(int value, int position) 
		throws InvalidNodePositionException {
		OOPLinkedListElement currentNode = head;
		OOPLinkedListElement prevNode = null;
		int currentIndex = 0;

		OOPLinkedListElement newNode = new OOPLinkedListElement ( value );

		if ( position == 0 ) {
			newNode.setNextElement ( head );
			head = newNode;
			if ( length == 0 )
				tail = newNode;
			++length;
		}
		else {
			if ( length < position ) {
				throw new InvalidNodePositionException();
			}
			while ( currentNode != null ) {
				prevNode = currentNode;
				currentNode = currentNode.getNextElement();
				++currentIndex;
				
				if ( currentIndex == position ) {
					prevNode.setNextElement( newNode );	
					newNode.setNextElement( currentNode );
					break;
				}			
			}
		}
	}

	public void print() {
		OOPLinkedListElement currentNode = head;

		while ( currentNode != null  ) {
			System.out.print( currentNode.getValue() );
			System.out.print( "-->" );
			currentNode = currentNode.getNextElement();
		}
		System.out.println( "X" );
	}

	public String toString() {
		StringBuffer output= new StringBuffer();

		OOPLinkedListElement currentNode = head;

		while ( currentNode != null  ) {
			output.append( currentNode.getValue() );
			output.append( "-->" );
			currentNode = currentNode.getNextElement();
		}
		output.append("X");
		
		return output.toString();	
	}

}
