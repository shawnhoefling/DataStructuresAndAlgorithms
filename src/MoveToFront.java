
/*************************************************************************
 *
 *  Pace University
 *  Spring 2025
 *  Data Structures and Algorithms
 *
 *  Course: CS 241
 *  Team authors: Shawn Hoefling
 *  External Collaborators: NONE
 *  References: 
 *              
 *
 *  Assignment: 2
 *  Problem: none
 *  Description: 
 *
 *  Input: integers
 *  Output: a completed, manipulated set of integers. 
 *
 *  Visible data fields: (REPLACE)
 *  private ArrayList<T> myList;
 *
 *  Visible methods: (REPLACE)
 *  MySet(){
 *  public void add(T item){
 *  public void remove(T item){
 *  public Boolean membership(T item){
 *  public String toString(){
 *  
 *
 *   Remarks
 *   -------
 *   
 *
 *   BIG O Running Times (arraylist)
 *   add: 
 *   remove: 
 *   membership:
 *   toString: 
 * 
 * 
 *   BIG O Running Times (linkedlist)
 *   add: 
 *   remove: 
 *   membership:
 *   toString:
 *
 *  
 *  
 * 
 * 
 *************************************************************************/

import java.util.*;

public class MoveToFront<T>{
    //data fields
    private LinkedList<T> myList; // declartaion of LinkedList called myList 
    
    // constructors

    // TODO: Double check implementation of linked list, especially in comparison to array lists. 

    MoveToFront(){
        this.myList = new LinkedList<T>(); // initialization of LinkedList myList
    }

    // other methods

    // TODO: Double check Pop method, ensure this is giving correct output.

    /**
     * @param item
     */
    public void push(T item){ // add item to list, if list contains item, pop it
        if (myList.contains(item)) { // if the list does contain item, remove (or pop) it
            myList.remove(item);
        }
        
        myList.push(item);  // if list doesnt contain item, pushes it to stack
        
    }

    // TODO: rework Pop, it needs to remove from the last element added. think in terms of stacks!!

    public T pop(){ // removes last pushed item
        /* 
        if (myList.isEmpty()) { // if the list is empty
            myList.pop(); // see if a return statemnet would be more fitting here
        } else {
            myList.pop();
        }
            */
        return myList.pop();
    }

    public Boolean contains(T item){ // if the list contains the item, returns true, if not false.
        return myList.contains(item); 
    }

    public Boolean isEmpty(){ // checks if list is empty,or not
        return myList.isEmpty();   
    }

    @Override
     public String toString(){
        return myList.toString(); // returns a string with the list of elements.
    }
}

// rework pop, if myList.size() > 0 or just use