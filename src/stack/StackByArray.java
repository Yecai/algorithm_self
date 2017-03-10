package stack;

/**
 * 数组实现栈
 * @author panhuaxiong
 */
public class StackByArray<E> {
	
	/** 数组 **/
	private Object arr;
	/** 容量 **/
	private int default_capacity = 4;
	/** 头指针 **/
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
