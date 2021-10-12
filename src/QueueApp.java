
public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		
		
		System.out.println("Is queue empty: "+q.isEmpty()+"\n");
		q.insert(20, 23);
		q.insert(30, 34);
		q.insert(40, 45);
		q.insert(50, 56);
		q.insert(60, 67);
		System.out.println("Is queue empty: "+q.isEmpty()+"\n\n Dsiplaying all data\n");
		
		q.displayQueue();
		
		System.out.print("\nDeleting from the queue\t");
		
		q.remove().displayLink();

	}

}
