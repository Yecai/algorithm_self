package binarytree;

import java.util.Stack;

public class BinaryTreeTraverse {
	
	/**
	 * 前序遍历
	 */
	public static void preOrder(BinaryTreeNode root) {
		if (null == root) {
			return;
		}
		visit(root);
		preOrder(root.leftNode);
		preOrder(root.rightNode);
	}

	private static void visit(BinaryTreeNode root) {
		System.out.println("前序遍历:" + root.value);
	}

	public static void InOrderDev(BinaryTreeNode root)
	{
	    if(root == null)
	    {
	        System.out.println("空树");
	    }

	    Stack<BinaryTreeNode> nstack = new Stack<BinaryTreeNode>();
	    BinaryTreeNode node = root;

	    //  开始遍历整个二叉树
	    while(node != null || nstack.empty() != true)
	    {
	        // 不输出当前根节点，但是递归直至当前根节点node的最左端
	        while(node != null)
	        {
	            nstack.push(node);
	            node = node.leftNode;
	        }

	        //  此时栈顶的元素是当前最左元素
	        //  它应该被输出
	        if(nstack.empty( ) != true)
	        {

	            node = nstack.pop();
	            System.out.println(node.getValue());
	            node = node.rightNode;
	        }
	    }
	}
}
