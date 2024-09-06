import java.util.Stack;

public class QueueUsingStackInsertEfficient {
    private Stack<Integer> primary = new Stack<>();
    private Stack<Integer> helper = new Stack<>();

    QueueUsingStackInsertEfficient() {
        // Constructor to initialize both stacks
        primary = new Stack<>();
        helper = new Stack<>();
    }

    // Method to add an element to the queue
    public void add(int item) {
        primary.push(item);
    }

    public int remove() throws Exception {
        while (!primary.isEmpty()) {
            helper.push(primary.pop());
        }
        int removed = helper.pop();
        while (!helper.isEmpty()) {
            primary.push(helper.pop());
        }
        return removed;
    }

    public int peek() throws Exception {
        while (!primary.isEmpty()) {
            helper.push(primary.pop());
        }
        int peeked = helper.peek();
        while (!helper.isEmpty()) {
            primary.push(helper.pop());
        }
        return peeked;
    }

    public boolean isEmpty() {
        return primary.isEmpty();
    }
}