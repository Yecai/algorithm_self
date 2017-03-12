package stack;

public class StackTest {

	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<Integer>(); //jdk自带Stack
		StackByArray2<Integer> stack = new StackByArray2<Integer>();
		tackTest(stack);
	}

//	private static void tackTest(Stack<Integer> stack) {
	private static void tackTest(StackByArray2<Integer> stack) {
		System.out.println("push:1 10 2 8 2 20 19 22 100 103 109");
		stack.push(1);
		stack.push(10);
		stack.push(2);
		stack.push(8);
		stack.push(2);
		stack.push(20);
		stack.push(19);
		stack.push(22);
		stack.push(100);
		stack.push(103);
		stack.push(109);
		System.out.println("peek:" + stack.peek());
		System.out.println("search:" + stack.search(8));
		System.out.println("empty:" + stack.empty());
		System.out.println("size:" + stack.size());
		System.out.println("capacity:" + stack.capacity());

		System.out.print("pop:");
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
		
		System.out.println("empty:" + stack.empty());
		System.out.println("capacity:" + stack.capacity());
	}
}
