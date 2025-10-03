
/*************************************************************************
 *
 *  Pace University
 *  Spring 2025
 *  Data Structures and Algorithms
 *
 *  Course: CS 241
 *  Team authors: Shawn Hoefling
 *  External Collaborators: NONE
 *  References: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#ArrayList--
 *              https://www.freecodecamp.org/news/big-o-cheat-sheet-time-complexity-chart/
 *              https://www.youtube.com/watch?v=D6xkbGLQesk&t=1453s
 *              https://www.youtube.com/watch?v=H9vc4gTtGGA
 *              
 *
 *  Assignment: 1
 *  Problem: none
 *  Description: this program takes a set of integers from a user, and manipulates the final set depending on the methods used
 *
 *  Input: integers
 *  Output: a completed, manipulated set of integers. 
 *
 *  Visible data fields:
 *  private ArrayList<T> myList;
 *
 *  Visible methods:
 *  MySet(){
 *  public void add(T item){
 *  public void remove(T item){
 *  public Boolean membership(T item){
 *  public String toString(){
 *  
 *
 *   Remarks
 *   -------
 *   I kept the stucture of my extra credit in the code just to show my thought process behind it. I wasn't entirely sure about the implementation. 
 *   The concept makes senese, I understand i would compare the current set to a new set, and i could use the add, remove, membership, and toString methods
 *   in order calculate union, intersection, and the difference. 
 *
 *   BIG O Running Times (arraylist)
 *   add: O(N) 
 *   remove: O(N)
 *   membership:O(N)
 *   toString: O(N)
 * 
 * 
 *   BIG O Running Times (linkedlist)
 *   add: O(N)
 *   remove: O(N)
 *   membership:O(N)
 *   toString: O(N)
 *
 *  
 *  Add is O(N) because in the if section when checking with the membership method, it has to navigate through the entire list to check if it is a duplicate which is O(N). 
 *  the add(item) is O(1) because it simply adds items to the END of the list. 
 * 
 *  Remove is O(N) because again the if section requires navigating through entire list. the remove part is also O(N) because it has to remove and shift the elements.
 *  it is not O(N^2) because there is no nesting.
 * 
 *  Membership is O(N) because it has to navigate the entire list before the return call. 
 * 
 *  ToString is O(N) because it has to build the entire array depending on the number of elements in the list. 
 * 
 * 
 *  For linkedlists, the running times remain the same because the core structure of the code is dominated by the time complexity of the membership searching through the list
 *  which is O(N). The only time it would be faster would be during the myList.remove(item) under the remove mehtod, because that would be O(1) because no shift is required.
 *  But again, no change as it is dominated by the O(N).
 * 
 * 
 *************************************************************************/

import java.util.*;

public class MySet<T>{
    //data fields
    private ArrayList<T> myList; // declartaion of Arraylist myList
    
    // constructors
    MySet(){
        this.myList = new ArrayList<T>(); // initialization of ArrayList myList
        
    }
    // other methods
    public void add(T item){
        if (!membership(item)) { // if the item is not already in the list, then add it
            myList.add(item);
        }
    }
    public void remove(T item){
        if (membership(item)) { // if membership == true, call arraylist remove method 
            myList.remove(item);
        }
    }
    public Boolean membership(T item){
        return myList.contains(item); // if the list contains the item return true, if not false. uses contain from the arraylist methods
    }
    public String toString(){
        return myList.toString(); // returns a string with the list of elements.
    }

/* 
    // static methods for extra credit
    public static <T> MySet<T> union(MySet<T> SetB, MySet<T> SetC) { // if a = 12 and b = 23 then 1,2,3. maybe parameter is Set B and Set C comma in between or such
        // have to show only things that are in both sets. 
        // if not static utlize MySet<T> union (MySet<T> setB (other)) note, setb not setc as we are using the original set to compare
         

    }

    public void intersection (T item) { // if a is 123 and b is 234 then 2,3 cause 2 nd 3 are only elemnts in both
        // use membership to return only things that are duplicates of both

    }

    public void difference (T item) { // set of all elements in a but not b if a = 123, and b = 345 then 1,2 becasue 1 2 are in a but not b
        // perhaps again utilize membership 
    }


*/

}
