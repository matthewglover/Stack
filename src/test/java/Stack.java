public class Stack {

    private int size;
    private int value;
    private int[] values = new int[10];

    public int size() {
        return size;
    }

    public void push(int item) {
        values[size] = item;
        value = item;
        size++;
    }

    public int pop() {
        size--;
        return value;
    }

    public int peek() {
        return value;
    }
}
