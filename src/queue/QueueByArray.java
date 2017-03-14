package queue;

public class QueueByArray<E> {
	
	/** 数据 **/
	private Object elementData[];
	
	/** 头指针 **/
	private int head;
	
	/** 尾指针 **/
	private int tail;
	
	public QueueByArray() {
		this(10);
	}
	
	public QueueByArray(int capacity) {
		this.elementData = new Object[capacity];
		this.head = this.tail = 0;
	}

	/**
	 * 将指定的元素插入到此队列中（如果立即可行且不会违反容量限制），在成功时返回 true，如果当前没有可用空间，则抛出 IllegalStateException
	 * @param e
	 */
	public boolean add (E e) {
		if (tail == elementData.length) {
			throw new IllegalStateException("queue full!");
		}
		elementData[tail++] = e;
		return true;
	}
	
	//获取并移除此队列的头
	public E remove() {
		E o = element();
		elementData[head++] = null;
		return o;
	}
	
	//获取但不移除此队列的头
	@SuppressWarnings("unchecked")
	public E element() {
		if (isEmpty()) {
			throw new QueueEmptyException("queue empty!");
		}
		return (E) elementData[head];
	}
	
	//将指定的元素插入此队列（如果立即可行且不会违反容量限制），当使用有容量限制的队列时，此方法通常要优于 add(E)，后者可能无法插入元素，而只是抛出一个异常
	public boolean offer(E e) {
		if (tail == elementData.length) {
			return false;
		}
		elementData[tail++] = e;
		return true;
	}
	
	//获取并移除此队列的头，如果此队列为空，则返回 null
	public E poll() {
		E o = peek();
		if (null != o) {
			elementData[head++] = null;
		}
		return o;
	}
	
	//获取但不移除此队列的头；如果此队列为空，则返回 null
	@SuppressWarnings("unchecked")
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return (E) elementData[head];
	}
	
	//移除此队列中的所有元素
	public void clear() {
		elementData = new Object[elementData.length];
		head = tail = 0;
	}
	
	//元素数
	public int size() {
		return tail - head;
	}
	
	//是否为空
	public boolean isEmpty() {
		return head == tail;
	}
	
}

class QueueEmptyException extends RuntimeException {
	private static final long serialVersionUID = -6193201861977726964L;

	public QueueEmptyException() {
		super();
	}
	
	public QueueEmptyException(String msg) {
		super(msg);
	}
}
