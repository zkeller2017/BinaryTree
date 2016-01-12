/**
	The Binary Search Tree Class is a Map that can find a  given item
	within the tree using a key
	@author Zachary Keller
	@version 1
*/
public class BST<E extends Comparable<E>>
{
	/**
		The Binary Tree at the head, the first item added to the tree
	*/
	private BinaryTree<E> root; 
	
	//  boolean add(E)
	//find method-  BinaryTree<E> find(E)
	// toString
	// boolean remove    optional
	
	/**
		Constructor for the BST class, sets the root to null
		the first thing that is added will become the root
	*/
	public BST()
	{
		root = null;
	}
	
	/**
		Adds a new item to the BinaryTree, 
		@param item the thing being added
		@return whether or not it was added, false if it already exists in the tree
	*/
	public boolean add(E item)
	{
		if (root == null)
		{	
			root = new BinaryTree<E>(item);
		}
		return add(item, root);
	}
	
	/**
		This is the recursive helper function for add. It Uses the
		compareTo function to determine where the added item should go should go.
		@param item the thing being added
		@param tree the tree to which the item is being added
		
	*/
	private boolean add(E item, BinaryTree<E> tree)
	{
		if (item.compareTo(tree.value()) > 0 && tree.right() == null)
		{
			tree.setRight(new BinaryTree<E>(item));
			return true;
		}
		if (item.compareTo(tree.value()) < 0 && tree.left() == null)
		{
			tree.setLeft(new BinaryTree<E>(item));
			return true;
		}
		if (item.compareTo(tree.value()) == 0)
		{
			return false;
		}
		if (item.compareTo(tree.value()) > 0)
		{
			return add(item, tree.right());
		}
		if (item.compareTo(tree.value()) < 0)
		{
			return add(item, tree.left());
		}
		return true;
		
	}
	/**
		Returns a string representation of the binary search tree
		@return A string representation of the binary search tree
	*/
	public String toString()
	{
		return root.toString();
	}
	
	/**
		finds and returns an item in the Binary Tree
		@param item the item to be found
		@return the BinaryTree that contains the desired item	
	*/
	public BinaryTree<E> find(E item) 
	{
		return finderHelper(item, root);
	}
	
	/**
		Helper function for find, recursively compares the item to
		the tree nodes until it finds where the item should be
		@param item The item to be found
		@tree the tree where the item is held
	*/
	private BinaryTree<E> finderHelper(E item, BinaryTree<E> tree)
	{
		if (item.equals(tree.value()))
		{
			return tree;
		}
		if (item.compareTo(tree.value()) > 0 && tree.right() == null)
		{
			return null;
		}
		if (item.compareTo(tree.value()) < 0 && tree.left() == null)
		{
			return null;
		}
		if (item.compareTo(tree.value()) > 0)
		{
			return finderHelper(item, tree.right());
		}
		else
		{
			return finderHelper(item, tree.left());
		}
	}

	/**
		Tests the BST class
	*/
	public static void main(String [] args)
	{
		BST<Integer> search = new BST<Integer>();
		search.add(3);
		search.add(5);
		search.add(7);
		System.out.println(search);
		System.out.println(search.find(5));
	}
	
	
	
	
}