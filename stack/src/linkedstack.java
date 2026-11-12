
import java.util.EmptyStackException;

public class linkedstack<T> {

    private int count;
    private node<T> top;

    public linkedstack() {
        count = 0;
        top = null;
    }

    public void push(T element) {
        node<T> temp = new node<>(element);

        temp.setNext(top);
        top = temp;

        count++;
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T result = top.getElement();

        top = top.getNext();

        count--;

        return result;
    }

    public T peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.getElement();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {

        linkedstack<Integer> s = new linkedstack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack Size: " + s.size());
        System.out.println("Top Element: " + s.peek());

        System.out.println("Pop: " + s.pop());

        System.out.println("New Top: " + s.peek());
        System.out.println("Stack Size: " + s.size());
        System.out.println("Is Empty: " + s.isEmpty());
    }
}
