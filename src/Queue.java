
public class Queue {
	private Linkedlist list;
	
	/**
	 * Class constructor
	 */
	public Queue() {
		this.list = new Linkedlist();
	}
	
	
	/**
	 * Checking if the queue is empty
	 * @return
	 */
	public boolean isEmpty() {
		return this.list.isEmpty();
	}
	
	
	/**
	 * Inserting link into the queue
	 * @param key
	 * @param value
	 */
	public void insert(int key, int value) {
		this.list.insertLast(key, value);
	}
	
	
	/**
	 * Removing link form the queue
	 * @return
	 */
	public Link remove() {
		return this.list.deleteFirst();
	}
	
	
	/**
	 * Displaying all the links in the queue
	 */
	public void displayQueue() {
		this.list.displayList();
	}
}
