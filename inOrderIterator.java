import java.util.NoSuchElementException;
import java.util.Iterator;

/**
	The inOrderIterator Class for Binary Trees.
	It runs through the Binary tree
	using the Left, Root, Right algorithm in the constructor,
	and places all the values in the correct order in a queue, 
	and the queue is actually what gets iterated through.
	@author Zachary Keller
	@version Final
*/
public class inOrderIterator<E> implements Iterator<E>
{
	/**
		The Queue that holds the final values for the Iterator after
		it has worked through the BinaryTree
	*/
	private Queue<E> set;
	
	
	/**
		Constructor for a new Iterator.The Constructor calls sort automatically,
		meaning that the sequence of values for this tree is determined in the 
		constructor and placed in the queue
		@param head The Binary Tree that is being iterated through
	*/
	public inOrderIterator(BinaryTree head)
	{
		set = new LinkedList<E>();
		sort(head);
	}
	
	/**
		This helper function runs through the Tree and places
		all the values into a queue based on the algorithm for
		an inOrderIterator: Left, Root, Right.
		@param tree the BinaryTree being worked on
	*/
	private void sort(BinaryTree<E> tree)
	{
		if (tree.left() != null)
			sort(tree.left());
		set.offer(tree.value());
		if (tree.right() != null)
			sort(tree.right());	
	}
	
	/**
		Determines whether or not the iterator has finished traversing the queue,
		which is representative of the Binary Tree
		@return Whether or not the iterator has finished traversing the Binary Tree
	*/
	public boolean hasNext()
	{
		return !(set.isEmpty());
	}
	
	/**
	Returns the next object in the queue, which is representative of the
	next object in the Binary Tree as determined by the algorithm for
	the inOrderIterator
	@return The next object in the queue
	*/
	public E next()
	{
		if (! hasNext())
		{
			throw new NoSuchElementException("End of Linked List");
		}
		return set.poll();
		
	}
	
}
	
