public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
}
