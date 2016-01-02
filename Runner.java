/**
	This Runner class tests the functions in Binary Tree
	to make sure they are working. There are actually 3 runners
	here, 2 of them mine, one Sam's; they can all be used
	separately, and because they are helpful, I kept them.
	@author Zachary Keller
	@version final
*/
public class Runner
{
	public static void main(String[] args)
	{
		
		BinaryTree<Integer> tree = new BinaryTree<Integer>(1);
		tree.setLeft(new BinaryTree<Integer>(2));
		tree.setRight(new BinaryTree<Integer>(2));
		System.out.println(tree);
		System.out.println("tree size: " + tree.size());
		System.out.println("Right tree size: " + tree.right().size());
		System.out.println("isFullYes: " + tree.isFull());
		tree.right().setRight(new BinaryTree<Integer>(3));
		System.out.println("isFullNo: " + tree.isFull());
		tree.right().setLeft(new BinaryTree<Integer>(3));
		System.out.println("isFullNo: " + tree.isFull());
		System.out.println("isBalancedYes: " + tree.isBalanced());
		tree.right().right().setRight(new BinaryTree<Integer>(4));
		System.out.println(tree);
		System.out.println("isBalancedNo: " + tree.isBalanced());
		System.out.println("isCompleteNo: " + tree.isBalanced());
		for (Integer i : tree)
		{
			System.out.println(i);
		}
		/*
		
		BinaryTree<String> tester = new BinaryTree<String>("7", new BinaryTree<String>("B"), new BinaryTree<String>("A"));
tester.left().setLeft(new BinaryTree<String>("4"));
tester.left().setRight(new BinaryTree<String>("6"));
tester.right().setLeft(new BinaryTree<String>("E"));
tester.right().setRight(new BinaryTree<String>("2"));
tester.left().left().setLeft(new BinaryTree<String>("5"));
tester.left().left().setRight(new BinaryTree<String>("C"));
tester.right().left().setLeft(new BinaryTree<String>("9"));
for(String s: tester)
System.out.print(s);
System.out.println("");
	*/	
		
		
		
		/*
		BinaryTree<String> tester = new BinaryTree<String>("A");
tester.setLeft(new BinaryTree<String>("B"));
tester.setRight(new BinaryTree<String>("C"));
tester.left().setLeft(new BinaryTree<String>("D"));
tester.right().setLeft(new BinaryTree<String>("E"));
tester.right().setRight(new BinaryTree<String>("F"));
tester.right().left().setLeft(new BinaryTree<String>("G"));
tester.right().left().setRight(new BinaryTree<String>("H"));
System.out.println(tester);
*/
	}
}