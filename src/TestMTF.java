import java.util.*;

public class TestMTF {
    public static void main(String[] args) {

        MoveToFront<String> mtf = new MoveToFront<>(); // using MoveToFront object to create set of items

        // initalizing the stack
    
        System.out.println("Current stack: " + mtf.toString());
        System.out.println("Adding items to the stack..."); 

        // testing pushing items to the stack

        mtf.push("A");
        mtf.push("B");
        mtf.push("C");
        mtf.push("D");
        mtf.push("E");
        mtf.push("F");

        // displaying current stack (after pushes)

        System.out.println("Current stack: " + mtf.toString());
        
        // popping items from stack

        mtf.pop();
        mtf.pop();

        // displaying current stack (after pops)

        System.out.println("Stack after pop: " + mtf.toString()); // displaying using toString elements of the set that the user entered 
    
        // testing contains method

        System.out.println("Does the stack contain F? = " + mtf.contains("F"));
        System.out.println("Doest the stack contain A? = " + mtf.contains("A"));

        // popping the rest of the list

        System.out.println("Popping the rest of the stack...");

        mtf.pop();
        mtf.pop();
        mtf.pop();
        mtf.pop();

        System.out.println("Is the stack empty? = " + mtf.isEmpty());
        
    }
}
