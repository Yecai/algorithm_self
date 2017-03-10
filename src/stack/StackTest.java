package stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(); //jdk×Ô´øStack
		
		tackTest(stack);
	}

	private static void tackTest(Stack<Integer> stack) {
		System.out.println("push:2 8 2 10 1 ");
		stack.push(1);
		stack.push(10);
		stack.push(2);
		stack.push(8);
		stack.push(2);
//		System.out.println("peek:" + stack.peek());
		System.out.println("search:" + stack.search(2));
		System.out.println("empty:" + stack.empty());
		System.out.println("size:" + stack.size());
		System.out.println("capacity:" + stack.capacity());

		System.out.print("pop:");
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
		
		System.out.println("empty:" + stack.empty());
	}
}
