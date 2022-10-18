package Stack;

/**
 * Created by velfor on 18.10.2022.
 */
public class TestStack {

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println("The top element is " + stack.peek());

        System.out.println("Removing " + stack.pop());
        System.out.println("Removing " + stack.pop());
        System.out.println("Removing " + stack.pop());
        try{
            System.out.println("Removing " + stack.pop());
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }

        /*Stack<String> stack = new Stack<String>();

        stack.push("111");
        stack.push("222");
        stack.push("333");
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();*/
    }
}
