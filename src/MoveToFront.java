
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
    private ArrayList<T> myList; // declartaion of Arraylist myList
    
    // constructors
    MoveToFront(){
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
}

