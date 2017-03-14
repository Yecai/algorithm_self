package queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * FIFO（先进先出）队列
 * 
 * @author panhuaxiong
 *
 */
public class QueueTest {

	public static void main(String[] args) {
		// testQueue();
		// testQueueByArray();
//		testQueueByArrayCircle();
		testQueueByOfficial();
	}

	private static void testQueueByOfficial() {
		QueueByOfficial<Integer> queue = new QueueByOfficial<Integer>();
		System.out.println("size:" + queue.size());
		System.out.println("offer: 1 10 2 8 11 15 98 56 87 44");
		System.out.println("offer 1:" + queue.offer(1));
		System.out.println("offer 10:" + queue.offer(10));
		System.out.println("offer 2:" + queue.offer(2));
		System.out.println("offer 8:" + queue.offer(8));
		System.out.println("offer 11:" + queue.offer(11));
		System.out.println("offer 15:" + queue.offer(15));
		System.out.println("offer 98:" + queue.offer(98));
		System.out.println("offer 56:" + queue.offer(56));
		System.out.println("offer 87:" + queue.offer(87));
		System.out.println("offer 44:" + queue.offer(44));
		System.out.println("offer 22:" + queue.offer(22));

		System.out.println("peek:" + queue.peek());
		System.out.println("size:" + queue.size());

		System.out.println("poll:" + queue.poll());
		System.out.println("offer 33:" + queue.offer(33));

		System.out.println("peek:" + queue.peek());
		System.out.println("size:" + queue.size());

		System.out.print("poll:");
		for (int i = 0, size = queue.size(); i < size; i++) {
			System.out.print(queue.poll() + " ");
		}
		System.out.println();

		System.out.println("poll:" + queue.poll());
	}

	private static void testQueueByArrayCircle() {
		QueueByArrayCircle<Integer> queue = new QueueByArrayCircle<Integer>();
		System.out.println("empty:" + queue.isEmpty());
		System.out.println("size:" + queue.size());
		System.out.println("offer: 1 10 2 8 11 15 98 56 87 44");
		System.out.println("offer 1:" + queue.offer(1));
		System.out.println("offer 10:" + queue.offer(10));
		System.out.println("offer 2:" + queue.offer(2));
		System.out.println("offer 8:" + queue.offer(8));
		System.out.println("offer 11:" + queue.offer(11));
		System.out.println("offer 15:" + queue.offer(15));
		System.out.println("offer 98:" + queue.offer(98));
		System.out.println("offer 56:" + queue.offer(56));
		System.out.println("offer 87:" + queue.offer(87));
		System.out.println("offer 44:" + queue.offer(44));

		System.out.println("empty:" + queue.isEmpty());
		System.out.println("peek:" + queue.peek());
		System.out.println("size:" + queue.size());

		System.out.println("poll:" + queue.poll());
		System.out.println("offer 33:" + queue.offer(33));

		System.out.println("empty:" + queue.isEmpty());
		System.out.println("peek:" + queue.peek());
		System.out.println("size:" + queue.size());

		System.out.print("poll:");
		for (int i = 0, size = queue.size(); i < size; i++) {
			System.out.print(queue.poll() + " ");
		}
		System.out.println();

		System.out.println("poll:" + queue.poll());
		System.out.println("empty:" + queue.isEmpty());
	}

	private static void testQueue() {
		// Queue<Integer> queue = new ArrayBlockingQueue<Integer>(1);
		// queue.add(1);
		// queue.add(2);

		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
		System.out.println("offer: 1 10 2 8 2");
		queue.offer(1);
		queue.offer(10);
		queue.offer(2);
		queue.offer(8);
		queue.offer(2);

		System.out.println("empty:" + queue.isEmpty());
		System.out.println("size:" + queue.size());
		System.out.println("peek:" + queue.peek());

		System.out.print("poll:");
		for (int i = 0, size = queue.size(); i < size; i++) {
			System.out.print(queue.poll() + " ");
		}
		System.out.println();

		System.out.println("poll:" + queue.poll());
		System.out.println("empty:" + queue.isEmpty());
	}

	private static void testQueueByArray() {
		QueueByArray<Integer> queue = new QueueByArray<Integer>();
		System.out.println("offer: 1 10 2 8 2");
		queue.offer(1);
		queue.offer(10);
		queue.offer(2);
		queue.offer(8);
		queue.offer(2);

		System.out.println("empty:" + queue.isEmpty());
		System.out.println("size:" + queue.size());
		System.out.println("peek:" + queue.peek());

		System.out.print("poll:");
		for (int i = 0, size = queue.size(); i < size; i++) {
			System.out.print(queue.poll() + " ");
		}
		System.out.println();

		System.out.println("poll:" + queue.poll());
		System.out.println("empty:" + queue.isEmpty());
	}
}
