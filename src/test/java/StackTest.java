import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }

    @Test
    public void newStackIsEmpty() {
        assertEquals(0, stack.size());
    }

    @Test
    public void pushIncreasesSize() {
        stack.push(1);
        assertEquals(1, stack.size());
    }

    @Test
    public void popDecreasesSize() {
        stack.push(1);
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    public void peekDoesDoesNotDecreaseSize() {
        stack.peek();
        assertEquals(0, stack.size());
    }

    @Test
    public void popReturnsLastPushedValue() {
        stack.push(2);
        assertEquals(2, stack.pop());
    }

    @Test
    public void peekReturnsLastPushedValue() {
        stack.push(2);
        assertEquals(2, stack.peek());
    }

    @Test
    public void popMultipleTimes() {
        stack.push(2);
        stack.push(3);
        stack.pop();
        assertEquals(2, stack.pop());
    }
}
