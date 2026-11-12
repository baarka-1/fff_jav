public class reversedsteps {

    static void print(String label, node<String> head) {
        System.out.print(label);

        node<String> cur = head;

        for (int i = 0; i < 5 && cur != null; i++) {
            System.out.print(cur.getElement() + " -> ");
            cur = cur.getNext();
        }

        System.out.println(cur == null ? "null" : "...");
    }

    public static void main(String[] args) {

        // Correct order
        node<String> head = new node<>("B");
        node<String> newNode = new node<>("A");

        newNode.setNext(head);
        head = newNode;

        print("Correct: ", head);

        // Swapped order
        head = new node<>("B");
        newNode = new node<>("A");

        head = newNode;
        newNode.setNext(head);

        print("Swapped: ", head);
    }
}