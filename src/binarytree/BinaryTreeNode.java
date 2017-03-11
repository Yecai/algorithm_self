package binarytree;

public class BinaryTreeNode {
	public int value;
	public BinaryTreeNode leftNode;
	public BinaryTreeNode rightNode;
	
	
	
	public static void main(String[] args) {
		BinaryTreeNode node = init();
//		System.out.println("节点个数：" + BinaryTreeNodeCount.count(node));
//		System.out.println("树深度：" + BinaryTreeDepth.depth(node));
		BinaryTreeTraverse.InOrderDev(node);
	}


	private static BinaryTreeNode init() {
		BinaryTreeNode root = new BinaryTreeNode();
		root.setValue(10);
		BinaryTreeNode left1 = new BinaryTreeNode();
		left1.setValue(8);
		root.setLeftNode(left1);
		BinaryTreeNode right1 = new BinaryTreeNode();
		right1.setValue(12);
		root.setRightNode(right1);
		
		BinaryTreeNode left2 = new BinaryTreeNode();
		left2.setValue(6);
		left1.setLeftNode(left2);
		BinaryTreeNode right2 = new BinaryTreeNode();
		right2.setValue(7);
		left1.setRightNode(right2);

		BinaryTreeNode left3 = new BinaryTreeNode();
		left3.setValue(13);
		right1.setLeftNode(left3);
		BinaryTreeNode right3 = new BinaryTreeNode();
		right3.setValue(14);
		right1.setRightNode(right3);
		
		return root;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public BinaryTreeNode getLeftNode() {
		return leftNode;
	}


	public void setLeftNode(BinaryTreeNode leftNode) {
		this.leftNode = leftNode;
	}


	public BinaryTreeNode getRightNode() {
		return rightNode;
	}


	public void setRightNode(BinaryTreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
}
