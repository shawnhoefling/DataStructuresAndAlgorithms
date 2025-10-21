import java.util.*;

public class TestSet {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // scanner to take in user input for last step. 

        MySet<Integer> setA = new MySet<>(); // using MySet object to create Set A

        System.out.println("Adding integers to Set A:"); // hard coding the adding to set A with differing integers per instructions.
        setA.add(2);
        setA.add(5);
        setA.add(7);
        setA.add(2);
        setA.add(4);
        setA.add(2);
        setA.add(2);
        setA.add(9);
        setA.add(8);
        setA.add(11);

        System.out.println("Set A: " + setA.toString()); // displaying using toString elements of the set that the user entered 

        setA.remove(2);
        setA.remove(9);
        setA.remove(7);

        System.out.println("Set A with removals: " + setA.toString()); // displaying the updated set with 2, 9, and 7 removed. 

        System.out.println("Enter a number you want to check is or is not in the set: ");  // checking a number a user inputs
        int userNumber = input.nextInt(); // takes in user input


        System.out.println(setA.membership(userNumber)); // compares the user number with the set to see if what they entered is or is not in the set and returns true or false

        input.close(); // closing scanner

        // this section is the extra credit section of the testing
        
/* 
        // two new sets for testing union, intersection, and difference methods
        MySet<Integer> setB = new MySet<>();
        MySet<Integer> setC = new MySet<>();

        System.out.println("Adding integers to set B: ");
        setB.add(4);
        setB.add(7);
        setB.add(9);
        setB.add(11);

        System.out.println("Set B: " + setB.toString()); // displaying set Butilizing toString

        System.out.println("Adding integers to set C: ");
        setC.add(11);
        setC.add(5);
        setC.add(9);
        setC.add(6);

        System.out.println("Set C: " + setC.toString()); // displaying set C utilizing toString

*/

 

        
    }
}
