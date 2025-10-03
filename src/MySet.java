
/*************************************************************************
 *
 *  Pace University
 *  Spring 2024
 *  Data Structures and Algorithms
 *
 *  Course: CS 241
 *  Team authors: PUT THE NAMES OF ALL YOUR TEAM MEMBERS HERE
 *  External Collaborators: PUT THE NAME OF ANY COLLABORATORS OUTSIDE YOUR TEAM HERE, IF NONE, PUT NONE
 *  References: PUT THE LINKS TO YOUR SOURCES HERE
 *
 *  Assignment: PUT THE ASSIGNMENT NUMBER HERE
 *  Problem: PUT THE MAIN PROBLEM NAME HERE
 *  Description: PUT A BRIEF DESCRIPTION HERE
 *
 *  Input:
 *  Output:
 *
 *  Visible data fields:
 *  COPY DECLARATION OF VISIBLE DATA FIELDS HERE
 *
 *  Visible methods:
 *  COPY SIGNATURE OF VISIBLE METHODS HERE
 *
 *
 *   Remarks
 *   -------
 *
 *   PUT ALL NON-CODING ANSWERS HERE
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
}
