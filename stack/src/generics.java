 import java.util.Stack;


public class generics {
    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<>();

        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println("Original Stack: " + s1);

        int top = s1.peek();
        System.out.println("Top element: " + top);

        System.out.println("Stack after peek: " + s1);

        int out = s1.pop();
        System.out.println("Removed element: " + out);

        System.out.println("Stack after pop: " + s1);
    }
}

