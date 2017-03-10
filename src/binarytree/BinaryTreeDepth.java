package binarytree;

public class BinaryTreeDepth {
	
	/**
	 * ÊýÉî¶È
	 */
	public static int depth (BinaryTreeNode node) {
		if (node == null) {
			return 0;
		}
		int leftDepth = depth(node.leftNode);
		int rightDepth = depth(node.rightNode);
		return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
	}
}
