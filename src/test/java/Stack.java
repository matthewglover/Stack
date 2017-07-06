public class Stack {

    private int size;
    private int value;

    public int size() {
        return size;
    }

    public void push(int item) {
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
