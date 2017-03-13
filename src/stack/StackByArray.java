package stack;

/**
 * 数组实现栈
 * @author panhuaxiong
 */
public class StackByArray<E> {
	
	/** 数组 **/
	private Object[] arr;
	/** 容量 **/
	private int capacity = 4;
	/** 数量 **/
	private int num = 0;
	
	
	public StackByArray() {
		arr = new Object[capacity];
	}
	
	public void push(E element) {
		arr[num] = element;
		num++;
		growCapacity(num);
	}
	
	private void growCapacity(int num) {
		if (num == capacity) {
			capacity = capacity * 2;
			Object[] tmpArr = new Object[capacity];
			copy(arr, tmpArr);
			arr = tmpArr;
		}
	}
	
	private void copy(Object[] src, Object[] dst) {
		for (int i = 0; i < num; i++) {
			dst[i] = src[i];
		}
	}

	private void downCapacity(int num) {
		if (num < capacity / 4) {
			capacity = capacity / 2;
			Object[] tmpArr = new Object[capacity];
			copy(arr, tmpArr);
			arr = tmpArr;
		}
	}

	@SuppressWarnings("unchecked")
	public E pop() throws StackEmptyException {
		if (empty()) {
			throw new StackEmptyException("stack empty!");
		}
		num--;
		Object o = arr[num];
		downCapacity(num);
		return (E) o;
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int size() {
		return num;
	}
	
	public int capacity() {
		return capacity;
	}
	@SuppressWarnings("unchecked")
	public E peek() throws StackEmptyException {
		if (empty()) {
			throw new StackEmptyException("stack empty!");
		}
		return (E) arr[num - 1];
	}

	@SuppressWarnings("unchecked")
	public int search(E e) {
		for (int i = 0; i < num; i++) {
			if (((E) arr[i]).equals(e)) {
				return i;
			}
		}
		return -1;
	}
}

class StackEmptyException extends RuntimeException {
	private static final long serialVersionUID = -4618845390136090271L;

	public StackEmptyException(String msg) {
		super(msg);
	}
}
