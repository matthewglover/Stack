public class Stack {

    private int size;
    private int value;
    private int[] values = new int[10];

    public int size() {
        return size;
    }

    public void push(int item) {
        values[size++] = item;
        value = item;
    }

    public int pop() {
        return values[--size];
    }

    public int peek() {
        return value;
    }
}
