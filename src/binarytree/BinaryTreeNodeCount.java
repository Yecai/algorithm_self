package binarytree;

public class BinaryTreeNodeCount {

	/**
	 * 节点数量
	 */
	public static int count(BinaryTreeNode node) {
		if (node == null) {
			return 0;
		}
		return count(node.leftNode) + count(node.rightNode) + 1;
	}
}
