import java.util.Stack;

public class QueueUsingStackRemoveEfficient {
    private Stack<Integer> primary = new Stack<>();
    private Stack<Integer> helper = new Stack<>();

    QueueUsingStackRemoveEfficient() {
        // Constructor to initialize both stacks
        primary = new Stack<>();
        helper = new Stack<>();
    }

    // Method to add an element to the queue
    public void add (int item)throws Exception {
        while (!primary.isEmpty()) {
            helper.push(primary.pop());
        }
        primary.push(item);
        while (!helper.isEmpty()) {
            primary.push(helper.pop());
        }
    }

    public int remove()  {
        return primary.pop();
    }

    public int peek()  {
        return primary.peek();
    }

    public boolean isEmpty() {
        return primary.isEmpty();
    }
}