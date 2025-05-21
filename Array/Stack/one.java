// Java Program Implementing Stack Class
import java.util.Stack;

public class one
{
    public static void main(String[] args) 
    {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Top element: " + s.peek());

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
