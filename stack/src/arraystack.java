
import java.util.Arrays;
import java.util.EmptyStackException;

public class arraystack<T> {

    private final static int DEFAULT_CAPACITY = 2;

    private int top;
    private T[] stack;

    public arraystack() {
        this(DEFAULT_CAPACITY);
    }

    public arraystack(int initialCapacity) {
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

        arraystack<Integer> stack = new arraystack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Size: " + stack.size());
        System.out.println("Capacity: " + stack.capacity());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek after pop: " + stack.peek());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
