package binarytree;

import java.util.Stack;

public class BinaryTreeTraverse {
	
	/**
	 * ǰ�����
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
		System.out.println(root.value);
	}

	public static void InOrderDev(BinaryTreeNode root)
	{
	    if(root == null)
	    {
	        System.out.println("����");
	    }

	    Stack<BinaryTreeNode> nstack = new Stack<BinaryTreeNode>();
	    BinaryTreeNode node = root;

	    //  ��ʼ��������������
	    while(node != null || nstack.empty() != true)
	    {
	        // �������ǰ���ڵ㣬���ǵݹ�ֱ����ǰ���ڵ�node�������
	        while(node != null)
	        {
	            nstack.push(node);
	            node = node.leftNode;
	        }

	        //  ��ʱջ����Ԫ���ǵ�ǰ����Ԫ��
	        //  ��Ӧ�ñ����
	        if(nstack.empty( ) != true)
	        {

	            node = nstack.pop();
	            System.out.println(node.getValue());
	            node = node.rightNode;
	        }
	    }
	}
}
