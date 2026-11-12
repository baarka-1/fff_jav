
public class traverse {
    public static void main(String[] args) {

        node<Integer> head = new node<>(17);
        node<Integer> n2 = new node<>(92);
        node<Integer> n3 = new node<>(63);
        node<Integer> n4 = new node<>(45);

        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        node<Integer> current = head;

        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }
}
