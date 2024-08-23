public class CustomStack {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ip = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ip++;
        data[ip] = item;
        return true;
    }

    public int pop()throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is already empty");
        }
        // int removed = data[ip];
        // data[ip]=0;
        // ip--;
        // return removed;

        return data[ip--];
    }

    public int peek()throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return data[ip];
    }
    public boolean isFull() {
        if (ip == data.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (ip == -1) {
            return true;
        }
        return false;
    }
}