
public class Linkedlist {
	private Link first;
	private Link last;
	
	
	/**
	 * Class constructor.
	 */
	public Linkedlist() {
		this.first = null;
		this.last = null;
	}
	
	
	/**
	 * Checking if the linked list is empty
	 * @return
	 */
	public boolean isEmpty() {
		return this.first == null;
	}
	
	
	/**
	 * Inserting Link at the start of the linked list
	 * @param key
	 * @param value
	 */
	public void insertFirst(int key, int value) {
		Link newLink = new Link(key, value);
		if(this.isEmpty()) {
			this.last = newLink;
		}
		newLink.next = this.first;
		this.first = newLink;
	}
	
	/**
	 * Inserting element at the end of the linked list
	 * @param key
	 * @param value
	 */
	public void insertLast(int key, int value) {
		Link newLink = new Link(key, value);
		if(this.isEmpty()) {
			this.first = newLink;
		}else {
			this.last.next = newLink;
		}
		this.last = newLink;
	}
	
	/**
	 * Deleting element at the start of the linked list
	 * @return
	 */
	public Link deleteFirst() {
		Link deleteLink = this.first;
		if(this.first.next == null) {
			this.last = null;
		}else {
			this.first = this.first.next;
		}
		return deleteLink;
	}
	
	/**
	 * Displaying all the values in the linked list
	 */
	public void displayList() {
		Link currentLink = this.first;
		while(currentLink != null) {
			currentLink.displayLink();
			currentLink = currentLink.next;
		}
	}
}
