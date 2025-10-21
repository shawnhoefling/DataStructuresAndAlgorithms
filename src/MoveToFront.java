
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
    MoveToFront(){
        this.myList = new LinkedList<T>(); // initialization of LinkedList myList
    }

    // other methods

    public void push(T item){ // add item to list, if list contains item, pop it
        if (!contains(item)) { // if the list does NOT contain item, push it
            myList.push(item);
        }
        else {
            myList.pop(); // this will pop or "remove" it from the list, if there are previous occurences 
        }
    }

    public void pop(T item){ // removes last pushed item
        if (!myList.isEmpty()) { // if the list is not empty at the top, pop it
            myList.pop(); // see about having a counter for the top of stack, or look into finding top of stack. maybe two stacks.
        }
        else {

        }
    }

    public Boolean contains(T item){ // if the list contains the integer, returns true, if not false.
        return myList.contains(item); 
    }

    public Boolean isEmpty(){ // checks if list is empty,or not
        return myList.isEmpty();   
    }

     public String toString(){
        return myList.toString(); // returns a string with the list of elements.
    }
}

// rework pop, if myList.size() > 0 or just use