
public class linkedstacktrce {
    public static void main(String[] args) {

        linkedstack<String> s = new linkedstack<>();

        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println("size: " + s.size());

        System.out.println("peek: " + s.peek());

        System.out.println("pop: " + s.pop());

        System.out.println("size: " + s.size());

        System.out.println("peek: " + s.peek());
    }
}
