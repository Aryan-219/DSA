public class DynamicStack extends CustomStack{
    // private int[] data;
    // private static final int DEFAULT_SIZE = 10;
    // int ip = -1;

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    // This is my implementation (raw)
    // public boolean push(int item) {
    // if (isFull()) {
    // int[] temp = new int[data.length * 2];
    // int tempPtr = -1;
    // for (int i = 0; i < data.length; i++) {
    // tempPtr++;
    // temp[tempPtr] = data[i];
    // }
    // ip = tempPtr;
    // data = temp;
    // ip++;
    // data[ip] = item;
    // // System.out.println("Stack is full");
    // return true;
    // }
    // ip++;
    // data[ip] = item;
    // return true;
    // }


    // public int pop() throws StackException {
    //     if (isEmpty()) {
    //         throw new StackException("Stack is already empty");
    //     }
    //     // int removed = data[ip];
    //     // data[ip]=0;
    //     // ip--;
    //     // return removed;

    //     return data[ip--];
    // }

    // public int peek() throws StackException {
    //     if (isEmpty()) {
    //         throw new StackException("Stack is empty");
    //     }
    //     return data[ip];
    // }

    // private boolean isFull() {
    //     if (ip == data.length - 1) {
    //         return true;
    //     }
    //     return false;
    // }

    // private boolean isEmpty() {
    //     if (ip == -1) {
    //         return true;
    //     }
    //     return false;
    // }

    
    // Following is the optimized implementation
    public boolean push(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {

                temp[i] = data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}
