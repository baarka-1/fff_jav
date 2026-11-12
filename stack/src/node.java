
public class node<T> {

    private T element;
    private node<T> next;

    public node(T element) {
        this.element = element;
        next = null;
    }

    public T getElement() {
        return element;
    }

    public node<T> getNext() {
        return next;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }
}
