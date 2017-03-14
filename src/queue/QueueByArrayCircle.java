package queue;

public class QueueByArrayCircle<E> {

	/** 数据 **/
	private Object elementData[];

	/** 头指针 **/
	private int head;

	/** 尾指针 **/
	private int tail;

	public QueueByArrayCircle() {
		this(10);
	}

	public QueueByArrayCircle(int capacity) {
		this.elementData = new Object[capacity];
		this.head = this.tail = 0;
	}

	/**
	 * 将指定的元素插入到此队列中（如果立即可行且不会违反容量限制），在成功时返回 true，如果当前没有可用空间，则抛出
	 * IllegalStateException
	 */
	public boolean add(E e) {
		if (ifFull()) {
			throw new IllegalStateException("queue full!");
		}
		elementData[tail++] = e;
		if (tail == elementData.length) {
			tail = 0;
		}
		return true;
	}

	// 获取并移除此队列的头
	public E remove() {
		E o = element();
		elementData[head++] = null;
		if (head == elementData.length) {
			head = 0;
		}
		return o;
	}

	// 获取但不移除此队列的头
	@SuppressWarnings("unchecked")
	public E element() {
		if (isEmpty()) {
			throw new QueueEmptyException("queue empty!");
		}
		return (E) elementData[head];
	}

	// 将指定的元素插入此队列（如果立即可行且不会违反容量限制），当使用有容量限制的队列时，此方法通常要优于
	// add(E)，后者可能无法插入元素，而只是抛出一个异常
	public boolean offer(E e) {
		if (ifFull()) {
			return false;
		}
		elementData[tail++] = e;
		if (tail == elementData.length) {
			tail = 0;
		}
		return true;
	}

	// 获取并移除此队列的头，如果此队列为空，则返回 null
	public E poll() {
		E o = peek();
		if (null != o) {
			elementData[head++] = null;
		}
		if (head == elementData.length) {
			head = 0;
		}
		return o;
	}

	// 获取但不移除此队列的头；如果此队列为空，则返回 null
	@SuppressWarnings("unchecked")
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return (E) elementData[head];
	}

	// 移除此队列中的所有元素
	public void clear() {
		elementData = new Object[elementData.length];
		head = tail = 0;
	}

	// 元素数
	public int size() {
		int size = 0;
		if (tail >= head) {
			size = tail - head;
		} else {
			size = elementData.length - head + tail;
		}
		return size;
	}

	// 是否为空
	public boolean isEmpty() {
		return head == tail;
	}

	private boolean ifFull() {
		if (head == 0 && tail == (elementData.length - 1)) {
			return true;
		}
		return tail == (head - 1);
	}

}
