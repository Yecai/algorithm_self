package stack;

public class StackByArray2<E> {
	
	/** 数组 **/
	private Object[] elementData;
	
	/** 数量 **/
	private int elementCount;
	
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	
	public StackByArray2() {
		this(10);
	}
	
	public StackByArray2(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("Illegal capacity:" +
												initialCapacity);
		}
		this.elementData = new Object[initialCapacity];
	}
	
	public E push(E item) {
		//确保容量
		ensureCapacityHelper(elementCount + 1);
		elementData[elementCount++] = item;
		return item;
	}
	
	@SuppressWarnings("unchecked")
	public E pop() {
		Object item = peek();
		elementCount--;
		elementData[elementCount] = null;
		return (E) item;
	}

	@SuppressWarnings("unchecked")
	public E peek() {
		if (empty()) {
			throw new EmptyStackException();
		}
		return (E) elementData[elementCount - 1];
	}

	public boolean empty() {
		return size() == 0;
	}

	public int size() {
		return elementCount;
	}
	
	public int capacity() {
		return elementData.length;
	}
	
	/**
	 * 返回o在栈从栈顶开始的第几个位置
	 * 栈顶为1，从1开始算
	 */
	public int search(Object o) {
		int i = lastIndexOf(o);
		if (i >= 0) {
			return elementCount - i;
		}
		return -1;
	}

	private int lastIndexOf(Object o) {
		int idx = -1;
		for (int i = (elementCount - 1); i >= 0; i--) {
			if (elementData[i] == o) {
				idx = i;
				break;
			}
		}
		return idx;
	}

	private void ensureCapacityHelper(int minCapacity) {
		if (minCapacity - elementData.length > 0) {
			//增长容量
			grow(minCapacity);
		}
	}

	private void grow(int minCapacity) {
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity * 2;
		if (newCapacity - minCapacity < 0) {
			newCapacity = minCapacity;
		}
		if (newCapacity - MAX_ARRAY_SIZE > 0) {
			newCapacity = hugeCapacity(minCapacity);
		}
		Object[] newElementData = new Object[newCapacity];
		for (int i = 0; i < elementData.length; i++) {
			newElementData[i] = elementData[i];
		}
		elementData = newElementData;
	}

	private int hugeCapacity(int minCapacity) {
		if (minCapacity < 0) { //溢出
			throw new OutOfMemoryError();
		}
		return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
	}
	
	
}

class EmptyStackException extends RuntimeException {
	private static final long serialVersionUID = 1453872009576624684L;
	
	public EmptyStackException() {
	}
}
