package stack;

/**
 * ����ʵ��ջ
 * @author panhuaxiong
 */
public class StackByArray<E> {
	
	/** ���� **/
	private Object arr;
	/** ���� **/
	private int default_capacity = 4;
	/** ͷָ�� **/
	private int head = -1;
	
	
	public StackByArray() {
		arr = new Object[default_capacity];
	}
	
	public void push(E element) {
		
	}
	
	public E pop() {
		return null;
	}
	
	public boolean empty() {
		return true;
	}
	
	public int size() {
		return 0;
	}
	
	public int capacity() {
		return 0;
	}
//	peek
}
