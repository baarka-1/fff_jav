
import java.util.Arrays;
import java.util.EmptyStackException;

public class arraystacktrace<T> {

    private final static int DEFAULT_CAPACITY = 2;

    private int top;
    private T[] stack;

    public arraystacktrace() {
        this(DEFAULT_CAPACITY);
    }

    public arraystacktrace(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }

        stack[top] = element;
        top++;
    }

    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        top--;

        T result = stack[top];
        stack[top] = null;

        return result;
    }

    public T peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int capacity() {
        return stack.length;
    }

    public static void main(String[] args) {

        arraystack<Integer> s = new arraystack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Size: " + s.size());
        System.out.println("Capacity: " + s.capacity());
        System.out.println("Peek: " + s.peek());
        System.out.println("Pop: " + s.pop());
        System.out.println("New Peek: " + s.peek());
        System.out.println("Is Empty: " + s.isEmpty());
    }
}
