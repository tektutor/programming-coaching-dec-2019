package org.tektutor;

public class OOPLinkedListElement {
	
	private int value;
	private OOPLinkedListElement next;

	public OOPLinkedListElement(int value) {
		this.value = value;
		this.next = null;
	}

	public int getValue() {
		return this.value;
	}

	public OOPLinkedListElement getNextElement() {
		return this.next;
	}

	public void setNextElement(OOPLinkedListElement next) {
		this.next = next;
	}
}
