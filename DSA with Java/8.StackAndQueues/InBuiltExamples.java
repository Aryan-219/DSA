import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
// import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        // Internally a stack is an array
        // Stack is a class
        // Stack<Integer> stack = new Stack<>();

        // System.out.println("Pushing to the stack");
        // System.out.print(stack.push(34)+ " ");
        // System.out.print(stack.push(35)+ " ");
        // System.out.print(stack.push(36)+ " ");
        // System.out.print(stack.push(37)+ " ");
        // System.out.print(stack.push(38)+ " ");
        // System.out.println(stack.push(39)+ " ");

        // System.out.println("Popping from the stack");
        // System.out.print(stack.pop()+ " ");
        // System.out.print(stack.pop()+ " ");
        // System.out.print(stack.pop()+ " ");
        // System.out.print(stack.pop()+ " ");
        // System.out.print(stack.pop()+ " ");
        // System.out.println(stack.pop()+ " ");

        // Internally the queue is a linked list.
        // Queue is an interface
        // Queue<Integer> queue = new LinkedList<>();
        // System.out.println(queue.add(34));
        // System.out.println(queue.add(36));
        // System.out.println(queue.add(346));
        // // System.out.println(queue.peek());
        // // System.out.println(queue.peek());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.peek());
        // System.out.println(queue.remove());

        Deque deck = new LinkedList<>();
        deck.add(1);
        deck.add(2);
        deck.add(3);
        deck.addFirst(45);
        deck.addFirst(46);
        deck.addFirst(47);
        deck.addLast(67);
        deck.addLast(68);
        deck.addLast(69);

        // O/P : 47,46,45,1,2,3,67,68,69
        // System.out.println(deck.poll());
        // System.out.println(deck.poll());
        // System.out.println(deck.poll());
        // System.out.println(deck.poll());
        // System.out.println(deck.poll());
        // System.out.println(deck.poll());
        // System.out.println(deck.poll());
        // System.out.println(deck.poll());
        // System.out.println(deck.poll());

        // System.out.println("PollFirst: " + deck.pollFirst());
        // System.out.println("PollFirst: " + deck.pollFirst());
        // System.out.println("PollFirst: " + deck.pollFirst());
        // System.out.println("PollLast: " + deck.pollLast());
        // System.out.println("PollLast: " + deck.pollLast());
        // System.out.println("PollLast: " + deck.pollLast());
        // System.out.println(deck.poll());
        // System.out.println(deck.poll());
        // System.out.println(deck.poll());

        System.out.println(deck.peek());
        System.out.println(deck.peekFirst());
        System.out.println(deck.peekLast());

        Deque deque = new ArrayDeque<>();
        System.out.println(deque.size());
    }
}
