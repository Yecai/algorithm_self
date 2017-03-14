package queue;

import java.util.NoSuchElementException;

public class QueueByOfficial<E> {

	/** 数据 **/
	final Object items[];

	/** 数据存放指针 **/
	int putIndex;

	/** 数据获取指针 **/
	int takeIndex;
	
	/** 个数 **/
	int count;

	public QueueByOfficial() {
		this(10);
	}

	public QueueByOfficial(int capacity) {
		this.items = new Object[capacity];
	}

	/**
	 * 将指定的元素插入到此队列中（如果立即可行且不会违反容量限制），在成功时返回 true，如果当前没有可用空间，则抛出
	 * IllegalStateException
	 */
	public boolean add(E e) {
		if (offer(e)) {
			return true;
		} else {
			throw new IllegalStateException("Queue full!");
		}
	}

	/**
	 * 空判断
	 */
	private void checkNotNulll(E e) {
		if (null == e) {
			throw new NullPointerException();
		}
	}

	/**
	 * 获取并移除此队列的头
	 */
	public E remove() {
		E e = poll();
		if (null != e) {
			return e;
		} else {
			throw new NoSuchElementException();
		}
	}

	/**
	 * 获取但不移除此队列的头
	 */
	public E element() {
		E e = peek();
		if (null != e) {
			return e;
		} else {
			throw new NoSuchElementException();
		}
	}

	/**
	 * 将指定的元素插入此队列（如果立即可行且不会违反容量限制），当使用有容量限制的队列时，此方法通常要优于
	 * add(E)，后者可能无法插入元素，而只是抛出一个异常
	 */
	public boolean offer(E e) {
		checkNotNulll(e);
		if (count == items.length) {
			return false;
		}
		enqueue(e);
		return true;
	}

	/**
	 * 入队
	 */
	private void enqueue(E e) {
		final Object[] items = this.items;
		items[putIndex] = e;
		if (++putIndex == items.length) {
			putIndex = 0;
		}
		count++;
	}

	/**
	 * 获取并移除此队列的头，如果此队列为空，则返回 null
	 */
	public E poll() {
		return count == 0 ? null : dequeue();
	}

	/**
	 * 出队
	 */
	private E dequeue() {
		final Object[] items = this.items;
		@SuppressWarnings("unchecked")
		E e = (E) items[takeIndex];
		items[takeIndex] = null;
		if (++takeIndex == items.length) {
			takeIndex = 0;
		}
		count--;
		return e;
	}

	/**
	 * 获取但不移除此队列的头；如果此队列为空，则返回 null
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public E peek() {
		return (E) items[takeIndex];
	}

	/**
	 * 移除此队列中的所有元素
	 */
	public void clear() {
		int k = count;
		if (k > 0) {
			final int putIndex = this.putIndex;
			int i = takeIndex;
			do {
				items[i] = null;
				if (++i == items.length) {
					i = 0;
				}
			} while (i != putIndex);
			takeIndex = putIndex;
			count = 0;
		}
	}

	/**
	 * 元素数
	 */
	public int size() {
		return count;
	}

}
